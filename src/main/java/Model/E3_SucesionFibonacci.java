package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class E3_SucesionFibonacci {


        /**
         * Genera la sucesión de Fibonacci hasta un valor límite.
         *
         * @param limite El valor máximo permitido en la sucesión.
         * @return Una lista con la sucesión generada.
         */


        public List<Integer> generarSucesionHasta(int limite){
            List<Integer> sucesion = new ArrayList<>();
            sucesion.add(0);
            sucesion.add(1);
            // En la anterior linea tenemos un array que es asi [0,1]
            // Int es dato numero entero y el stream es una secuencia de datos osea datos de secuencia de datos enter
            // El iterate genera datos automaticos dependiendo de la formula siguiente y comienza del numero 2
            IntStream.iterate(2, i -> i + 1)
                    .mapToObj(i -> sucesion.get(i - 1) + sucesion.get(i - 2))
                    // mapToObj(2 -> sucesion[2-1 = 1] = 1  + sucesion[2-2 = 0] ; 1 + 0 = 1
                    // mapToObj(3 -> sucesion[3-1 = 2] = 1  + sucesion[3-2 = 1] ; 1 + 1 = 2
                    // mapToObj(4 -> sucesion[4-1 = 3] = 2  + sucesion[4-2 = 2] ; 2 + 1 = 3
                    // mapToObj(5 -> sucesion[5-1 = 4] = 3  + sucesion[5-2 = 3] ; 3 + 2 = 5
                    // mapToObj(6 -> sucesion[6-1 = 5] = 5  + sucesion[6-2 = 4] ; 5 + 3 = 8
                    // mapToObj(7 -> sucesion[7-1 = 6] = 8 + sucesion[7-2 = 5] ; 8 + 5 = 13
                    // mapToObj(8 -> sucesion[8-1 = 7] = 13 + sucesion[8-2 = 6] ; 13 + 8 = 21
                    // mapToObj(9 -> sucesion[9-1 = 8] = 21 + sucesion[9-2 = 7] ; 21 + 13 = 34
                    .takeWhile(valor -> valor <= limite)
                    // y el takeWhile es un evaluador del anterior transformacion
                    // esto para poner un limite es de 50 el valor el objeto
                    .forEach(sucesion::add);

                // aca hacer un for echa de lo que se agrego

            // PRIMERA EJECUCACION : [0,1,1,2,3,5,8,13,21,34]

            return sucesion;


        }

    }