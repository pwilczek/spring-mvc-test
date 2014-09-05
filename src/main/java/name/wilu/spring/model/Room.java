package name.wilu.spring.model;

/**
 * Created by PLPIWIL2 on 9/4/2014.
 */
public class Room{

    private final int beds;
    private Standard standard=Standard.Medium;

    public static Room withBeds(Integer beds){
        return new Room(beds);
    }

    public Room standard(Standard standard){
        this.standard=standard;
        return this;
    }


    private Room(int beds) {
        this.beds = beds;
    }

    public int getBeds() {
        return beds;
    }

    public Standard getStandard() {
        return standard;
    }
}
