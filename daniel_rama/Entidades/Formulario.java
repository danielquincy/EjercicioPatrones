package com.patterns.daniel.Entidades;



import com.patterns.daniel.enums.EstadoCivil;
import com.patterns.daniel.enums.Promocion;
import com.patterns.daniel.enums.Temporada;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class Formulario implements Promocionnes{
    private Cliente oCliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String motivo;
    private EstadoCivil estadoCivil;
    private Integer miembros;
    private Boolean poseeHijos;
    private Boolean poseeMascotas;
    private Temporada temporada;
    private List<Promocion> listPromociones;
    private String descuento;


    public Formulario() {
    }

    public Formulario(Formulario object){
        this.oCliente =         object.oCliente;
        this.fechaInicio =      object.fechaInicio;
        this.fechaFin =         object.fechaFin;
        this.motivo =           object.motivo;
        this.estadoCivil =      object.estadoCivil;
        this.miembros =         object.miembros;
        this.poseeHijos =       object.poseeHijos;
        this.poseeMascotas =    object.poseeMascotas;
        this.temporada =    object.temporada;
        this.listPromociones =    object.listPromociones;
        this.descuento =    object.descuento;
    }

    public Formulario cliente(Cliente oCliente) {
        this.oCliente = oCliente;
        return this;
    }

    public Formulario fechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
        return this;
    }

    public Formulario fechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
        return this;
    }

    public Formulario motivo(String motivo) {
        this.motivo = motivo;
        return this;
    }

    public Formulario estadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
        return this;
    }

    public Formulario miembros(Integer miembros) {
        this.miembros = miembros;
        return this;
    }

    public Formulario poseeHijos(Boolean poseeHijos) {
        this.poseeHijos = poseeHijos;
        return this;
    }

    public Formulario poseeMascotas(Boolean poseeMascotas) {
        this.poseeMascotas = poseeMascotas;
        return this;
    }

    public Formulario build(){
        TemporadaFactory factory = new TemporadaFactory();
        this.temporada =  factory.getTemporada(this);
        this.listPromociones = Promocion.getPromociones(temporada);
        this.descuento = null;
        return new Formulario(this);
    }

     @Override
    public String getListPromociones(){
        StringBuilder builder = new StringBuilder();

        if(listPromociones.isEmpty()){
            builder.append("No Aplican");
        }else{
            for(Promocion promo : listPromociones){
                builder.append(promo.getDescripcion()).append(" ");
            }
        }
        return builder.toString();
     }

}
