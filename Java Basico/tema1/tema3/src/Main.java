public class Main {
    public static void main(String[] args) {


        String[] nombres = {"hola ","como "," esta "," el"," mundo"," hoy?"};
        String[] concatenar = new String[nombres.length];



        for (int i = 0; i < nombres.length; i++){
              concatenar[i] = nombres[i];

        }

        for (String posicion : concatenar){
            System.out.print(posicion);
        }
    }




}