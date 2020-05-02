package info.zdziech.webstore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
    public class HomeController {
        @RequestMapping("/")
        public String welcome( Model model) {
            model.addAttribute("greeting", "Największy wybór produktów!");
            return "index";
        }
    @RequestMapping("/index")
    public String greeting() {
        return "redirect:/";
    }
}

