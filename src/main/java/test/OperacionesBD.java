package test;

import beans.Cafe;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {

    public static void main(String[] args) {
        listarCafe();

    }

    public static void actualizarCafe(int id, int factor) {

        DBConnection con = new DBConnection();
        String sql = "UPDATE cafe SET factor =  '" + factor + "'WHERE id_producto = " + id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        } 
    }

    public static void listarCafe() {

        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM cafe";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                int factor = rs.getInt("factor");
                int kilos_disponibles = rs.getInt("kilos_disponibles");
                String descripcion = rs.getString("descripcion");
                int precio_kilo = rs.getInt("precio_kilo");

                Cafe cafe = new Cafe(id, factor, kilos_disponibles, descripcion, precio_kilo);
                System.out.print(cafe.toString());

            }
            
            st.executeQuery(sql);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }
}
