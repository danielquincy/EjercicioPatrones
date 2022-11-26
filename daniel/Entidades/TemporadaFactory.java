package com.patterns.daniel.Entidades;


import com.patterns.daniel.enums.Temporada;

public class TemporadaFactory {

    public TemporadaFactory() {
    }

    public Temporada getTemporada(Formulario oForm){
        return Temporada.getPorRangosFechas(oForm.getFechaInicio(), oForm.getFechaFin());
    }

}
