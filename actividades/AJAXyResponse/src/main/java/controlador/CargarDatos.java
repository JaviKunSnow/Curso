package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;

@WebServlet("/cargarDatos")
public class CargarDatos extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Creamos una lista de Map para representar los objetos
        List<Map<String, String>> objetos = new ArrayList<>();
        // Agregamos cada objeto a la lista
        Map<String, String> objeto1 = new HashMap<>();
        objeto1.put("nombre", "Objeto 1");
        objeto1.put("descripcion", "Esta es la descripción del objeto 1.");
        objetos.add(objeto1);

        Map<String, String> objeto2 = new HashMap<>();
        objeto2.put("nombre", "Objeto 2");
        objeto2.put("descripcion", "Esta es la descripción del objeto 2.");
        objetos.add(objeto2);

        Map<String, String> objeto3 = new HashMap<>();
        objeto3.put("nombre", "Objeto 3");
        objeto3.put("descripcion", "Esta es la descripción del objeto 3.");
        objetos.add(objeto3);

        Map<String, String> objeto4 = new HashMap<>();
        objeto4.put("nombre", "Objeto 4");
        objeto4.put("descripcion", "Esta es la descripción del objeto 4.");
        objetos.add(objeto4);

        Map<String, String> objeto5 = new HashMap<>();
        objeto5.put("nombre", "Objeto 5");
        objeto5.put("descripcion", "Esta es la descripción del objeto 5.");
        objetos.add(objeto5);

        // Convertimos la lista de objetos a formato JSON
        Gson gson = new Gson();
        String json = gson.toJson(objetos);
        // Escribimos la respuesta en el objeto HttpServletResponse
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.print(json);
        
        //ES MUY IMPORTANTE
        out.flush();
    }
}
