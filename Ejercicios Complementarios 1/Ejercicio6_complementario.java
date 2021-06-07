import java.util.Scanner;

public class Ejercicio6_complementario {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = scan.nextInt();

        int resultado = 1;
        for(int i=1; i <= b; i++){
            resultado = resultado * a;
        }
        System.out.println(a + " Elevado a la " + b + " = " + resultado);
        scan.close();
    }
}
