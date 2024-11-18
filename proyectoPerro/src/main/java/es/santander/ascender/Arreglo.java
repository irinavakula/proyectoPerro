package es.santander.ascender;

import java.util.ArrayList;

public class Arreglo {
    public ArrayList<String> localizaDuplicados(ArrayList<String> lista1, ArrayList<String> lista2) {
        ArrayList<String> resultado = new ArrayList<>();

        for (String valor1: lista1) {
            if(lista2.contains(valor1)) {
               if (!resultado.contains(valor1)) {
                  resultado.add(valor1);
               }

            }
        }
    return resultado; 
    }       
}
  
