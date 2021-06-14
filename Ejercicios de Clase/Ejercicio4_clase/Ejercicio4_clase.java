//Teniendo una lista de objetos empleado, cargar la misma en
//un archivo .txt

package Ejercicio4_clase;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;


public class Ejercicio4_clase {
    public static void main(String[] args) throws IOException{
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        ArrayList<empleado> lista = new ArrayList<empleado>();

        empleado emp1 = new empleado("Homero Simpson", 45, 1234, "homero@hotmail.com", "Gerente de la Planta");
        empleado emp2 = new empleado("Marge Simpson", 43, 12345, "marge@hotmail.com", "Policia");
        empleado emp3 = new empleado("Bart Simpson", 10, 635432, "bart@hotmail.com", "Estudiante");
        empleado emp4 = new empleado("Lisa Simpson", 8, 2354235, "lisa@hotmail.com", "Estudiante");
        empleado emp5 = new empleado("Maggie Simpson", 2, 43534525, "maggie@hotmail.com", "Bebe");        

        lista.add(emp1);
        lista.add(emp2);
        lista.add(emp3);
        lista.add(emp4);
        lista.add(emp5);

        String path = "F:\\FACULTAD\\INFORMATORIO\\Etapa 3\\Ejercicios_Java\\Informatorio\\Ejercicios de Clase\\Ejercicio4_clase\\empleados.txt";

        /* La diferencia entre File y Buffered es que File lee caracter a caracter
        mientras que Buffered es una "mejora" que lee linea a linea */

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (int x=0; x < lista.size(); x++){

                //aca se escribe y se generan nuevas lineas, no hay necesidad de escribir \n
                bw.write("Empleado Nº: " + (x+1) + ", Datos: " + lista.get(x).getNombre() + ", " + lista.get(x).getDni() + ", " + lista.get(x).getEdad() + ", " + lista.get(x).getEmail() + ", " + lista.get(x).getPuesto());
                bw.newLine();

                //guarda los cambios del archivo
                bw.flush();
            }
        }
    }
}
