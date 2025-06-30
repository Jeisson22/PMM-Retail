package Model;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class E5_Poligono {


    public String tipoPoligono;

    public  void calcularPoligono(String tipoPoligono){
        this.tipoPoligono = tipoPoligono;


        String data = tipoPoligono.toLowerCase();
        Random random = new Random();
        int base = random.nextInt(100);
        int altura = random.nextInt(200);
        int lado = random.nextInt(500);
        int divisor = 2;
        switch (data){
            case "triangulo":
                System.out.println("El área del Triángulo es BASE x ALTURA / 2 : " + (base * altura)/ divisor ); break;

            case "cuadrado":
                System.out.println("El área del Cuadrado es LADO x LADO  : " + lado * lado ); break;

            case "rectangulo":
                System.out.println("El área del Rectángulo es  BASE x ALTURA : " + base * altura); break;
        }


    }

}
