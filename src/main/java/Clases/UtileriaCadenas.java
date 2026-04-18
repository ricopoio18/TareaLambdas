package Clases;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Clase de utilería que contiene métodos estáticos para manipulación
 * y procesamiento de cadenas (Strings) y estructuras relacionadas.
 *
 * Incluye operaciones como filtrado de listas, transformación de texto,
 * generación de mapas y conjuntos, así como conteo y control de frecuencias.
 *
 * Todos los métodos imprimen el estado antes y después de la operación
 * para facilitar su comprensión y pruebas.
 */

public class UtileriaCadenas {

    /**
     * Filtra una lista de cadenas eliminando elementos que:
     * - Empiezan con la misma letra que la cadena dada.
     * - Tienen longitud menor al valor especificado.
     *
     * La modificación se realiza directamente sobre la lista original.
     *
     * Maneja casos donde la lista o la cadena son nulas o vacías.
     *
     * @param lista Lista de cadenas a filtrar.
     * @param cadena Cadena de referencia para comparar la primera letra.
     * @param n Longitud mínima permitida para las cadenas.
     */
    public static void filtroSelectivo(ArrayList<String> lista, String cadena, int n){
        System.out.println("\n ))) Filtro selectivo (((");
        System.out.println("\nLista antes del filtro: " + lista);
        if (lista == null || cadena == null || cadena.isEmpty()) {
            System.out.println("Lista después del filtro: " + lista);
            return;
        }

        lista.removeIf(c -> c == null || (c.charAt(0) == cadena.charAt(0)) || (c.length() < n));
        System.out.println("Lista después del filtro: " + lista);
    }

    /**
     * Convierte todas las cadenas de una lista a mayúsculas.
     *
     * Los valores nulos dentro de la lista se conservan como nulos.
     *
     * @param lista Lista de cadenas a convertir.
     * @return Nueva lista con las cadenas en mayúsculas.
     *         Si la lista es nula, retorna una lista vacía.
     */

    public static ArrayList<String> conversorDeMayusculas(ArrayList<String> lista){
        System.out.println("\n ))) Conversor de Mayúsculas (((");
        System.out.println("\nLista antes de convertirla: " + lista);
        if (lista == null) {
            System.out.println("Lista después de convertirla: null");
            return new ArrayList<>();
        }
        ArrayList<String> nuevaLista = lista.stream()
                .map(c -> c == null ? null : c.toUpperCase())
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Lista después de convertirla: " + nuevaLista);

        return nuevaLista;
    }

    /**
     * Genera un mapa donde cada cadena de la lista es la clave
     * y su longitud es el valor.
     *
     * Se ignoran elementos nulos dentro de la lista.
     *
     * @param lista Lista de cadenas.
     * @return HashMap con cada palabra y su longitud.
     *         Si la lista es nula, retorna un mapa vacío.
     */

    public static HashMap<String, Integer> mapaDeLongitudes(ArrayList<String> lista){
        System.out.println("\n ))) Mapa de Longitudes (((");
        System.out.println("\nLista original: " + lista);
        if (lista == null) {
            System.out.println("Resultado: null");
            return new HashMap<>();
        }
        HashMap<String, Integer> mapa = lista.stream()
                .filter(p -> p != null)
                .collect(Collectors.toMap(p -> p, p -> p.length(),
                        (p1,p2) -> p1, HashMap::new));

        System.out.println("Mapa generado: " + mapa);

        return mapa;
    }

    /**
     * Filtra un mapa de palabras y frecuencias, retornando aquellas
     * palabras cuya frecuencia es menor al valor especificado.
     *
     * @param map Mapa de palabras y sus frecuencias.
     * @param frecuencia Valor máximo permitido.
     * @return Lista de palabras que cumplen con la condición.
     *         Si el mapa es nulo, retorna una lista vacía.
     */


    public static ArrayList<String> clasificadorPalabras(HashMap<String, Integer> map, int frecuencia){
        System.out.println("\n ))) Clasificador de Palabras (((");
        System.out.println("\nMapa original: " + map);
        if (map == null) {
            System.out.println("Resultado: []");
            return new ArrayList<>();
        }
        List<String> lista = map.entrySet().stream()
                .filter(p -> p.getValue() < frecuencia)
                .map(p -> p.getKey())
                .collect(Collectors.toList());
        ArrayList<String> resultado = new ArrayList<>(lista);

        System.out.println("Palabras filtradas: " + resultado);

        return resultado;
    }

    /**
     * Procesa una frase para obtener un conjunto de palabras únicas
     * que cumplan con una longitud menor al valor indicado.
     *
     * Las palabras se convierten a minúsculas y se eliminan duplicados.
     *
     * Maneja casos donde la frase es nula o vacía.
     *
     * @param frase Texto de entrada.
     * @param tamaño Longitud máxima permitida para las palabras.
     * @return HashSet con palabras únicas filtradas.
     */
    public static HashSet<String> deDuplicacionPalabras(String frase, int tamaño){
        System.out.println("\n ))) Deduplicación de Palabras (((");
        System.out.println("\nFrase original: " + frase);

        if (frase == null || frase.isBlank()) {
            System.out.println("Resultado: []");
            return new HashSet<>();
        }

        String[] palabras = frase.split("\\W+");

        HashSet<String> resultado = Arrays.stream(palabras)
                .filter(p -> !p.isBlank())
                .filter(p -> p.length() < tamaño)
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println("Palabras únicas filtradas: " + resultado);

        return resultado;
    }
    /**
     * Cuenta la frecuencia de aparición de cada palabra en una lista.
     *
     * Los valores nulos son ignorados.
     *
     * @param lista Lista de cadenas.
     * @return HashMap con cada palabra y su frecuencia.
     *         Si la lista es nula, retorna un mapa vacío.
     */
    public static HashMap<String, Integer> contadorFrecuencias(ArrayList<String> lista){
        System.out.println("\n ))) Contador de Frecuencias (((");
        System.out.println("\nLista original: " + lista);

        if (lista == null) {
            System.out.println("Resultado: {}");
            return new HashMap<>();
        }

        HashMap<String, Integer> contadorFrecuencias = new HashMap<>();
        lista.forEach(p -> {
            if (p != null) contadorFrecuencias.merge(p, 1, (p1, p2) -> p1 + p2);
        });

        System.out.println("Mapa de frecuencias: " + contadorFrecuencias);

        return contadorFrecuencias;
    }

    /**
     * Limita las frecuencias de un mapa a un valor máximo dado.
     *
     * Si una frecuencia es mayor que el valor indicado, se reemplaza
     * por dicho valor utilizando replaceAll().
     *
     * La modificación se realiza directamente sobre el mapa original.
     *
     * @param map Mapa de palabras y frecuencias.
     * @param n Valor máximo permitido para las frecuencias.
     */
    public static void topeFrecuencias(HashMap<String, Integer> map, int n){
        System.out.println("\n ))) Top Frecuencias (((");
        System.out.println("\nMapa antes: " + map);
        if (map == null) return;
        map.replaceAll((palabra,frecuencia) -> frecuencia > n ? n : frecuencia);
        System.out.println("Mapa después: " + map);
    }
}
