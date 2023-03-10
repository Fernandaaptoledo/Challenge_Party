package com.br.springbootparty.exception.handle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandle {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllException(){
        Log.error("An unexpected error accur" ex)
        ExceptionResponse exceptionResponse = new ExceptionResponse(
                ErrorCodes.INTERNAL_SERVER_ERROR, ex.getmessage());
        request.getDescription(false);

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exceptionResponse);
    }

}
