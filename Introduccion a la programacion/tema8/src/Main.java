// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
           Persona persona = new Persona();
           persona.setEdad(34);
           persona.setNombre("Marcelo");
           persona.setTelefono("2212097");
           System.out.println("la persona tiene estos datos: " +persona.getNombre()+ " " + persona.getEdad() + " " + persona.getTelefono());
        }
    }
