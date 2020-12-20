package com.pradeep.springvalidation.model;

import com.pradeep.springvalidation.customvalidators.CustomStringValidator;
import org.springframework.stereotype.Component;

@Component
public class User {

    @CustomStringValidator(min = 1, max = 5, message = "Invalid String First Name")
    private String firstName;

    @CustomStringValidator(min = 1, max = 5, message = "Invalid String Last Name")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
