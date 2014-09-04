package name.wilu.spring.repository;

import name.wilu.spring.model.Hotel;
import org.springframework.stereotype.Repository;

/**
 * Created by PLPIWIL2 on 9/4/2014.
 */

@Repository
public class HotelRepository {
    public Hotel findByName(String name) {
        return Hotel.prepare().withCapacity(5).withName(name).create();
    }
}
