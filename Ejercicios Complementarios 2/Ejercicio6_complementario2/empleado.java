package Ejercicio6_complementario2;

public class empleado {
    private String nombre_apellido;
    private int dni;
    private int horasTrabajadas;
    private int valorPorHora;

    public empleado(String nombre_apellido, int dni, int horasTrabajadas, int valorPorHora){
        this.nombre_apellido = nombre_apellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public String getNombre_Apellido(){
        return nombre_apellido;
    }
    public int getDni(){
        return dni;
    }
    public int getHorasTrabajadas(){
        return horasTrabajadas;
    }
    public int getValorPorHora(){
        return valorPorHora;
    }

    


}
