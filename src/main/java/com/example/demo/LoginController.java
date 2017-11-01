package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lyz
 * @date 2017-10-17
 */
@Controller
public class LoginController {


    @RequestMapping("index")
    public String index(Model model){
        model.addAttribute("user",new UserEntity());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute(value = "user") UserEntity user){
        return user.toString();
    }

}
