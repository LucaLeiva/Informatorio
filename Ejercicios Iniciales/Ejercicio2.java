import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        //no me gustaba como quedaban todos los codigos de la consola de comando
        //asi que investige algun metodo para eliminarlos :)
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        while (continuar == 1){
            System.out.print("Ingrese el primer numero: ");
            int a = scan.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            int b = scan.nextInt();
            System.out.print("Ingrese el tercer numero: ");
            int c = scan.nextInt();

            System.out.println("El primer numero ingresado es: " + a);
            System.out.println("El segundo numero ingresado es: " + b);
            System.out.println("El tercero numero ingresado es: " + c);

            System.out.println("Si desea continuar presione 1, sino cualquier otro numero");
            continuar = scan.nextInt();
        }
        
        scan.close();
        System.out.println("Programa finalizado");
    }
}
