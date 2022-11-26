package com.patterns.daniel;


import com.patterns.daniel.Entidades.Cliente;
import com.patterns.daniel.Entidades.DescuentoFactory;
import com.patterns.daniel.Entidades.Formulario;
import com.patterns.daniel.enums.EstadoCivil;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

public class APP {
    public static void main(String[] args) {

        //Creamos la nueva instancia de un cliente con la siguiente información
        //usuario: dprado , Nombre: Daniel Prado, Veces que ha alquilado el servicio: 16.
        Cliente cliente = new Cliente();
        cliente
                .usuario("dprado")
                .nombre("Daniel Prado")
                .eventos(16)
                .login();


        Formulario formulario = new Formulario();
        formulario.cliente(cliente)
                .motivo("Quiere Vacacionar")
                .estadoCivil(EstadoCivil.SOLTERO)
                .miembros(5)
                .poseeHijos(true)
                .poseeMascotas(false)
                .fechaInicio(LocalDate.of(2022,11,25))
                .fechaFin(LocalDate.of(2022,12,25))
                .build();

        DescuentoFactory descuento = new DescuentoFactory();
        System.out.println("=============================================================");
        System.out.println("============== FICHA DE ALQUILER DE VEHICULO ================");
        System.out.println("=============================================================");
        System.out.println("Usuario                 :: " + cliente.getUsuario());
        System.out.println("Nombre                  :: " + cliente.getNombre());
        System.out.println("Cantidad de Alquileres  :: " + cliente.getEventos());
        System.out.println("Tipo de Cliente         :: " + cliente.getTipoCliente());
        System.out.println("=============================================================");
        System.out.println("==============      DATOS DEL FORMULARIO      ================");
        System.out.println("=============================================================");
        System.out.println("Motivo Alquiler         :: " + formulario.getMotivo());
        System.out.println("Estado Civil            :: " + formulario.getEstadoCivil());
        System.out.println("Miembros de familia     :: " + formulario.getMiembros());
        System.out.println("¿Tiene Hijos?           :: ".concat(formulario.getPoseeHijos() ? "SI":"NO"));
        System.out.println("¿Tiene Mascotas?        :: ".concat(formulario.getPoseeMascotas()?"SI":"NO"));
        System.out.println("Periodo de Alquiler     :: Desde: " +formulario.getFechaInicio() +" - Hasta: "+ formulario.getFechaFin());
        System.out.println("Temporada               :: " + formulario.getTemporada().getDescripcion());
        System.out.println("=============================================================");
        System.out.println("==============          PROMOCIONES          ================");
        System.out.println("=============================================================");
        System.out.println("Promoción por Temporada    :: " + formulario.getListPromociones());
        System.out.println("Descuento                  :: " + descuento.getDescuento(formulario,cliente));
        System.out.println("=============================================================");


    }
}
