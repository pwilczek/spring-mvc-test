package name.wilu.spring.view;

/**
 * Created by PLPIWIL2 on 9/1/2014.
 */

public class View {

    private static final String suffix = ".html";
    private String name;

    public static View of(String name) {
        View view = new View();
        view.name = name;
        return view;
    }

    public String go() {
        return name;
    }

    public String forward() {
        return "forward:" + go() + suffix;
    }

    public String redirect() {
        return "redirect:" + go() + suffix;
    }

}
