package name.wilu.spring.view;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by PLPIWIL2 on 9/1/2014.
 */
public class ViewTest {

    View view = View.of("test");

    @Test
    public void shouldNavigateToHtml() {
        Assert.assertThat(view.go(), Matchers.equalTo("test"));
    }

    @Test
    public void shouldForwardToHtml() {
        Assert.assertThat(view.forward(), Matchers.equalTo("forward:test.html"));
    }

    @Test
    public void shouldRedirectToHtml() {
        Assert.assertThat(view.redirect(), Matchers.equalTo("redirect:test.html"));
    }

}
