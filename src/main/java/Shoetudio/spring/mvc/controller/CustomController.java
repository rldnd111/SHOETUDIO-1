package Shoetudio.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomController {

    @GetMapping("/custom/customize")
    public String customize() {
        return "customize";
    }

    @GetMapping("/custom/list")
    public String list() {
        return "list";
    }

    @GetMapping("/custom/view")
    public String view() {
        return "view";
    }
}
