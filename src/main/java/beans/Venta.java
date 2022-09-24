package beans;

import java.sql.Date;

public class Venta {

    private int id;
    private String username;
    private Date fecha;
    private int total_compra;

    public Venta(int id, String username, Date fecha, int total_compra) {
        this.id = id;
        this.username = username;
        this.fecha = fecha;
        this.total_compra = total_compra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTotal_compra() {
        return total_compra;
    }

    public void setTotal_compra(int total_compra) {
        this.total_compra = total_compra;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", username=" + username + ", fecha=" + fecha + ", total_compra=" + total_compra + '}';
    }
    
    

}
