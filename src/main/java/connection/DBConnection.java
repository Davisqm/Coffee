package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    Connection connection;

    static String bd = "coffee";
    static String port = "3307";
    static String login = "root";
    static String password = "admin";

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:" + this.port + "/" + this.bd;
            connection = DriverManager.getConnection(url, this.login, this.password);
            System.out.print("Conexión establecida");
        } catch (Exception ex) {
            System.out.print("Error de conexión");

        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void desconectar() {
        connection = null;

    }
}
