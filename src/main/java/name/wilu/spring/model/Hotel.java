package name.wilu.spring.model;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PLPIWIL2 on 8/31/2014.
 */
public class Hotel {

    private final int capacity;
    private final List<Guest> guests;

    public static Hotel withCapacity(int capacity){
        return new Hotel(capacity);
    }


    private Hotel(int capacity) {
        Preconditions.checkArgument(capacity >= 0, "Hotel capacity cannot be negative!");
        this.capacity = capacity;
        this.guests=new ArrayList<Guest>(capacity);
    }

    public void checkIn(Guest guest){
        Preconditions.checkArgument(guests.size()<capacity,"Hotel capacity exceeded!");
        guests.add(guest);
    }

}
