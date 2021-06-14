package proyecto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class funcionesMain {
    public static void imprimirPorPantalla(ArrayList<empleado> lista_empleados){
        for(int i = 0; i < lista_empleados.size(); i++) {
            System.out.println(lista_empleados.get(i));
        }
    }

    public static void imprimirEnBaseAUnaLetra(ArrayList<empleado> lista_empleados, char a){

        for(int i = 0; i < lista_empleados.size(); i++) {
            if(lista_empleados.get(i).getNombre().charAt(0) == a){
                System.out.println(lista_empleados.get(i));
            }
        }
    }

    public static void imprimirEmpleadoJovenyMayor(ArrayList<empleado> lista_empleados){
        int edad_joven = 0;
        int edad_viejo = 0;
        String nombre_joven = "";
        String nombre_viejo = "";
        for(int i = 0; i < lista_empleados.size(); i++) {
            if((LocalDate.now().getYear() - lista_empleados.get(i).getFecha_nacimiento().getYear()) < edad_joven){
                edad_joven = LocalDate.now().getYear() - lista_empleados.get(i).getFecha_nacimiento().getYear();
                nombre_joven = lista_empleados.get(i).getNombre();
            } else if((LocalDate.now().getYear() - lista_empleados.get(i).getFecha_nacimiento().getYear()) > edad_viejo){
                edad_viejo = LocalDate.now().getYear() - lista_empleados.get(i).getFecha_nacimiento().getYear();
                nombre_viejo = lista_empleados.get(i).getNombre();
            }
        }
        System.out.println("El empleado mas joven es: " + nombre_joven + " y tiene " + edad_joven + " años de edad");
        System.out.println("El empleado mas viejo es: " + nombre_viejo + " y tiene " + edad_viejo + " años de edad");

    }

    public static void imprimirEmpleadoMasyMenosGana(ArrayList<empleado> lista_empleados){
        float mas_gana = 0;
        float menos_gana = 0;
        String nombre_mas = "";
        String nombre_menos = "";
        for(int i = 0; i < lista_empleados.size(); i++) {
            if(mas_gana < lista_empleados.get(i).getSueldo()){
                mas_gana = lista_empleados.get(i).getSueldo();
                nombre_mas = lista_empleados.get(i).getNombre();
            } else if(menos_gana > lista_empleados.get(i).getSueldo()){
                menos_gana = lista_empleados.get(i).getSueldo();
                nombre_menos = lista_empleados.get(i).getNombre();
            }
        }
        System.out.println("El empleado que mas gana es: " + nombre_mas + " y gana " + mas_gana);
        System.out.println("El empleado que menos gana es: " + nombre_menos + " y gana " + menos_gana);

    }

    public static void ordernarLista(ArrayList<empleado> lista_empleados){
        Collections.sort(lista_empleados, (p1,p2) -> p1.getNombre().compareTo(p2.getNombre()));
        for(int i = 0; i < lista_empleados.size(); i++) {
            System.out.println(lista_empleados.get(i));
        }
    }
}
