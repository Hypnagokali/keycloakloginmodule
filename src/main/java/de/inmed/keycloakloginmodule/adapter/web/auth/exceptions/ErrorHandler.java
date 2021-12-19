package de.inmed.keycloakloginmodule.adapter.web.auth.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(NoPermissionException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public void handleNoPermission() {}

}
