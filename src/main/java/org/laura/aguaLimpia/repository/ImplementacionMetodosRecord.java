package org.laura.aguaLimpia.repository;

import org.laura.aguaLimpia.model.DatosMunicipioAguaEscasa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ImplementacionMetodosRecord implements MetodosRecord {
@Override
  public ArrayList<DatosMunicipioAguaEscasa> datosMunicipioAguaEscasas (){

      DatosMunicipioAguaEscasa[] data = new DatosMunicipioAguaEscasa[10];

      data[0] = new DatosMunicipioAguaEscasa("Arboletes",29295, 3, 14, 19);
      data[1] = new DatosMunicipioAguaEscasa("Chima",15018, 3, 6, 11);
      data[2] = new DatosMunicipioAguaEscasa("Lorica",115461, 5, 9, 12);
      data[3] = new DatosMunicipioAguaEscasa("Malaga",18738, 3, 12, 17);
      data[4] = new DatosMunicipioAguaEscasa("Necocli",70824, 3, 11, 16);
      data[5] = new DatosMunicipioAguaEscasa("Puerto Escondido",29141, 3, 15, 20);
      data[6] = new DatosMunicipioAguaEscasa("Puli",2999, 1, 7, 22);
      data[7] = new DatosMunicipioAguaEscasa("San Juan Del Cesar",37327, 3, 8, 13);
      data[8] = new DatosMunicipioAguaEscasa("Soacha",831259, 5, 15, 18);
      data[9] = new DatosMunicipioAguaEscasa("Valledupar",559462, 5, 12, 15);

      List<DatosMunicipioAguaEscasa> listaMunicipiosAguaEscasa = new ArrayList<DatosMunicipioAguaEscasa>(Arrays.asList(data));

      return listaMunicipiosAguaEscasa;
      }
    }
