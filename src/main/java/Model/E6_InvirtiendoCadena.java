package Model;

import java.util.ArrayList;

public class E6_InvirtiendoCadena {

    public void  invertir(String data) {

        int longitud = data.length()-1;

        for (int i = 0;  longitud >= i; longitud-- ) {
            char texto = data.charAt(longitud);
            System.out.print(texto);

        }
    }
}
