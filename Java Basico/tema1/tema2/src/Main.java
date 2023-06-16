// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double resultado =valor(200);
        System.out.println(resultado);

    }

    // funcion para encontrar el precio del articulo
    public static double valor(int precio) {
         var valorTotal = precio * 0.18;
        return valorTotal + precio;
    }

}