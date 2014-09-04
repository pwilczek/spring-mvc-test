package name.wilu.spring.repository;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import name.wilu.spring.model.Hotel;
import name.wilu.spring.model.Room;
import name.wilu.spring.model.Standard;
import org.springframework.stereotype.Repository;

/**
 * Created by PLPIWIL2 on 9/4/2014.
 */

@Repository
public class HotelRepository {
    public Hotel findByName(String name) {
        return Hotel.prepare().withCapacity(5).withName(name).create();
    }

    public List<Room>availableRoomsFor(String hotelName){
        System.out.println("Looking available rooms in "+hotelName);
        List<Room>result=new ArrayList<Room>();
        for (int i = 0; i < 5; i++) {
            result.add(Room.withBeds(fakeRooms()).standard(fakeStandard()));
        }
        return result;
    }

    private Standard fakeStandard() {
        return ImmutableList.of(Standard.Low, Standard.Medium, Standard.Low).get(randBetween(0,3));
    }

    private int fakeRooms() {
        return randBetween(1,5);
    }

    private int randBetween(int min, int max){
        return (int)(min + Math.random()*max);
    }
}
