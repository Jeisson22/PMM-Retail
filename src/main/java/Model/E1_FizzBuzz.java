package Model;

public class E1_FizzBuzz {

    public final   String Fizz = "fizz";
    public final  String buzz = "buzz";
    public final String espacio = " -> numero ->";

    // Este es un constructor
    public E1_FizzBuzz(String fizz, String buzz){
        for(int i = 1; i <= 100; i ++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(Fizz+buzz+espacio+i);
            } else if(i % 3 == 0){
                System.out.println(fizz+espacio+i);
            } else if (i % 5 == 0) {
                System.out.println(buzz+espacio+i);
            }
        }
    }

}
