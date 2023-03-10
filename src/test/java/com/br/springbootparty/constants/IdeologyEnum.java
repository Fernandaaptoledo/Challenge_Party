package com.br.springbootparty.constants;


public enum IdeologyEnum {
    RIGTH("Right"),
    CENTER("Center"),
    LEFT("Left");

    private final String value;

    IdeologyEnum(String value){
        this.value = value;
    }

    public String value(){
        return this.value;
    }


}
