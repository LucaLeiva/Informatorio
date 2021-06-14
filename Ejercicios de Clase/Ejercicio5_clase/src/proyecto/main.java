package proyecto;

/* Dado un archivo de texto .txt con el siguiente formato:
nombre,apellido,fecha de nacimiento,sueldo
donde:
    nombre, apellido: String
    fecha de nacimiento: Fecha con formato (dia-mes-año, ejemplo: 23-05-2021)
    sueldo: float

ejemplo: carlos sanchez,20-01-1980,45678 (formato de archivo separado por comas, Excel lo puede leer)

El archivo existe, esta cargado. Resolucion:
    -Servicio reader (lectura)
    -Necesito una clase proyecto.empleado
    -Cada linea es un proyecto.empleado y se almacena en una lista
    -Crear un metodo que trate cada linea (String) donde se separa los campos y creara el objeto Empleado
    -Necesitamos otro metodo que convierta la fecha String en Clase Fecha (Date en Java 7 o inferiores, LocalDate en Java 8 y mas, LocalDateTime para añadir hora),
    tambien una clase SimpleDateFormat

Calculos (sobre la lista final):
    (YA ESTA) -Metodo que devuelva todos los empleados que comiencen con una letra dada
    en el apellido
    (YA ESTA) -Metodo que devuelva el proyecto.empleado mas joven y mas viejo (necesito una funcion
    para calcular el año basado en una fecha)
    (YA ESTA) -Metodo que muestre el proyecto.empleado que mas gana y el que menos gana
    -Opcional: imprimir todos los empleados en orden alfabetico (por nombre)


    Continuar en  1:22:00*/


import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class main {
    public static void main(String[] args) throws IOException {

        //escribo el path del archivo y creo el ArrayList de objetos 'empleado'
        String path = "F:\\FACULTAD\\INFORMATORIO\\Etapa 3\\Ejercicios_Java\\Informatorio\\Ejercicios de Clase\\Ejercicio5_clase\\src\\proyecto\\empleado.txt";
        ArrayList<empleado> lista_empleados = new ArrayList<empleado>();

        //cargo la lista con el archivo de texto externo
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String linea = br.readLine();

            while (linea != null){

                //aca divido la linea almacenada en base a la coma y lo almaceno en un Array de Strings 'temporal'
                String[] string_temporal = linea.split(",");

                //a esta linea ya dividida, vuelvo a divididir el elemento en posicion 1, que corresponda al dia-mes-año, en base a los guiones '-'
                String[] dia_mes_año = string_temporal[1].split("-");

                //gracias a estos datos creo el objeto empleado directamente en un nuevo elemento del ArrayList
                lista_empleados.add(new empleado(string_temporal[0], parseInt(dia_mes_año[0]), parseInt(dia_mes_año[1]), parseInt(dia_mes_año[2]), parseFloat(string_temporal[2])));

                linea = br.readLine();
            }

            Scanner scan = new Scanner(System.in);

            while(true) {
                //limpio la consola de cosas raras
                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println("Bienvenido! ¿que desea hacer en el programa?");
                System.out.println("1_Imprimir todos los empleados");
                System.out.println("2_Ingrese una letra y filtre todos los empleados cuyo nombre comienza con dicha letra");
                System.out.println("3_Imprimo el empleado mas joven y el mas anciano");
                System.out.println("4_Imprimir el empleado que mas gana y el que menos gana");
                System.out.println("5_Imprimir los empleados en orden alfabetico");
                System.out.println("6_Cerrar el programa");

                int decision = scan.nextInt();
                String auxiliar = scan.nextLine();
                //por las dudas dejo esto para no tener problemas con el caracter \n


                if (decision == 1) {
                    //aca imprimo la lista ya cargada con todo el archivo (modifique el metodo toString para que sea legible)
                    funcionesMain.imprimirPorPantalla(lista_empleados);

                } else if(decision == 2) {
                    //aca solicito una letra e imprimo los empleados que empiezan con dicha letra
                    System.out.println("Ingrese la letra inicial del empleado que desea buscar: ");
                    char a = scan.next().charAt(0);
                    funcionesMain.imprimirEnBaseAUnaLetra(lista_empleados, a);

                } else if(decision == 3) {
                    //aca imprimo el empleado mas joven y el mayor
                    funcionesMain.imprimirEmpleadoJovenyMayor(lista_empleados);

                } else if(decision == 4) {
                    //aca imprimo el empleado que mas gana y el que menos gana
                    funcionesMain.imprimirEmpleadoMasyMenosGana(lista_empleados);

                } else if(decision == 5){
                    //aca ordeno la lista en forma alfabetica, aunque por desgracia la unica solucion que encontre es con una expresion Lambda, que no es del todo legible
                    funcionesMain.ordernarLista(lista_empleados);

                } else if(decision == 6){
                    break;
                }
            }

            scan.close();
        }
    }
}
