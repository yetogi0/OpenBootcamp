public class SmartDevice {

    protected int capacidad;
    protected String marca;
    protected String nombre;

    public SmartDevice() {

    }

    public SmartDevice(int capacidad, String marca, String nombre) {
        this.capacidad = capacidad;
        this.marca = marca;
        this.nombre = nombre;
    }


    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
