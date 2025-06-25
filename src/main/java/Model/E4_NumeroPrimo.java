package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class E4_NumeroPrimo {

        // Este metodo devuelve una lista de números primos

        public List<Integer> numeroPrimo(int num1, int num2){

//            IntStream.iterate(i -> i + 1)
//                    .limit(num2-1)
//                    .filter(this::esPrimo)
//                    .forEach(s);

            return IntStream.rangeClosed(num1, num2)
                    .filter(this::esPrimo)
                    .boxed()
                    .collect(Collectors.toList());




        }

        // Metodo para saber que el numero si es primo

    public boolean esPrimo(int numero) {
       if(numero <= 1) return false; // Los números menores o iguales a 1 no son primos
        if(numero == 2) return true; // El 2 es primo


        // El rangeClosed es como un for pero en el modo funcional en Stream
        return IntStream.rangeClosed(2,(int) Math.sqrt(numero))
                .noneMatch(i -> numero % i == 0);
    }
}
