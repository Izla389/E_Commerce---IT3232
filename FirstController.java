package vau.ac.lk.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @GetMapping("/welcome2")
    public String welcome2 (@RequestParam String name){
        return "welcome2" + name;
    }
}
