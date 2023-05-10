package controlador;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/control")
public class ControlArticulosCarritoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	System.out.println("llamamos");
        Random rand = new Random();
        boolean resultado = rand.nextBoolean();
        String mensaje = resultado ? "Se ha añadido un artículo al carrito" : "";

        // Crear objeto JSON con los datos que se quieran enviar al cliente
        Gson gson = new Gson();
        String json = gson.toJson(new ControlArticulosCarritoResponse(resultado, mensaje));

        // Escribir respuesta en formato JSON
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.print(json);
        out.flush();
    }
}

class ControlArticulosCarritoResponse {
    boolean resultado;
    String mensaje;

    public ControlArticulosCarritoResponse(boolean resultado, String mensaje) {
        this.resultado = resultado;
        this.mensaje = mensaje;
    }
}
