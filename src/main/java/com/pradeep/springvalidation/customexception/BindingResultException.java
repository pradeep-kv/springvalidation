package com.pradeep.springvalidation.customexception;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

@Component
public class BindingResultException extends Exception {
    public static BindingResult bindingResult;
    public BindingResultException(){}
    public BindingResultException(BindingResult bindingResult){
        this.bindingResult = bindingResult;
    }
}
