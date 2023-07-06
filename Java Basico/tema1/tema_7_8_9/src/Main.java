import java.io.*;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    // metodo hola mundo al reves
    public static String reverse(String texto) {
        String reverseString ="";
        for(int i = texto.length() -1 ; i >= 0; i--){
            reverseString += texto.charAt(i);
        }

        return reverseString;
    }

    //**7**
    public static void dividePorCero(int a) throws ArithmeticException{
        int resultado = a / 0;

    }


    //**8** copiar archivo inputstream printstream
    public static void copiar(File fileIn, File fileOut) {
        try{
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
        }catch (Exception e){
            System.out.println("Error en el proceso" + e.getMessage());
        }
    }


    public static void main(String[] args) {

        // metodo hola mundo al reves
        String respuesta = reverse("hola mundo");
        System.out.println(respuesta);

        System.out.println("*********");

        //**1** ArrayUnidimencional
        int[] array = {1,2,3,4,5};

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("*********");

        //**2** ArrayUnidimencional

        int[][] arrayBi = new int[2][2];

        arrayBi[0][0] = 1;
        arrayBi[0][1] = 2;
        arrayBi[1][0] = 3;
        arrayBi[1][1] = 1;

        for(int i = 0; i < arrayBi.length; i++) {
            for(int j = 0; j < arrayBi[i].length; j++) {
                System.out.println(arrayBi[i][j]);
            }
        }

        System.out.println("*********");
        //**3** Vector

        Vector<String> palabras = new Vector<String>();

        palabras.add("hola");
        palabras.add("a");
        palabras.add("todos");
        palabras.add("los");
        palabras.add("programadores");

        palabras.remove(1);
        palabras.remove(2);

        for(String palabra: palabras) {
            System.out.println(palabra);

        }
        //**4** problema del vector predeterminado

        System.out.println("el problema es que el vector se inicia con una capacidad de 10 y " +
                "se duplica una vez se esta llegando al limite con mil lo debordaria, se tendria que consignar " +
                "en su declaracion la capacidad apropiada");

        System.out.println("*********");

        //**5** Arraylist a LinkedList

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        LinkedList<Integer> linkedList = new LinkedList<Integer>(arrayList);

        for (int i = 0; i < linkedList.size(); i++){
            System.out.println(arrayList.get(i)+ " " + linkedList.get(i));
        }

        System.out.println("*********");



        //**6** Arraylist relleno

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        for(int i = 0; i <= 9; i++){
            int temp = i+1;
            arrayList2.add(temp);
        }

        for(int i = 0; i < arrayList2.size(); i++){
            if(arrayList2.get(i) % 2 == 0){
                arrayList2.remove(i);
            }
        }

        for(int i = 0; i < arrayList2.size(); i++){
            System.out.println(arrayList2.get(i));
        }


        System.out.println("*********");

        //**7** funcion Divide por cero
        try{
            dividePorCero(5);
        }catch(ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }


        System.out.println("***Aplicacion***");

        //**9** Aplicacion que maneja inputStream,printStream, arrarylist y exepciones

        ManejadorArchivo manejador= new ManejadorArchivo();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        ContadorPares contador = new ContadorPares();
        try{
            temp = manejador.leer();
            contador.sumador(temp);
        }catch (Exception e){
            System.out.println("error" + e.getMessage());
        }


    }

}
