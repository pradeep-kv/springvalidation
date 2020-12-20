package com.pradeep.springvalidation.controller;

import com.pradeep.springvalidation.customexception.BindingResultException;
import com.pradeep.springvalidation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {
    @Autowired
    BindingResultException bindingResultException;

    @PostMapping("/userUpdate")
    public String userUpdate(@Valid @RequestBody User user, BindingResult bindingResult) throws BindingResultException {
        if(bindingResult.hasErrors()){
            throw new BindingResultException(bindingResult);
        }
        System.out.println(user + "::" + bindingResult);
        return "Test OK";
    }
}
