package name.wilu.spring.model;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

/**
 * Created by PLPIWIL2 on 8/31/2014.
 */
public class Hotel {

    @Range(min = 1, max = 120, message = "Hotel capacity must be between 1 and 120!")
    private final int capacity;
    @NotBlank(message = "Hotel name cannot be blank!")
    private final String name;
    //
    private final List<Guest> guests;

    public void checkIn(Guest guest) {
        Preconditions.checkArgument(guests.size() < capacity, "Hotel capacity exceeded!");
        System.out.println("A new guest has been checked in: " + guest);
        guests.add(guest);
    }

    public String getGuests() {
        return Joiner.on(" ").join(guests);
    }

    public static Builder prepare() {
        return new Builder();
    }

    private Hotel(int capacity, String name) {
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
