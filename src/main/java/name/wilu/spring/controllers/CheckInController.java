package name.wilu.spring.controllers;

import name.wilu.spring.model.Guest;
import name.wilu.spring.model.Hotel;
import name.wilu.spring.view.Views;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by PLPIWIL2 on 8/31/2014.
 */
@Controller
public class CheckInController {

    //TODO: move to service
    private Hotel star = Hotel.withCapacity(5);

    @RequestMapping("/checkIn")
    public String checkIn(@ModelAttribute("guest") Guest guest) {
        star.checkIn(guest);
        return Views.CheckIn.view().go();
    }
}
