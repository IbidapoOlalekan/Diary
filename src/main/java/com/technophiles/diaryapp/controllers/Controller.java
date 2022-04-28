package com.technophiles.diaryapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/diary")
//@Controller This is for MVC
public class Controller {
    @GetMapping("/hello-world/")
    public ResponseEntity<?> startPoint(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }
}
