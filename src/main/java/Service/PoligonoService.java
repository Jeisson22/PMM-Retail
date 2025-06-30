package Service;

import Model.TipoPoligono;

import java.util.Random;

public class PoligonoService {
    private final Random random = new Random();

    public double calcularArea(TipoPoligono tipo){
        int base = random.nextInt(100)+1;
        int altura = random.nextInt(200)+1;
        int lado = random.nextInt(500) + 1;

        return  switch (tipo){
            case TRIANGULO -> (base * altura) / 2.0;
            case CUADRADO -> lado * lado ;
            case RECTANGULO ->  base * altura;
        };
    }
}
