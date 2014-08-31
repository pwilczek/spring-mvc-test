package name.wilu.spring.model;

import org.junit.Test;

/**
 * Created by PLPIWIL2 on 8/31/2014.
 */
public class HotelTest {

    @Test(expected = IllegalStateException.class)
    public void shouldNotAllowNegativeCapacity(){
        Hotel hotel=new Hotel(-1);
    }
}
