package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EjemplosUsosResponse
 */
@WebServlet("/ejemplos")
public class EjemplosUsosResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EjemplosUsosResponse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		// Establecer el código de estado a 200 (OK)
	    response.setStatus(HttpServletResponse.SC_OK);

	    // Obtener el objeto PrintWriter para escribir la respuesta
	    PrintWriter out = response.getWriter();

	    // Escribir la respuesta en el cuerpo de la respuesta
	    out.println("<html><body>");
	    out.println("<h1>Ejemplo de configuración del código de estado HTTP</h1>");
	    out.println("<p>El código de estado de la respuesta ha sido configurado a " + HttpServletResponse.SC_OK + "</p>");
	    out.println("</body></html>");
	  
	    // Agregar una cabecera HTTP
	    response.addHeader("MiCabecera", "Valor de mi cabecera");
	    
	    // Obtener una cabecera HTTP
	    String valorCabecera = request.getHeader("CabeceraRequerida");
	    
	    // Modificar una cabecera HTTP
	    response.setHeader("MiCabecera", "Nuevo valor de mi cabecera");
	    
	    // Eliminar una cabecera HTTP
	    response.setHeader("CabeceraAEliminar", null);
	    
	    // Enviar la respuesta
	    out.write("Respuesta con cabeceras HTTP configuradas");
	   
	    
	    // Configurar tipo MIME y nombre del archivo
	    response.setContentType("application/pdf");
	    response.setHeader("Content-Disposition", "attachment;filename=myfile.pdf");
	    
	    // Crear flujo de salida y enviar el archivo
//	    OutputStream outStream = response.getOutputStream();
//	    FileInputStream fileStream = new FileInputStream("ruta/al/archivo.pdf");
//	    byte[] buffer = new byte[4096];
//	    int bytesRead = -1;
//	    while ((bytesRead = fileStream.read(buffer)) != -1) {
//	        outStream.write(buffer, 0, bytesRead);
//	    }
//	    fileStream.close();
//	    outStream.flush();
//	    outStream.close();
//	    
//	    response.setCharacterEncoding("UTF-8");
//	    
//	 // Obtener el recurso solicitado
//	    String resource = request.getRequestURI();
//
//	    // Verificar si el recurso existe
//	    if (resource == null || resource.isEmpty()) {
//	        // Establecer el código de estado 404 y enviar la página de error predeterminada
//	        response.sendError(HttpServletResponse.SC_NOT_FOUND);
//	    } else {
//	        // Si el recurso existe, procesar la solicitud normalmente
//	        // ...
//	    }
//	    
//	    
//	    
//	 // Obtener la fecha y hora actual
//	    Calendar calendar = Calendar.getInstance();
//	    // Añadir 1 hora al tiempo actual
//	    calendar.add(Calendar.HOUR, 1);
//	    // Convertir la fecha y hora a un formato compatible con HTTP
//	    SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
//	    dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
//	    String expires = dateFormat.format(calendar.getTime());
//
//	    // Establecer las cabeceras de caché en la respuesta
//	    response.setHeader("Cache-Control", "public, max-age=3600");
//	    response.setHeader("Expires", expires);
//	    
//	    
//	    // Verificar si el parámetro "username" está presente en la solicitud
//        String username = request.getParameter("username");
//        if (username == null) {
//            // Redirigir al usuario a una página de inicio de sesión
//           // response.sendRedirect("index.jsp");
//          
//        }
        
	    
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
