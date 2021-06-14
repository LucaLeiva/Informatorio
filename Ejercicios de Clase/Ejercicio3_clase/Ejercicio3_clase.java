/*Dado un archivo de texto (alumnos.txt), crear una funcion  que
lea todos los nombres de los alumnos y los imprima por pantalla*/

package Ejercicio3_clase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3_clase {
    public static void main(String[] args) throws IOException{
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        String path = "F:\\FACULTAD\\INFORMATORIO\\Etapa 3\\Ejercicios_Java\\Informatorio\\Ejercicios de Clase\\Ejercicio3_clase\\alumnos.txt";
        
        //si ponemos el buffer en el try, se abre y se cierra solo

        //si una excepcion hereda de Exception es chequeada, si hereda de
        //runtime, es no chequeada

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String linea = br.readLine();

            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
        }
    }

}
