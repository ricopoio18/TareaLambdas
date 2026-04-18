EL SIGUIENTE README.md SE GENERÓ CON LA IA PERO FUE SUEPERVISADO Y CORREGIDO POR EL ALUMNO.




# 📌 Proyecto: Utilerías de Cadenas y Números en Java

## 📖 Descripción
Este proyecto consiste en la implementación de dos clases de utilería en Java: una para manipulación de cadenas (`UtileriaCadenas`) y otra para operaciones con números (`UtileriaNumeros`).  

Cada clase contiene métodos estáticos que utilizan expresiones lambda y streams para realizar distintas operaciones sobre listas, mapas y conjuntos.  

Se incluye una clase de pruebas (`ClasePruebas`) que demuestra el funcionamiento de todos los métodos, incluyendo casos normales y casos extremos como listas vacías y valores nulos.

---

## ⚙️ Lista de métodos

### 🔤 UtileriaCadenas

1. **filtroSelectivo**  
   Filtra una lista eliminando palabras que comienzan con cierta letra o tienen longitud menor a un valor dado.

2. **conversorDeMayusculas**  
   Convierte todas las cadenas de una lista a mayúsculas.

3. **mapaDeLongitudes**  
   Genera un mapa donde cada palabra es la clave y su longitud el valor.

4. **clasificadorPalabras**  
   Retorna una lista de palabras cuya frecuencia es menor a un valor dado.

5. **deDuplicacionPalabras**  
   Extrae palabras únicas de una frase, las convierte a minúsculas y filtra por longitud.

6. **contadorFrecuencias**  
   Cuenta cuántas veces aparece cada palabra en una lista.

7. **topeFrecuencias**  
   Limita las frecuencias de un mapa a un valor máximo usando `replaceAll()`.

---

### 🔢 UtileriaNumeros

8. **multiplicador**  
   Multiplica todos los elementos de una lista por un número dado (modifica la lista original).

9. **cuadradosUnicos**  
   Genera un conjunto con los cuadrados de los números pares de una lista.

10. **modificadorInventario**  
   Muestra un inventario con precios originales y aplicando un descuento del 10%.

---

## ▶️ Instrucciones de compilación y ejecución

1. Clonar el repositorio:
```bash
git clone https://github.com/tu-usuario/tu-repositorio.git


## ▶️ Ejemplo de salida
 ))) Multiplicador (((

Números antes de modificar: [2, 5, -3, 0]
Números después de modificar: [6, 15, -9, 0]

 ))) Conversor de Mayúsculas (((

Lista antes de convertirla: [abeja, rojo, azul]
Lista después de convertirla: [ABEJA, ROJO, AZUL]

 ))) Mapa de Longitudes (((

Lista original: [hola, java]
Mapa generado: {hola=4, java=4}

 ))) Top Frecuencias (((

Mapa antes: {hola=10, java=3}
Mapa después: {hola=5, java=3}
