package name.wilu.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by PLPIWIL2 on 8/30/2014.
 */
@Controller
public class HotelWelcomeMessenger {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("message","A massage from HotelWelcomeMessenger: Hello! ");
        return "hello";
    }

}
