package Clases;

import java.util.ArrayList;
import java.util.HashMap;

public class ClasePruebas {
    public static void main(String[] args) {

        // Ejemplo del método Multiplicador

        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(23);
        lista.add(0);
        lista.add(34);
        lista.add(8);
        lista.add(-93);

        UtileriaNumeros.multiplicador(lista, 5);

        // Lista vacía
        UtileriaNumeros.multiplicador(new ArrayList<>(), 5);

        // Lista con null
        ArrayList<Integer> numerosConNull = new ArrayList<>();
        numerosConNull.add(4);
        numerosConNull.add(null);
        numerosConNull.add(7);

        UtileriaNumeros.multiplicador(numerosConNull, 2);

        // Lista null
        UtileriaNumeros.multiplicador(null, 2);

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

        UtileriaCadenas.filtroSelectivo(listaPalabras, "a", 5);

        //Ejemplo del método Conversor de Mayúsculas.
        //Se reutilizó la lista del ejemplo anterior.

        UtileriaCadenas.conversorDeMayusculas(listaPalabras);

        //Ejemplo del método Cuadrados Únicos

        ArrayList<Integer> listaDuplicados = new ArrayList<>();
        listaDuplicados.add(23);
        listaDuplicados.add(54);
        listaDuplicados.add(23);
        listaDuplicados.add(34);
        listaDuplicados.add(8);
        listaDuplicados.add(34);

        UtileriaNumeros.cuadradosUnicos(listaDuplicados);
        // Lista vacía
        UtileriaNumeros.cuadradosUnicos(new ArrayList<>());

        // Lista con null
        ArrayList<Integer> listaConNull = new ArrayList<>();
        listaConNull.add(2);
        listaConNull.add(null);
        listaConNull.add(4);

        UtileriaNumeros.cuadradosUnicos(listaConNull);

        // Lista null
        UtileriaNumeros.cuadradosUnicos(null);



        //Ejemplo del método Mapa de longitudes
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("hola");
        palabras.add("java");
        palabras.add("codigo");

        UtileriaCadenas.mapaDeLongitudes(palabras);

        // edge
        UtileriaCadenas.mapaDeLongitudes(new ArrayList<>());
        UtileriaCadenas.mapaDeLongitudes(null);

        //Ejemplo del método de Modificador de inventario
        HashMap<String, Double> inventario = new HashMap<>();
        inventario.put("Manzana", 25.0);
        inventario.put("Leche", 32.5);
        inventario.put("Pan", 18.0);
        inventario.put("Chocolate", 40.0);

        UtileriaNumeros.modificadorInventario(inventario);
        // Caso edge: inventario vacío
        HashMap<String, Double> inventarioVacio = new HashMap<>();
        UtileriaNumeros.modificadorInventario(inventarioVacio);

        // Caso edge: inventario null
        UtileriaNumeros.modificadorInventario(null);

        //Ejemplo del método Contador de Frecuencias
        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("hola");
        lista2.add("java");
        lista2.add("hola");

        UtileriaCadenas.contadorFrecuencias(lista2);

        // edge
        UtileriaCadenas.contadorFrecuencias(new ArrayList<>());
        UtileriaCadenas.contadorFrecuencias(null);

        //Ejemplo con el método Clasificador de Palabras
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("hola", 5);
        mapa.put("java", 2);
        mapa.put("codigo", 8);

        UtileriaCadenas.clasificadorPalabras(mapa, 6);

        // edge
        UtileriaCadenas.clasificadorPalabras(new HashMap<>(), 3);
        UtileriaCadenas.clasificadorPalabras(null, 3);

        //Ejemplo con el método de Deduplicación de Palabras
        UtileriaCadenas.deDuplicacionPalabras("Hola hola JAVA codigo codigo", 6);

// edge
        UtileriaCadenas.deDuplicacionPalabras("", 5);
        UtileriaCadenas.deDuplicacionPalabras(null, 5);
    }
}
