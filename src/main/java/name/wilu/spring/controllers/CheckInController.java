package name.wilu.spring.controllers;

import name.wilu.spring.model.Guest;
import name.wilu.spring.model.Hotel;
import name.wilu.spring.repository.HotelRepository;
import name.wilu.spring.view.Views;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by PLPIWIL2 on 8/31/2014.
 */
@Controller
@SessionAttributes("hotel")
public class CheckInController {

    @Autowired
    HotelRepository hotelRepository;

    @RequestMapping(value = "/checkIn", method = RequestMethod.GET)
    public String checkInGet(@ModelAttribute("guest") Guest guest, Model model) {
        if (!model.containsAttribute("hotel")) {
            model.addAttribute("hotel", hotelRepository.findByName("ROYAL"));
        }
        return Views.CheckIn.view().go();
    }

    @RequestMapping(value = "/checkIn", method = RequestMethod.POST)
    public String checkInPost(@Validated @ModelAttribute("guest") Guest guest, BindingResult forGuest,
                              @Validated @ModelAttribute("hotel") Hotel hotel, BindingResult forHotel) {
        if (forGuest.hasErrors() || forHotel.hasErrors()) {
            return Views.CheckIn.view().go();
        }
        hotel.checkIn(guest);
        return Views.CheckInStatus.view().redirect();
    }

}
