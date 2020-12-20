package com.pradeep.springvalidation.customvalidators.impl;

import com.pradeep.springvalidation.customvalidators.CustomStringValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomStringValidatorImpl implements ConstraintValidator<CustomStringValidator,String> {
    private int min;
    private int max;
    private String defaultMessage;

    @Override
    public void initialize(CustomStringValidator constraintAnnotation) {
        min = constraintAnnotation.min();
        max = constraintAnnotation.max();
        defaultMessage = constraintAnnotation.message();
    }

    @Override
    public boolean isValid(String string, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = false;
        if(string != null && string.length() != 0 && !string.isEmpty()){
            string = string.trim();
            System.out.println(string + string.length());
            if(string.length() >= min && string.length() <= max){
                result = true;
            }
        }else{
            constraintValidatorContext.buildConstraintViolationWithTemplate(" Test ");
        }
        return result;
    }
}
