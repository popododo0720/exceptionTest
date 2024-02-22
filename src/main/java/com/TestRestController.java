package com;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestRestController {
    @GetMapping
    public String test(){
        return "test";
    }

    @GetMapping("/exception")
    public String exception(){
        throw new NullPointerException();
    }

    @ExceptionHandler(value = NullPointerException.class)
    public String nullPointerExceptionHandle(NullPointerException ex){
        return "nullPointerExceptionHandle";
    }
    
    @GetMapping("/datetest")
    public String register(Code code){
        return code.toString();
    }
}