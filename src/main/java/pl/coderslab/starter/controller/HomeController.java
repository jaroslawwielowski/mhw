package pl.coderslab.starter.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.util.WebUtils;
import pl.coderslab.starter.edtityes.User;
import pl.coderslab.starter.repository.UserRepository;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@SessionAttributes({"online", "max"})
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class HomeController {

    private final UserRepository userRepository;

    public HomeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String home(HttpServletRequest request, Model model){
        Cookie c = WebUtils.getCookie(request, "cookieUser");
        User user = new User();
        user= userRepository.getUserByConfirmationOnlineId(c.getValue());
        if (user!=null) {
            if (user.isOnline()) {
                String message = " jests już zalogowany/a " + user.getFirstName();
                model.addAttribute( "message" , message);
                model.addAttribute("user", user);
                return "piece/FirstUserPlace";
            }
        }
        return "index";
    }


    @PostMapping("/")
    public String home1(@PathVariable String message, Model model, HttpServletRequest request){
        Cookie c = WebUtils.getCookie(request, "cookieUser");
        User user = new User();
        user= userRepository.getUserByConfirmationOnlineId(c.getValue());
        if (user!=null) {
            if (user.isOnline()) {
                return "piece/FirstUserPlace";
            }
        }
        model.addAttribute("message" , message);
        return "index";
    }
}
