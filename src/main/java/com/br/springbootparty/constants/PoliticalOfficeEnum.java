package com.br.springbootparty.constants;



public enum PoliticalOfficeEnum {
    ALDERMAN("Alderman"),
    MAYOR("Mayor"),
    STATE_DEPUTY("State Deputy"),
    FEDERAL_DEPUTY("Federal Deputy"),
    SENATOR("Senator"),
    GOVERNOR("Governor"),
    PRESIDENT("President"),
    NONE("none");

    private final String value;

    PoliticalOfficeEnum(String value){
        this.value = value;
    }

    public String value(){
        return this.value;
    }

}
