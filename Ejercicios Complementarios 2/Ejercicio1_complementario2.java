import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio1_complementario2 {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        ArrayList<String> ciudades = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese tres ciudades: ");
        ciudades.add(scan.nextLine());
        ciudades.add(scan.nextLine());
        ciudades.add(scan.nextLine());

        System.out.println("1# - " + ciudades.get(0));
        System.out.println("2# - " + ciudades.get(1));
        System.out.println("3# - " + ciudades.get(2));
        scan.close();
    }
}
