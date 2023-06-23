public class SmartPhone extends SmartDevice{

    public String referencia;
    public String gama;

    public SmartPhone() {
    }

    public SmartPhone(int capacidad, String marca, String nombre, String referencia, String gama) {
        super(capacidad, marca, nombre);
        this.referencia = referencia;
        this.gama = gama;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "referencia='" + referencia + '\'' +
                ", gama='" + gama + '\'' +
                ", capacidad=" + capacidad +
                ", marca='" + marca + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
