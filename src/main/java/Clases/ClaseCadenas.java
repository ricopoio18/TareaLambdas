package Clases;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ClaseCadenas {

    public static void filtroSelectivo(ArrayList<String> lista, String cadena){
        System.out.println("\n ))) Filtro selectivo (((");
        System.out.println("\nLista antes del filtro: " + lista);
        lista.removeIf(c -> (c.charAt(0) == cadena.charAt(0)) || (c.length() < 5));
        System.out.println("Lista despues del filtro: " + lista);
    }

    public static ArrayList<String> conversorDeMayusculas(ArrayList<String> lista){
        System.out.println("\n ))) Conversor de Mayúsculas (((");
        System.out.println("\nLista antes de convertirla: " + lista);
        ArrayList nuevaLista = lista.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new));

        return nuevaLista;
    }
}
