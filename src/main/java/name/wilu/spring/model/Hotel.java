package name.wilu.spring.model;

import com.google.common.base.Preconditions;

/**
 * Created by PLPIWIL2 on 8/31/2014.
 */
public class Hotel {

    private int capacity;

    public Hotel(int capacity) {
        Preconditions.checkState(capacity>=0,"Hotel capacity cannot be negative!");
        this.capacity = capacity;
    }
}
