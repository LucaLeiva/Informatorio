import java.util.ArrayList;

public class Ejercicio5_complementario2 {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        //creo y cargo los arraylist

        ArrayList<Integer> horas_trabajadas = new ArrayList<Integer>();
        ArrayList<Integer> valor_por_hora = new ArrayList<Integer>();

        horas_trabajadas.add(6);
        horas_trabajadas.add(7);
        horas_trabajadas.add(8);
        horas_trabajadas.add(4);
        horas_trabajadas.add(5);

        valor_por_hora.add(350);
        valor_por_hora.add(345);
        valor_por_hora.add(550);
        valor_por_hora.add(600);
        valor_por_hora.add(320);

        //creo un tercer arraylist, los cargo y sumo en una variable el total

        int resultado_final = 0;
        ArrayList<Integer> resultado = new ArrayList<Integer>();

        for(int i=0; i <= 4; i++){
            resultado.add(horas_trabajadas.get(i) * valor_por_hora.get(i));
            resultado_final = resultado_final + resultado.get(i);
        }

        System.out.println(resultado);
        System.out.println("Total Final: $" + resultado_final);
    }
}
