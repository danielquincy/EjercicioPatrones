package com.patrones.Entidades;


import com.patrones.enums.EstadoCivil;

import java.util.Date;

public class Cuestionario {
    private Cliente oCliente;
    private Date fechaInicio;
    private Date fechaFin;
    private String motivo;
    private EstadoCivil estadoCivil;
    private Integer miembros;
    private Boolean poseeHijos;
    private Boolean poseeMascotas;

    public Cuestionario(Cuestionario object){
        this.oCliente =         object.oCliente;
        this.fechaInicio =      object.fechaInicio;
        this.fechaFin =         object.fechaFin;
        this.motivo =           object.motivo;
        this.estadoCivil =      object.estadoCivil;
        this.miembros =         object.miembros;
        this.poseeHijos =       object.poseeHijos;
        this.poseeMascotas =    object.poseeMascotas;

    }

    public Cuestionario cliente(Cliente oCliente) {
        this.oCliente = oCliente;
        return this;
    }

    public Cuestionario fechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
        return this;
    }

    public Cuestionario fechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
        return this;
    }

    public Cuestionario motivo(String motivo) {
        this.motivo = motivo;
        return this;
    }

    public Cuestionario estadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
        return this;
    }

    public Cuestionario miembros(Integer miembros) {
        this.miembros = miembros;
        return this;
    }

    public Cuestionario poseeHijos(Boolean poseeHijos) {
        this.poseeHijos = poseeHijos;
        return this;
    }

    public Cuestionario poseeMascotas(Boolean poseeMascotas) {
        this.poseeMascotas = poseeMascotas;
        return this;
    }

    public Cuestionario build(){
        return new Cuestionario(this);
    }

}
