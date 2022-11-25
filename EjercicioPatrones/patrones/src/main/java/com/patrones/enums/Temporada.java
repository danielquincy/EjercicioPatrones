package com.patrones.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Temporada {

    PRIMAVERA(1,"PRIMAVERA"),
    VERANO(2,"VERANO"),
    OTONIO(3,"OTOÑO"),
    INVIERNO(4,"INVIERNO");

    private Integer temp;
    private String descripcion;

    @Override
    public String toString(){
        return descripcion;
    }
}
