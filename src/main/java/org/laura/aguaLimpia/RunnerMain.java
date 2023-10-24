package org.laura.aguaLimpia;

import org.laura.aguaLimpia.service.ImplementacionMetodosService;

public class RunnerMain {

    public static void main(String[] args) {

        ImplementacionMetodosService runnerMain = new ImplementacionMetodosService();

        System.out.println(runnerMain.contarTotalPersonasEnRegistro());
        runnerMain.calcularDuracionDeIntervaloEnHorasPorSector();
        runnerMain.porcentajeConAccesoAguaLimpiaPorSemanaEnMunicipio();
        System.out.println(runnerMain.sectorConMasDiasDeAcceso());
    }
}
