package pl.knadif.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = "/hello")
    public String home(){
        return "Hello World";
    }
}
