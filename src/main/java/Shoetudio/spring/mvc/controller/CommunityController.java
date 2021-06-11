package Shoetudio.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommunityController {

    @GetMapping("/community/list")
    public String list() {
        return "list";
    }

    @GetMapping("/community/view")
    public String view() {
        return "view";
    }

    @GetMapping("/community/write")
    public String write() {
        return "write";
    }
}
