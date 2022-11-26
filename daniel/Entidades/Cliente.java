package com.patterns.daniel.Entidades;

import com.patterns.daniel.enums.TipoCliente;
import lombok.Getter;

/**
 * Clase Cliente: Este llevará los parámetros: usuario, nombre, y eventos (Cantidad de veces que ha alquilado);
 */
@Getter
public class Cliente {
    private String usuario;
    private String nombre;
    private Integer eventos;
    private TipoCliente tipoCliente;

    public Cliente() {
    }

    public Cliente(Cliente oCliente){
        this.usuario = oCliente.usuario;
        this.nombre = oCliente.nombre;
        this.eventos = oCliente.eventos;
    }

    public Cliente usuario(String usuario){
        this.usuario = usuario;
        return this;
    }

    public Cliente nombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    public Cliente eventos(Integer eventos){
        this.eventos = eventos;
        return this;
    }

    public Cliente login(){

        //Implementamos una fabrica para determinar el tipo de cliente que se está logueando.
        //Esto servirá para determinar el tipo de descuento que tendrá más tarde.
        TipoClienteFactory factory = new TipoClienteFactory();
       this.tipoCliente =  factory.getTipoCliente(this);

       //Retornamos el cliente con todos sus datos.
        return new Cliente(this);
    }

}
