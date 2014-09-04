package name.wilu.spring.model;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by PLPIWIL2 on 8/31/2014.
 */
public class Guest {

    @NotBlank(message = "Guest name cannot be blank!")
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

}
