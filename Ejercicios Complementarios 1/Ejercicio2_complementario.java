import java.util.Scanner;

public class Ejercicio2_complementario {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = scan.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int b = scan.nextInt();

        scan.close();

        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (a/b));
        System.out.println(a + " % " + b + " = " + (a%b));
    }
}
