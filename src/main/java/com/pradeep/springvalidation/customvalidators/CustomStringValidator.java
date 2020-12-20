package com.pradeep.springvalidation.customvalidators;

import com.pradeep.springvalidation.customvalidators.impl.CustomStringValidatorImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CustomStringValidatorImpl.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomStringValidator {

    public int min() default 1;
    public int max() default 16;
    public String message() default "Invalid String Input";

    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
