package controlador;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class DecodificarCookieHashMap
 */

@WebServlet("/decodificarCookieHashMap")
public class DecodificarCookieHashMap extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DecodificarCookieHashMap() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String usuario = request.getParameter("usuario");
		
		
		ObjectMapper objectMapper = new ObjectMapper();
			
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("articulos")) {
					String decodedJson = URLDecoder.decode(c.getValue(), "UTF-8");

					// Convertir la cadena de texto JSON decodificada en un HashMap de Articulos
					HashMap<Integer, Map<String, Object>> map = objectMapper.readValue(decodedJson, HashMap.class);
					HashMap<Integer, Articulo> articulosRecuperados = new HashMap<Integer, Articulo>();
					for (Map.Entry<Integer, Map<String, Object>> entry : map.entrySet()) {
						Integer id = entry.getKey();
						Map<String, Object> articuloMap = entry.getValue();
						String nombre = (String) articuloMap.get("nombre");						
						Articulo articulo = new Articulo(id, nombre);
						articulosRecuperados.put(id, articulo);
					}

					// Imprimir el HashMap de Articulos en la consola
					System.out.println("Contenido de la cookie de Articulos:");
					System.out.println(articulosRecuperados);
				}
			}
		}

		request.getRequestDispatcher("index.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

