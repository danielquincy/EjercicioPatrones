package com.patrones.Entidades;

import com.patrones.enums.TipoCliente;

public class TipoClienteFactory {

    public TipoClienteFactory() {
    }

    public TipoCliente getTipoCliente(Cliente oCliente) {
        if (oCliente.getEventos() >= 15 && oCliente.getEventos() < 20) {
            return TipoCliente.PLATA;
        } else if (oCliente.getEventos() > 19 && oCliente.getEventos() < 30) {
            return TipoCliente.ORO;
        } else if (oCliente.getEventos() < 15) {
            return TipoCliente.PLATINO;
        } else {
            return TipoCliente.REGULAR;
        }
    }
}
