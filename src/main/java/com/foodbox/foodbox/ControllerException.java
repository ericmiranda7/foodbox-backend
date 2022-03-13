package com.foodbox.foodbox;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ControllerException {
    @ExceptionHandler(UsernameNotFoundException.class)
    @ResponseBody
    public String handleUsernameNotFound() {
        System.out.println("here?");
        return "oopsies";
    }
}
