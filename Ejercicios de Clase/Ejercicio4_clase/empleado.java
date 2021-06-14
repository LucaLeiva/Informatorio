package Ejercicio4_clase;

public class empleado {
    private String nombre;
    private int edad;
    private int dni;
    private String email;
    private String puesto;

    public empleado(String nombre, int edad, int dni, String email, String puesto){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.email = email;
        this.puesto = puesto;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public int getDni(){
        return dni;
    }

    public String getEmail(){
        return email;
    }

    public String getPuesto(){
        return puesto;
    }
}
