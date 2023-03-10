package com.br.springbootparty.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class IdeologyException extends RuntimeException {

    private String message;

}
