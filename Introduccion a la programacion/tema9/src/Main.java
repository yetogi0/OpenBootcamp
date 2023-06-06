// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setEdad(23);
        cliente.setNombre("Andres");
        cliente.setTelefono("3017345678");
        cliente.setCredito(200.50);

        System.out.println("los datos  del cliente son: "+ "\n" + cliente.getEdad() + "\n" + cliente.getNombre()+ "\n" + cliente.getTelefono() + "\n" + cliente.getCredito()  );

        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(45);
        trabajador.setNombre("Willy");
        trabajador.setTelefono("3013456789");
        trabajador.setSalario(450.99);

        System.out.println("los datos del trabajador son:  "+ "\n" + trabajador.getEdad() + "\n" + trabajador.getNombre()+ "\n" + trabajador.getTelefono() + "\n" + trabajador.getSalario()  );

    }







}