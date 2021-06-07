import java.util.ArrayList;

public class Ejercicio2_complementario2 {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(1);
        numeros.add(20);
        numeros.add(45);
        numeros.add(61);
        numeros.add(70);

        System.out.println("El tamaño es: " + numeros.size());
        System.out.println("Y los elementos son: ");
        for(int i = 0; i <= (numeros.size() - 1) ; i++){
            System.out.println(numeros.get(i));
        }

        numeros.add(0, 5000);
        numeros.add(6, 2000);

        System.out.println("El tamaño es: " + numeros.size());
        System.out.println("Y los elementos son: ");
        for(int i = 0; i <= (numeros.size() - 1) ; i++){
            System.out.println(numeros.get(i));
        }

    }
}
