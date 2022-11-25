package com.patrones.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TipoCliente {


    PLATA(1, "PLATA"),
    ORO(2, "ORO"),
    PLATINO(3, "PLATINO"),
    REGULAR(4, "REGULAR");

    private Integer tipo;
    private String descripcion;

    @Override
    public String toString() {
        return descripcion;
    }
}
