package Ejercicio6_complementario2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class Ejercicio6_complementario6 {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        HashSet<empleado> lista_empleados = new HashSet<empleado>();
        HashMap<Integer, Integer> diccionario = new HashMap<Integer, Integer>();

        //creo los objetos empleados y los cargo en el HashSet y creo el diccionario de salida

        empleado emp1 = new empleado("Homero Simpson", 1234, 4, 300);
        empleado emp2 = new empleado("Marge Simpson", 2345, 8, 543);
        empleado emp3 = new empleado("Bart Simpson", 233435, 3, 234);
        empleado emp4 = new empleado("Lisa Simpson", 542342, 765, 275);
        empleado emp5 = new empleado("Maggie Simpson", 1298765434, 1, 211);

        lista_empleados.add(emp1);
        lista_empleados.add(emp2);
        lista_empleados.add(emp3);
        lista_empleados.add(emp4);
        lista_empleados.add(emp5);

        //aqui realizo el calculo y cargo los valores en el diccionario
        for(empleado i : lista_empleados){
            diccionario.put(i.getDni(), (i.getHorasTrabajadas() * i.getValorPorHora()));
        }
        
        //creo que esto es una expresion lambda, no encontraba como imprimirlo de otra forma
        diccionario.forEach((dni, salario) -> System.out.println("DNI: " + dni + " - Sueldo: " + salario));
    }
}
