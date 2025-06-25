package Model;

import java.util.Arrays;

public class E2_Anagrama {


    // Función que verifica si dos palabras son anagramas
    public static boolean sonAnagramas(String palabra1, String palabra2) {
        // Si las palabras son exactamente iguales, no son anagramas
        if (palabra1.equalsIgnoreCase(palabra2)) {
            return false;
        }


        // Convertir las palabras en minusculas y a un arreglo de caracteres

        char[] arrayPalabra1 = palabra1.toLowerCase().toCharArray();

        char[] arrayPalabra2 = palabra2.toLowerCase().toCharArray();

        //  Ordenar los arreglos
        Arrays.sort(arrayPalabra1);
        Arrays.sort(arrayPalabra2);

        // Imprimir correctamente el contenido de los arrays
        System.out.println("Palabra 1 ordenada: " + String.valueOf(arrayPalabra1));
        System.out.println("Palabra 2 ordenada: " + String.valueOf(arrayPalabra2));


        // Comparar si los arreglos ordenados son iguales

        return Arrays.equals(arrayPalabra1,arrayPalabra2);


    }
}
