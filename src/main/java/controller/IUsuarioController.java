package controller;

import java.util.Map;

public interface IUsuarioController {

    public String login(String username, String contrasena);

    public String register(String username, String contrasena,
            String nombres, String apellidos, String ciudad, String telefono);

    public String pedir(String username);

}
