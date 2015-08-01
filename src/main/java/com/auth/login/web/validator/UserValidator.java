package com.auth.login.web.validator;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
@Component
public class UserValidator implements Validator {

	  public boolean supports(Class candidate) {
          return User.class.isAssignableFrom(candidate);
      }

      public void validate(Object obj, Errors errors) {
          ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "required", "Field is required.");
          ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required", "Field is required.");
      }

}
