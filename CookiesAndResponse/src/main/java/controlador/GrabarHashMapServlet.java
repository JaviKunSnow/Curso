package controlador;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/setCookieHashMap")
public class GrabarHashMapServlet extends HttpServlet {

	private static final long serialVersionUID = 7176400615123706882L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Crear un HashMap de Articulos
		HashMap<Integer, Articulo> articulos = new HashMap<Integer, Articulo>();

		// Crear 3 objetos Articulo y añadirlos al HashMap
		Articulo articulo1 = new Articulo(1, "Articulo1");
		Articulo articulo2 = new Articulo(2,  "Articulo2");
		Articulo articulo3 = new Articulo(3,  "Articulo3");

		articulos.put(articulo1.getId(), articulo1);
		articulos.put(articulo2.getId(), articulo2);
		articulos.put(articulo3.getId(), articulo3);

		// Convertir el HashMap en una cadena de texto JSON
		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(articulos);

		try {
		    // Codificar el valor de la cookie
		    String encodedJson = URLEncoder.encode(json, "UTF-8");

		    // Crear una cookie y almacenar la cadena de texto JSON codificada en ella
		    Cookie cookie = new Cookie("articulos", encodedJson);
		    response.addCookie(cookie);
		    
		    request.getRequestDispatcher("index.jsp").forward(request, response);
	           
		} catch (UnsupportedEncodingException e) {
		    e.printStackTrace();
		}
	}

	
}