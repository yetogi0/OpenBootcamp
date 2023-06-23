public class SmartWatch extends  SmartDevice{
    private boolean gps;

    public SmartWatch() {
    }

    public SmartWatch(int capacidad, String marca, String nombre, boolean gps) {
        super(capacidad, marca, nombre);
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "gps=" + gps +
                ", capacidad=" + capacidad +
                ", marca='" + marca + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
