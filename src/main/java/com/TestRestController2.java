package com;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test2")
public class TestRestController2 {
    @GetMapping
    public String test(){
        return "test";
    }

    @GetMapping("/exception1")
    public String exception1(){
        throw new NullPointerException();
    }
    
    @GetMapping("/exception2")
    public String exception2(){
        throw new ClassCastException();
    }

    @ExceptionHandler({NullPointerException.class, ClassCastException.class})
    public String handle(Exception ex){
        return "ExceptionHandle";
    }
}