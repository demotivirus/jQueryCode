package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/ajax")
public class AjaxController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "ajax/greeting";
    }

    @GetMapping({"/", "/index"})
    public String index(){
        return "ajax/index";
    }

    @GetMapping("/get_time")
    @ResponseBody
    public String getServerTime(){
        Date date = new Date();
        return date.toString();
    }

    @GetMapping("/example_01")
    public String example_01(){
        return "ajax/Example_01";
    }

    @GetMapping("/example_02")
    public String example_02(){
        return "ajax/Example_02";
    }

    @GetMapping("/example_03")
    public String example_03(){
        return "ajax/Example_03";
    }

    @GetMapping("/example_04")
    public String example_04(){
        return "ajax/Example_04";
    }

    @GetMapping("/example_05")
    public String example_05(){
        return "ajax/Example_05";
    }
}
