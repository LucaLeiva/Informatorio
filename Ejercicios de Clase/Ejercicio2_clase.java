import java.util.Scanner;

public class Ejercicio2_clase {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        System.out.print("Ingrese el numero que desea calcular su factorial: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println("El factorial de " + a + " es: " + factorial(a));
        scan.close();

    }

    public static long factorial(int a){
        if(a==0){
            return 1;
        } else{
            return a*(factorial(a-1));
        }
    }
}
