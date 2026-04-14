package Clases;

import java.util.ArrayList;

public class ClasePruebas {
    public static void main(String[] args) {

        // Ejemplo del método Multiplicador

        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(23);
        lista.add(54);
        lista.add(34);
        lista.add(8);
        lista.add(93);

        ClaseNumeros.multiplicador(lista, 5);

        // Ejemplo del método Filtro Selectivo

        ArrayList<String> listaPalabras = new ArrayList<>();
        listaPalabras.add("abeja");
        listaPalabras.add("rojo");
        listaPalabras.add("amarillo");
        listaPalabras.add("paleta");
        listaPalabras.add("chocolate");
        listaPalabras.add("azul");
        listaPalabras.add("hoja");
        listaPalabras.add("quesadilla");

        ClaseCadenas.filtroSelectivo(listaPalabras, "a");

        //Ejemplo del método Conversor de Mayúsculas.
        //Se reutilizó la lista del ejemplo anterior.

        System.out.println("Lista después de convertirla: " +
                ClaseCadenas.conversorDeMayusculas(listaPalabras));

        //Ejemplo del método Cuadrados Únicos

        ArrayList<Integer> listaDuplicados = new ArrayList<>();
        listaDuplicados.add(23);
        listaDuplicados.add(54);
        listaDuplicados.add(23);
        listaDuplicados.add(34);
        listaDuplicados.add(8);
        listaDuplicados.add(34);

        ClaseNumeros.cuadradosUnicos(listaDuplicados);
    }
}
