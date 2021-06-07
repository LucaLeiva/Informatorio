import java.util.Scanner;

public class Ejercicio5_complementario {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = scan.nextInt();

        int resultado = 0;
        for (int i=1; i <= a; i++){
            resultado = resultado + b;
        }

        System.out.println("El resultado de: " + a + " x " + b + " = " + resultado);
        scan.close();
    }
}
