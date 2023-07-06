import java.io.PrintStream;
import java.util.ArrayList;

public class ContadorPares {
    private static int contador;


    public void sumador(ArrayList<Integer> numberList){
        PrintStream ps = System.out;
        for(int i= 0; i< numberList.size(); i++){
            if(numberList.get(i) % 2 == 0){
                contador++;
            }
        }
        ps.println(" el archivo tiene " + contador + " numeros pares");
    }

}
