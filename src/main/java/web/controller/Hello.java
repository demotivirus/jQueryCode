package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Controller
public class Hello {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/")
    public String example_01(){
        return "ajax/Example_01";
    }

    @GetMapping("/get_time")
    @ResponseBody
    public String getServerTime(){
        Date date = new Date();
        return date.toString();
    }

    @GetMapping("/home")
    public String homePage(){
        return "ajax/home";
    }

    @GetMapping("/example_02")
    public String example_02(){
        return "ajax/Example_02";
    }
}
