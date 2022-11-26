package com.patterns.daniel.Entidades;

import com.patterns.daniel.enums.TipoCliente;

import java.time.Period;

public class DescuentoFactory {

    public DescuentoFactory() {
    }

    public String getDescuento(Formulario formulario, Cliente cliente) {
        Period cantidadDias = Period.between(formulario.getFechaInicio(), formulario.getFechaFin());
        if (cliente.getTipoCliente().equals(TipoCliente.ORO)) {
            return cantidadDias.getDays() > 0 ? "Aplica 1% de Descuento" :"No Aplica Descuento";
        } else if (cliente.getTipoCliente().equals(TipoCliente.PLATINO)) {
            return cantidadDias.getDays() > 0 ? "Aplica 2% de Descuento" :"No Aplica Descuento";
        } else {
            return "No Aplica";
        }
    }
}
