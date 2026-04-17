package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UtileriaNumeros {

    public static void multiplicador(ArrayList<Integer> arr, int n){
        System.out.println("\n ))) Multiplicador (((");
        System.out.println("\nNúmeros antes de modificar: " + arr);
        arr.replaceAll(numero -> numero * n);
        System.out.println("Numeros después de modificar: " + arr);
    }

    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> lista){
        System.out.println("\n ))) Cuadrados Únicos (((");
        System.out.println("\nLista antes de modificar: " + lista);
        Set<Integer> listaCuadrados = lista.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toSet());

        return new HashSet<>(listaCuadrados);
    }

    public static HashMap<String, Integer> contadorFrecuencias(ArrayList<String> lista){
        HashMap<String, Integer> contadorFrecuencias = new HashMap<>();
        lista.forEach(p -> {
            if (p != null) contadorFrecuencias.merge(p, 1, (p1, p2) -> p1 + p2);
        });

        return contadorFrecuencias;
    }


}
