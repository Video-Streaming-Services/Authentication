package com.videostreaming.authentication.controller;

import com.videostreaming.authentication.json.Account;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    @PostMapping("/")
    public Boolean authenticate(@RequestBody Account account){
        return account.getUserName().equals("admin")&&account.getPassword().equals("admin");
    }
}
