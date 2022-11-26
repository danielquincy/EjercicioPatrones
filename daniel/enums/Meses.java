package com.patterns.daniel.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Meses {

    ENERO(1,"ENERO"),
    FEBRERO(2,"FEBRERO"),
    MARZO(3,"MARZO"),
    ABRIL(4,"ABRIL"),
    MAYO(5,"MAYO"),
    JUNIO(6,"JUNIO"),
    JULIO(7,"JULIO"),
    AGOSTO(8,"AGOSTO"),
    SEPTIEMBRE(9,"SEPTIEMBRE"),
    OCTUBRE(10,"OCTUBRE"),
    NOVIEMBRE(11,"NOVIEMBRE"),
    DICIEMBRE(12,"DICIEMBRE") ;

    private Integer numero;
    private String descripcion;

    @Override
    public String toString(){
        return descripcion;
    }

}
