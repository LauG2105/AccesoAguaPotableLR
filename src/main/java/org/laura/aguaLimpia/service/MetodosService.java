package org.laura.aguaLimpia.service;

public interface MetodosService {
    int contarTotalPersonasEnRegistro();

    String sectorConMasDiasDeAcceso();

    void calcularDuracionDeIntervaloEnHorasPorSector();

    void porcentajeConAccesoAguaLimpiaPorSemanaEnMunicipio();
}
