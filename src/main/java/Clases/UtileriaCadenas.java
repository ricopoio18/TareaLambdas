package Clases;

import java.util.*;
import java.util.stream.Collectors;

public class UtileriaCadenas {

    public static void filtroSelectivo(ArrayList<String> lista, String cadena, int n){
        System.out.println("\n ))) Filtro selectivo (((");
        System.out.println("\nLista antes del filtro: " + lista);
        lista.removeIf(c -> (c.charAt(0) == cadena.charAt(0)) || (c.length() < n));
        System.out.println("Lista despues del filtro: " + lista);
    }

    public static ArrayList<String> conversorDeMayusculas(ArrayList<String> lista){
        System.out.println("\n ))) Conversor de Mayúsculas (((");
        System.out.println("\nLista antes de convertirla: " + lista);
        ArrayList<String> nuevaLista = lista.stream()
                .map(c -> c == null ? null : c.toUpperCase())
                .collect(Collectors.toCollection(ArrayList::new));

        return nuevaLista;
    }

    public static HashMap<String, Integer> mapaDeLongitudes(ArrayList<String> lista){
        return lista.stream()
                .collect(Collectors.toMap(p -> p, p -> p.length(),
                        (p1,p2) -> p1, HashMap::new));
    }

    public static void modificadorInventario(HashMap<String,Double> inventario){
        inventario.forEach((i,j) ->
            System.out.println("\nProducto: " + i + "\nPrecio sin descuento: " + j +
                    "\nPrecio con descuento de 10%: $" + (j*0.9) ));
    }

    public static ArrayList<String> clasificadorPalabras(HashMap<String, Integer> map, int frecuencia){
        List<String> lista = map.entrySet().stream()
                .filter(p -> p.getValue() < frecuencia)
                .map(p -> p.getKey())
                .collect(Collectors.toList());
        return new ArrayList<>(lista);
    }

    public static HashSet<String> deDuplicacionPalabras(String frase, int tamaño){
        if (frase == null || frase.isBlank()) {
            return new HashSet<>();
        }
        String[] palabras = frase.split("\\W+");

        return Arrays.stream(palabras)
                .filter(p -> !p.isBlank())
                .filter(p -> p.length() < tamaño)
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(HashSet::new));
    }
}
