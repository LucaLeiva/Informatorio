import java.util.Scanner;

public class Ejercicio7_complementario {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese una palabra u oracion: ");
        String cadena = scan.next();

        int longitud_cadena = cadena.length();

        char [] cadena_nueva = cadena.toCharArray();
        System.out.print("La cadena en mayusculas es: ");

        scan.close();

        for (int i=0; i < longitud_cadena; i++){
            switch(cadena_nueva[i]){
                case 'a':
                    System.out.print("A");
                    break;
                case 'b':
                    System.out.print("B");
                    break;
                case 'c':
                    System.out.print("C");
                    break;
                case 'd':
                    System.out.print("D");
                    break;
                case 'e':
                    System.out.print("E");
                    break;
                case 'f':
                    System.out.print("F");
                    break;
                case 'g':
                    System.out.print("G");
                    break;
                case 'h':
                    System.out.print("H");
                    break;
                case 'i':
                    System.out.print("I");
                    break;
                case 'j':
                    System.out.print("J");
                    break;
                case 'k':
                    System.out.print("K");
                    break;
                case 'l':
                    System.out.print("L");
                    break;
                case 'm':
                    System.out.print("M");
                    break;
                case 'n':
                    System.out.print("N");
                    break;
                case 'o':
                    System.out.print("O");
                    break;
                case 'p':
                    System.out.print("P");
                    break;
                case 'q':
                    System.out.print("Q");
                    break;
                case 'r':
                    System.out.print("R");
                    break;
                case 's':
                    System.out.print("S");
                    break;
                case 't':
                    System.out.print("T");
                    break;
                case 'u':
                    System.out.print("U");
                    break;
                case 'v':
                    System.out.print("V");
                    break;
                case 'w':
                    System.out.print("W");
                    break;
                case 'x':
                    System.out.print("X");
                    break;
                case 'y':
                    System.out.print("Y");
                    break;
                case 'z':
                    System.out.print("Z");
                    break;
                default:
                    System.out.print(cadena_nueva[i]);
                    break;
            }
        }
    }
}