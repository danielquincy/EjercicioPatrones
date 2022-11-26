package com.patterns.daniel.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum Temporada {

    PRIMAVERA(1,"PRIMAVERA",LocalDate.of(2022,3,21), LocalDate.of(2022,6,22)),
    VERANO(2,"VERANO",LocalDate.of(2022,6,22), LocalDate.of(2022,9,24)),
    OTONIO(3,"OTOÑO",LocalDate.of(2022,9,24), LocalDate.of(2022,12,22)),
    INVIERNO(4,"INVIERNO",LocalDate.of(2022,12,22), LocalDate.of(2022,3,21));

    private Integer temp;
    private String descripcion;
    private LocalDate inicio;
    private LocalDate fin;

    public static List<Temporada> getEnums(){
        return Arrays.asList(Temporada.values());
    }

    @Override
    public String toString(){
       return  " Temporada: " + descripcion +
                " Inicia: " + inicio +
                " Finaliza : " + fin;
    }

    public static Temporada getPorRangosFechas(LocalDate oInicio, LocalDate oFin){

        return getEnums().stream()
                .filter( x-> x.getInicio().isBefore(oFin)
                    &&  x.getInicio().isAfter(oInicio))
                .findFirst().orElse(null);
    }

}
