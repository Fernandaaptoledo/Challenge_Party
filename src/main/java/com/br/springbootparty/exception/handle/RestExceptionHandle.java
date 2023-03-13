package com.br.springbootparty.exception.handle;

import com.br.springbootparty.exception.IdeologyException;
import com.br.springbootparty.exception.PoliticalOfficeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandle {


    @ExceptionHandler(IdeologyException.class)
    public final ResponseEntity<Object> handleIdeologyException(){
        IdeologyException ideologyException = new IdeologyException("An error ocurr");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ideologyException);
    }
    @ExceptionHandler(PoliticalOfficeException.class)
    public final ResponseEntity<Object> handlePoliticalOfficeException(){
        PoliticalOfficeException politicalOfficeException = new PoliticalOfficeException("An error ocurr");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(politicalOfficeException );
    }
}
