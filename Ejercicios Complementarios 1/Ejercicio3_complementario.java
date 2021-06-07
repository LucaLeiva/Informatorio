import java.util.Scanner;

public class Ejercicio3_complementario {
    public static void main (String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a = scan.nextInt();
        scan.close();

        int b = 0;

        for(int j=a; j>0; j--){
            for(int i=0; i<=b; i++){
                System.out.print(i+1 + " ");
            }
            System.out.println();
            b++;
        }
    }
}
