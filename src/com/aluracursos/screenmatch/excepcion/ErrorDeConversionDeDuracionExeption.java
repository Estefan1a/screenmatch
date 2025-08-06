package com.aluracursos.screenmatch.excepcion;

public class ErrorDeConversionDeDuracionExeption extends RuntimeException {
    private String mensaje;

    public ErrorDeConversionDeDuracionExeption(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage(){
        return this.mensaje;
    }

}
