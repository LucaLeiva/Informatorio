import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

        //no me gustaba como quedaban todos los codigos de la consola de comando
        //asi que investige algun metodo para eliminarlos :)
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner scan = new Scanner(System.in);
        int continuar = 1;

        while (continuar == 1){
            System.out.println("Hola Informatorio 2021!!");
            System.out.println("Si desea continuar presione 1, sino cualquier otro numero");
            continuar = scan.nextInt();
        }
        
        scan.close();
        System.out.println("Programa finalizado");
    }
}