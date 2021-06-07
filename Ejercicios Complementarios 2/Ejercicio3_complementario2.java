import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3_complementario2 {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        ArrayList<Integer> numeros_baraja = new ArrayList<Integer>();

        //cargo el array con los numeros de la baraja francesa (1 al 13) y lo muestro
        System.out.print("Array original: ");
        for(int i=1; i<=13; i++){
            numeros_baraja.add(i);
            System.out.print(numeros_baraja.get(i-1) + " ");
        }

        System.out.println();

        //invierto los valores y los muestros
        Collections.reverse(numeros_baraja);
        System.out.print("Array invertido: ");
        for(int i=1; i<=13; i++){
            System.out.print(numeros_baraja.get(i-1) + " ");
        }

        System.out.println();

        //ahora mezclo el array
        Collections.shuffle(numeros_baraja);
        System.out.print("Array desordenado: ");
        for(int i=1; i<=13; i++){
            System.out.print(numeros_baraja.get(i-1) + " ");
        }
    }
}
