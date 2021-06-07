import java.util.Scanner;

public class Ejercicio9_complementario {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el string: ");
        String entrada = scan.nextLine();
        char [] palabra = entrada.toCharArray();

        System.out.print("Ingrese la letra que desea contar: ");
        String entrada2 = scan.nextLine();
        char [] letra = entrada2.toCharArray();

        int resultado=0;

        for (int i=0; i < (entrada.length()); i++){
            if (letra[0] == palabra[i]){
                resultado++;
            }
        }

        System.out.println("La letra " + entrada2 + " aparece: " + resultado + " veces");

        scan.close();

    }
}
