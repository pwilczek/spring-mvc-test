package name.wilu.spring.model;

import org.junit.Test;

/**
 * Created by PLPIWIL2 on 8/31/2014.
 */
public class HotelTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowNegativeCapacity() {
        Hotel hotel = Hotel.withCapacity(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowExceedCapacity() {
        Hotel hotel = Hotel.withCapacity(1);
        Guest first = new Guest();
        Guest second = new Guest();
        hotel.checkIn(first);
        hotel.checkIn(second);
    }
}
