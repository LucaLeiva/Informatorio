import java.util.ArrayList;

public class Ejercicio4_complementario2 {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        //creo y cargo el arraylist

        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add("Pedro");
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Maia");
        nombres.add("Lucas");
        nombres.add("Martin");
        nombres.add("Luciana");
        nombres.add("Homero");
        nombres.add("Lisa");
        nombres.add("Bart");
        nombres.add("Marge");
        nombres.add("Moe");
        nombres.add("Otto");

        //creo otros 3 nuevos arraylist y le asigno 1/3 del arraylist original, aunque probablemente
        //sea mas legible separar en 2 instrucciones ambas cosas :P

        ArrayList<String> curso1 = new ArrayList<String>(nombres.subList(0, 3));
        ArrayList<String> curso2 = new ArrayList<String>(nombres.subList(4, 7));
        ArrayList<String> curso3 = new ArrayList<String>(nombres.subList(8, 11));

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);


    }
}
