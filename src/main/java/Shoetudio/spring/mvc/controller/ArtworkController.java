package Shoetudio.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArtworkController {

    @GetMapping("/artwork/list")
    public String list() {
        return "artwork/list";
    }

    @GetMapping("/artwork/contact")
    public String contact() {
        return "artwork/contact";
    }

    @GetMapping("/artwork/view")
    public String view() {
        return "artwork/view";
    }


}
