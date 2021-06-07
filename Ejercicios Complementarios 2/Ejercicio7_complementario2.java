import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio7_complementario2 {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int numero1 = scan.nextInt();
        System.out.print("Ingrese el numero limite: ");
        int limite = scan.nextInt();

        fizzBuzz(numero1, limite);

        scan.close();

    }


    public static void fizzBuzz(int numero1, int limite){
        ArrayList<String> buzz = new ArrayList<String>();
        for (int i=numero1; i < limite; i++){
            if( (( i % 2 ) == 0) && (( i % 3 ) == 0) ){
                buzz.add("FizzBuzz");

            }else if (( i % 3 ) == 0){
                buzz.add("Buzz");

            }else if (( i % 2 ) == 0){
                buzz.add("Fizz");
            }else{
                buzz.add(String.valueOf(i));
            }
        }
        System.out.println(buzz);
    }
}
