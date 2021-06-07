import java.util.Scanner;

public class Ejercicio1_complementario{
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        System.out.println("Ingrese el nombre de usuario");
        Scanner scan = new Scanner(System.in);
        String usuario = scan.nextLine();

        System.out.println("HOLA " + usuario);
        scan.close();
    }
}
