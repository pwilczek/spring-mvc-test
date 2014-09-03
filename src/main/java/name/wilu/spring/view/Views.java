package name.wilu.spring.view;

/**
 * Created by PLPIWIL2 on 9/1/2014.
 */
public enum Views {

    CheckIn(View.of("checkIn"));
    private final View view;

    private Views(View view) {
        this.view = view;
    }

    public View view(){
        return this.view;
    }
}
