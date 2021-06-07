import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        //no me gustaba como quedaban todos los codigos de la consola de comando
        //asi que investige algun metodo para eliminarlos :)
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        while (continuar == 1){
            System.out.print("Ingrese el numero: ");
            int a = scan.nextInt();

            for (int i=1; i<=10; i++) {
                System.out.println(a + " * " + i + " = " + a*i);
            }
            System.out.println("Si desea continuar presione 1, sino cualquier otro numero");
            continuar = scan.nextInt();
        }
        
        scan.close();
        System.out.println("Programa finalizado");
    }
}
