package name.wilu.spring.model;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PLPIWIL2 on 8/31/2014.
 */
public class Hotel {

    private final int capacity;
    private final List<Guest> guests;
    private final String name;

    public boolean checkIn(Guest guest) {
        Preconditions.checkArgument(guests.size() < capacity, "Hotel capacity exceeded!");
        if (guest.isNotEmpty()) {
            System.out.println("A new guest has been checked in: " + guest);
            return guests.add(guest);
        } else {
            System.out.println("Got empty guest - skipping!");
            return false;
        }
    }

    public String getGuests() {
        return Joiner.on(" ").join(guests);
    }

    public static Builder prepare(){
        return new Builder();
    }

    private Hotel(int capacity, String name) {
        Preconditions.checkArgument(capacity >= 0, "Hotel "+name+" capacity cannot be negative!");
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList(capacity);
    }


    public static class Builder {
        private int capacity = 1;
        private String name = "none";

        public Builder withCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Hotel create() {
            return new Hotel(capacity, name);
        }
    }
}
