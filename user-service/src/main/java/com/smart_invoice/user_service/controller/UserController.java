package com.smart_invoice.user_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/")
public class UserController {

    @GetMapping("hello-user")
    public String helloUserServiceController() {
        return "Hello from user service";
    }
}
