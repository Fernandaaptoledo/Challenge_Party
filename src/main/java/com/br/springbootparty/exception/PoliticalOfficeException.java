package com.br.springbootparty.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PoliticalOfficeException extends RuntimeException {
//    public PoliticalOfficeException(Object p0) {
//    }
    private String message;
}
