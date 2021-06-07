import java.util.Scanner;

public class Ejercicio8_complementario {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el Nombre y Apellido: ");
        String nombre_apellido = scan.nextLine();

        System.out.print("Ingrese la Edad: ");
        int edad = scan.nextInt();
        String auxiliar = scan.nextLine();

        System.out.print("Ingrese la Direccion: ");
        String direccion = scan.nextLine();

        System.out.print("Ingrese la Ciudad: ");
        String ciudad = scan.nextLine();

        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombre_apellido);
        scan.close();
        
    }
}
