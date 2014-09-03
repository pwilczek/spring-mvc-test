package name.wilu.spring.model;

/**
 * Created by PLPIWIL2 on 8/31/2014.
 */
public class Guest {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }

    public boolean isNotEmpty() {
        return name!=null && !name.isEmpty();
    }
}
