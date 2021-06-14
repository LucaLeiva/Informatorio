//Crear una funcion que realice la suma de 2 numeros dados
import java.util.Scanner;

public class Ejercicio1_clase {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = scan.nextInt();

        System.out.print("Ingrese el primer numero: ");
        int b = scan.nextInt();

        System.out.print("El resultado es: " + sumar(a,b));

        scan.close();
    }

    public static int sumar(int a, int b){
        return a+b;
    }
}
