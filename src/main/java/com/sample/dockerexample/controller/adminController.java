package com.sample.dockerexample.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class adminController {

    @GetMapping(value = "/test")
    public ResponseEntity<?> processLogin() throws Exception, IllegalArgumentException {
        return ResponseEntity.ok("Our new docker demo is successful");
    }

}
