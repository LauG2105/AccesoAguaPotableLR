package org.laura.aguaLimpia.service;

import static org.junit.jupiter.api.Assertions.*;

import org.laura.aguaLimpia.service.ImplementacionMetodosService;

class ImplementacionMetodosServiceTest {

    ImplementacionMetodosService implementacionMetodosService = new ImplementacionMetodosService();

    @org.junit.jupiter.api.Test
    void contarTotalPersonasEnRegistro() {

        int totalPersonasEnRegistro = implementacionMetodosService.contarTotalPersonasEnRegistro();
        assertEquals(totalPersonasEnRegistro,1709524);
    }

    @org.junit.jupiter.api.Test
    void sectorConMasDiasDeAcceso() {

        String sector = implementacionMetodosService.sectorConMasDiasDeAcceso();
        assertEquals(sector,"Lorica");
    }
}