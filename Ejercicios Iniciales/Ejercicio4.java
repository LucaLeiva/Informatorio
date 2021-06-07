import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        //no me gustaba como quedaban todos los codigos de la consola de comando
        //asi que investige algun metodo para eliminarlos :)
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner scan = new Scanner(System.in);

        int continuar = 1;
        while (continuar == 1){
            System.out.println("Ingrese el numero del dia de la semana");
            int a = scan.nextInt();

            /*Solucion 1:

        if (a == 1){
            System.out.println("Domingo");
        } else if (a == 2){
            System.out.println("Lunes");
        } else if (a == 3){
            System.out.println("Martes");
        } else if (a == 4){
            System.out.println("Miercoles");
        } else if (a == 5){
            System.out.println("Jueves");
        } else if (a == 6){
            System.out.println("Viernes");
        } else if (a == 7){
            System.out.println("Sabado");
        } else{
            System.out.println("Error, numero no valido");
        }

        */

        //Solucion 2
        switch(a){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Error, ingreso un numero no valido");

            //no es buena idea eliminar los breaks o si no ejecutara las sentencias de debajo
            //por mas que no cumpla la condicion
        }
            
            System.out.println("Si desea continuar presione 1, sino cualquier otro numero");
            continuar = scan.nextInt();
        }
        
        scan.close();
        System.out.println("Programa finalizado");
    

    }
}
