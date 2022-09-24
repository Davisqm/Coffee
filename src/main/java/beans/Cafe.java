package beans;

public class Cafe {

    private int id;
    private int factor;
    private int kilos_disponibles;
    private String descripcion_producto;
    private int precio_kilo;

    public Cafe(int id, int factor, int kilos_disponibles, String descripcion_producto, int precio_kilo) {
        this.id = id;
        this.factor = factor;
        this.kilos_disponibles = kilos_disponibles;
        this.descripcion_producto = descripcion_producto;
        this.precio_kilo = precio_kilo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFactor() {
        return factor;
    }

    public void setFactor(int factor) {
        this.factor = factor;
    }

    public int getKilos_disponibles() {
        return kilos_disponibles;
    }

    public void setKilos_disponibles(int kilos_disponibles) {
        this.kilos_disponibles = kilos_disponibles;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public int getPrecio_kilo() {
        return precio_kilo;
    }

    public void setPrecio_kilo(int precio_kilo) {
        this.precio_kilo = precio_kilo;
    }

    @Override
    public String toString() {
        return "Cafe{" + "id = " + id + ", factor = " + factor + ", kilos_disponibles = " + kilos_disponibles + ", descripcion_producto = " + descripcion_producto + ", precio_kilo = " + precio_kilo + '}';
    }

    
}
