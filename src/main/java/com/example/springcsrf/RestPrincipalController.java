package com.example.springcsrf;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestPrincipalController {

    @GetMapping("/")
    @PreAuthorize("permitAll()")
    public String index() {
        return "Hello, world!";
    }

    @GetMapping("/auth")
    @PreAuthorize("hasRole('USER')")
    public String auth() {
        return "Auth, world!";
    }


    @PostMapping("/create")
    @PreAuthorize("hasRole('USER')")
    public String create() {
        return "create, world!";
    }
}
