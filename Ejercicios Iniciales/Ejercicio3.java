import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        //no me gustaba como quedaban todos los codigos de la consola de comando
        //asi que investige algun metodo para eliminarlos :)
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner scan = new Scanner(System.in);
        int continuar = 1;

        while (continuar == 1){
            System.out.print("Ingrese la calificacion: ");
            int a = scan.nextInt();

            //operadores logicos: ==, !=, >, >=, <, <=

            if (a >= 93) {
                System.out.println("Excelente");
            } else if (a >= 85){
                System.out.println("Sobresaliente");
            } else if (a >= 75){
                System.out.println("Distinguido");
            } else if (a >= 60){
                System.out.println("Bueno");
            } else{
                System.out.println("Desaprobado");
            }

            System.out.println("Si desea continuar presione 1, sino cualquier otro numero");
            continuar = scan.nextInt();
        }
        
        scan.close();
        System.out.println("Programa finalizado");

    }
}
