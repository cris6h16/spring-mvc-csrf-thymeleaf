package com.example.springcsrf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MVCController {

    @GetMapping("/")
    public String userForm(Model model){
        var obj = new CreateDTO();
        obj.setUsername("Cristian");

        model.addAttribute("user", obj);
        return "user-form";
    }

    @PostMapping("/users")
    public String users(){
        return "congratulation";
    }

}
