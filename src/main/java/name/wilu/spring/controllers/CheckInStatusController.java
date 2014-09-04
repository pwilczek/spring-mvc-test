package name.wilu.spring.controllers;

import name.wilu.spring.model.Hotel;
import name.wilu.spring.view.Views;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by PLPIWIL2 on 9/4/2014.
 */

@Controller
public class CheckInStatusController {

    @RequestMapping(value = "/checkinStatus", method = RequestMethod.GET)
    public String checkInStatus(Model model) {
        return Views.CheckInStatus.view().go();
    }

    @RequestMapping(value = "/checkinStatus", method = RequestMethod.POST)
    public String back() {
        return Views.CheckIn.view().redirect();
    }

}
