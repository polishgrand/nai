package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleController {

    @RequestMapping("/simpleview")
    public String simple(@RequestParam(value="date", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "simpleview";
    }
}
