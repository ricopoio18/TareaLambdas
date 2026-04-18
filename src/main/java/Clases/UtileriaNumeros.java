package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;
/**
 * Clase de utilería que contiene métodos estáticos para realizar
 * operaciones con números y estructuras de datos numéricas.
 *
 * Incluye funciones para modificar listas de enteros, generar conjuntos
 * de valores únicos y aplicar operaciones matemáticas sobre valores numéricos.
 *
 * Todos los métodos imprimen el estado antes y después de la operación
 * para facilitar su comprensión y pruebas.
 */
public class UtileriaNumeros {

    /**
     * Multiplica cada elemento de una lista de enteros por un número dado.
     * La modificación se realiza directamente sobre la lista original (in-place).
     *
     * También maneja casos donde la lista es nula o contiene elementos nulos.
     *
     * @param arr Lista de enteros a modificar.
     * @param n Número por el cual se multiplicarán los elementos.
     */

    public static void multiplicador(ArrayList<Integer> arr, int n){
        System.out.println("\n ))) Multiplicador (((");
        System.out.println("\nNúmeros antes de modificar: " + arr);
        if (arr == null) {
            System.out.println("Números después de modificar: null");
            return;
        }
        arr.replaceAll(numero -> numero == null ? null : numero * n);
        System.out.println("Números después de modificar: " + arr);
    }

    /**
     * Genera un conjunto (HashSet) con los cuadrados de los números pares
     * presentes en una lista. El resultado no contiene elementos duplicados.
     *
     * Se ignoran valores nulos dentro de la lista.
     *
     * @param lista Lista de enteros de entrada.
     * @return Un HashSet con los cuadrados de los números pares.
     *         Si la lista es nula, retorna un conjunto vacío.
     */
    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> lista){
        System.out.println("\n ))) Cuadrados Únicos (((");
        System.out.println("\nLista antes de modificar: " + lista);
        if (lista == null) {
            System.out.println("Resultado: []");
            return new HashSet<>();
        }
        HashSet<Integer> resultado = lista.stream()
                .filter(n -> n != null && n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println("Lista de cuadrados únicos: " + resultado);

        return resultado;
    }

    /**
     * Muestra el inventario de productos junto con sus precios originales
     * y aplica un descuento del 10% para mostrar el precio final.
     *
     * Este método no modifica el mapa original, solo imprime los resultados.
     *
     * Maneja casos donde el inventario es nulo o está vacío.
     *
     * @param inventario Mapa que contiene el nombre del producto como clave
     *                   y su precio como valor.
     */

    public static void modificadorInventario(HashMap<String,Double> inventario){
        System.out.println("\n ))) Modificador de Inventario (((");
        System.out.println("\nInventario original: " + inventario);

        if (inventario == null || inventario.isEmpty()) {
            System.out.println("Inventario vacío o nulo.");
            return;
        }
        inventario.forEach((i,j) ->
                System.out.println("\nProducto: " + i + "\nPrecio sin descuento: " + j +
                        "\nPrecio con descuento de 10%: $" + (j*0.9) ));
    }

}
