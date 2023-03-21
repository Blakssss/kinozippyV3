package com.example.kinozippyv3.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class ControllerExceptionHandler {

    //Global error
    @ExceptionHandler(Exception.class)
    ResponseEntity<ErrorMessage> globalExceptionHandler(Exception ex, WebRequest request) {
        ErrorMessage message = new ErrorMessage(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                new Date(),
                ex.getMessage() + " GLOBAL ERROR",
                request.getDescription(true));
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    //Error til fejl med tal
    @ExceptionHandler(ArithmeticException.class)
    ResponseEntity<ErrorMessage> globalArithmeticExceptionHandler(Exception ex, WebRequest request) {
        ErrorMessage message = new ErrorMessage(
                HttpStatus.I_AM_A_TEAPOT.value(),
                new Date(),
                ex.getMessage() + " Some Math Went Wrong",
                request.getDescription(true));
        return new ResponseEntity<>(message, HttpStatus.I_AM_A_TEAPOT);
    }

    //Error til Not Found
    @ExceptionHandler(ResourceNotFoundException.class)
    ResponseEntity<ErrorMessage> resourceNotFoundException(Exception ex, WebRequest request) {
        ErrorMessage message = new ErrorMessage(
                HttpStatus.NOT_FOUND.value(),
                new Date(),
                ex.getMessage() + " Resource Not Found",
                request.getDescription(true));
        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }
    
}


