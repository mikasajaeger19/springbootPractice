package mysqltest.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class LoginController {
    
    @GetMapping("/")
    public String home() {
        return "hello";
    }
    
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
