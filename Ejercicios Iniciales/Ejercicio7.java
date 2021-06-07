import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        //no me gustaba como quedaban todos los codigos de la consola de comando
        //asi que investige algun metodo para eliminarlos :)
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        System.out.println("Seleccione el programa que desea ejecutar");
        System.out.println("1: Programa que al ejecutar se pueda ingresar 3 numeros enteros, para luego imprimirlos por pantalla");
        System.out.println("2: Clasificar el resultado de una evaluación");
        System.out.println("3: Dado un número de entrada entre 1 a 7, nos devuelva el dia de la semana");
        Scanner scan1 = new Scanner(System.in);
        int eleccion = scan1.nextInt();

        int continuar = 1;
        
        while (continuar == 1){
            switch(eleccion){
                case 1:
                    int numeros[] = new int[3];
                    ingresarNumeros(numeros);
                    mostrarNumeros(numeros);
                    break;
    
                case 2:
                    clasificarResultado();
                    break;
                case 3:
                    diaSemana();
                    break;
                default:
                    System.out.println("Error, ingreso otro numero");
            }

            System.out.println("Si desea continuar presione 1, sino cualquier otro numero");
            continuar = scan1.nextInt();
        }

        scan1.close();
        System.out.println("Programa finalizado");
    }

//-----------------------------------------------------------------------------------------------------------------------------------
    
    public static int[] ingresarNumeros(int numeros[]){
        Scanner scan2 = new Scanner(System.in);
        //int a,b,c;
        System.out.print("Ingrese el primer numero: ");
        numeros[0] = scan2.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        numeros[1] = scan2.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        numeros[2] = scan2.nextInt();
        scan2.close();

        return numeros;
    }

    public static void mostrarNumeros(int numeros[]){
        System.out.println("El primer numero ingresado es: " + numeros[0]);
        System.out.println("El segundo numero ingresado es: " + numeros[1]);
        System.out.println("El tercero numero ingresado es: " + numeros[2]);
    }

//--------------------------------------------------------------------------------------------------------------------------------------

    public static void clasificarResultado(){
        Scanner scan3 = new Scanner(System.in);
        System.out.print("Ingrese la calificacion: ");
        int a = scan3.nextInt();

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

        scan3.close();
    }

//-------------------------------------------------------------------------------------------------------------------------------------

    public static void diaSemana(){
        Scanner scan4 = new Scanner(System.in);
        System.out.print("Ingrese la calificacion: ");
        int a = scan4.nextInt();

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
        }

        scan4.close();

    }
}
