package com.patrones;

import com.patrones.Entidades.Cliente;

public class APP {
    public static void main(String[] args) {

        //Creamos la nueva instancia de un cliente con la siguiente información
        //usuario: dprado , Nombre: Daniel Prado, Veces que ha alquilado el servicio: 16.
        Cliente cliente = new Cliente();
        cliente.usuario("dprado").nombre("Daniel Prado").eventos(16).login();


    }
}
