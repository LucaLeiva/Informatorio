package proyecto;

import java.time.*;

public class empleado{
    private String nombre_apellido;
    private LocalDate fecha_nacimiento;
    private float sueldo;

    public empleado(String nombre_apellido, int dia, int mes, int año, float sueldo){
        this.nombre_apellido = nombre_apellido;
        this.fecha_nacimiento = LocalDate.of(año, mes, dia);
        this.sueldo = sueldo;
    }

    //-----------------------------------------------------------------------------------------------

    public String getNombre() {
        return nombre_apellido;
    }

    public void setNombre(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString(){
        return "Empleado: " + nombre_apellido;
    }

}
