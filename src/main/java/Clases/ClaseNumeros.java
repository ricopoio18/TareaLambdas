package Clases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class ClaseNumeros {

    public static void multiplicador(ArrayList<Integer> arr, int n){
        System.out.println("\n ))) Multiplicador (((");
        System.out.println("\nNúmeros antes de modificar: " + arr);
        arr.replaceAll(numero -> numero * n);
        System.out.println("Numeros después de modificar: " + arr);
    }

    public static void cuadradosUnicos(ArrayList<Integer> lista){
        System.out.println("\n ))) Cuadrados Únicos (((");
        System.out.println("\nLista antes de modificar: " + lista);
        HashSet<Integer> listaCuadrados = lista.stream()
                .distinct()
                .map(n -> n * n)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println("Lista después de modificar: " + listaCuadrados);

    }

}
