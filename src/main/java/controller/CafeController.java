package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import beans.Cafe;
import connection.DBConnection;

public class CafeController implements ICafeController {

    @Override
    public String listar(boolean ordenar, String orden) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Select * from peliculas";

        if (ordenar == true) {
            sql += " order by factor " + orden;
        }

        List<String> cafes = new ArrayList<String>();

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

                cafes.add(gson.toJson(cafe));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
            return gson.toJson(cafes);

    }

}
