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

    public static void modificadorInventario(HashMap<String,Double> inventario){
        inventario.forEach((i,j) ->
                System.out.println("\nProducto: " + i + "\nPrecio sin descuento: " + j +
                        "\nPrecio con descuento de 10%: $" + (j*0.9) ));
    }

}
