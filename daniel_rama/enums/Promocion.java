package com.patterns.daniel.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum Promocion {

    TERMO_PARA_HIELO(1, "Termo para hielo"),
    KIT_PROTECCION_SOLAR(2, "Kit de Protección Solar"),
    SOMBRILLA(3, "Sombrilla"),
    GAFAS_DE_SOL(4, "Gafas de sol"),
    PLAN_SEGURO(5, "Plan de seguro asistencial en caso de accidentes"),
    NO_APLICA(6, "No hay promociones en esta temporada");

    private Integer id;
    private String descripcion;

    private static Promocion getById(Integer prId) {
        return Arrays.stream(Promocion.values())
                .filter(x -> x.getId().equals(prId))
                .findFirst().orElse(null);
    }

    public static List<Promocion> getPromociones(Temporada temporada) {
        List<Promocion> lista = new ArrayList<>();
        switch (temporada) {
            case PRIMAVERA:
                lista.add(getById(6));
                break;
            case VERANO:
                lista.add(getById(1));
                lista.add(getById(2));
                lista.add(getById(3));
                lista.add(getById(4));
                break;
            case OTONIO:
                lista.add(getById(6));
                break;
            case INVIERNO:
                lista.add(getById(5));
                break;
        }
        return lista;
    }


}
