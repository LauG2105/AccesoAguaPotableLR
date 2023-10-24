package org.laura.aguaLimpia.service;

import org.laura.aguaLimpia.model.DatosMunicipioAguaEscasa;
import org.laura.aguaLimpia.repository.ImplementacionMetodosRecord;

import java.util.ArrayList;

public class ImplementacionMetodosService implements MetodosService {
    ImplementacionMetodosRecord registro = new ImplementacionMetodosRecord();
    ArrayList<DatosMunicipioAguaEscasa> registrosDeMunicipiosAguaEscasa = registro.datosMunicipioAguaEscasa();

    @Override
    public int contarTotalPersonasEnRegistro() {
        int totalPersonas = 0;
        for (DatosMunicipioAguaEscasa dMunicipioAguaEscasa : registrosDeMunicipiosAguaEscasa) {
            totalPersonas += dMunicipioAguaEscasa.totalPersonas();
        }
        return totalPersonas;
    }

    @Override
    public String sectorConMasDiasDeAcceso() {
        String sector = "";
        int diasDeAcceso = 0;
        for (int i = 0; i <= registrosDeMunicipiosAguaEscasa.size(); i++) {
            if (registrosDeMunicipiosAguaEscasa.get(i).diasAcceso() > diasDeAcceso) {
                diasDeAcceso = registrosDeMunicipiosAguaEscasa.get(i).diasAcceso();
                sector = registrosDeMunicipiosAguaEscasa.get(i).nombreSector();
            }
        }
        return sector;
    }

    @Override
    public void calcularDuracionDeIntervaloEnHorasPorSector() {
        int duracionIntervalo = 0;
        for (DatosMunicipioAguaEscasa dMunicipioAguaEscasa : registrosDeMunicipiosAguaEscasa) {
            duracionIntervalo = dMunicipioAguaEscasa.finIntervalo() - dMunicipioAguaEscasa.inicioIntervalo();
            System.out.println("El total de horas con acceso a agua limpia en una semana en " + dMunicipioAguaEscasa.nombreSector() +
                    " es de " + duracionIntervalo + "h");
        }
    }


    @Override
    public void porcentajeConAccesoAguaLimpiaPorSemanaEnMunicipio() {
        int totalPersonas = contarTotalPersonasEnRegistro();
        double porcenatajePersonas = 0.0d;
        for (DatosMunicipioAguaEscasa dMunicipioAguaEscasa : registrosDeMunicipiosAguaEscasa) {
            porcenatajePersonas = totalPersonas / (dMunicipioAguaEscasa.totalPersonas() * 100);
            System.out.println("El porcentaje de personas con acceso a agua limpia en una semana en " + dMunicipioAguaEscasa.nombreSector() +
                    " es de " + porcenatajePersonas + "%");
        }
    }


}
