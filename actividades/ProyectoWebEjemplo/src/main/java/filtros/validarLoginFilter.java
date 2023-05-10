package filtros;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class validarLoginFilter
 */
@WebFilter("/login")
public class validarLoginFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public validarLoginFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse respuesta = (HttpServletResponse) response;
		Boolean validado = true;
		Enumeration <?> nombres = req.getParameterNames();
		
		while(nombres.hasMoreElements()) {
			
			String parametro = (String) nombres.nextElement();
			
			
			if(req.getParameter(parametro).isEmpty()) {
				request.setAttribute("error".concat(parametro), "El parametro " + parametro + " esta vacio.");
				if(validado) {
					validado = false;
				}
			}
			
		}
		
		if(!validado) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		} else {
			chain.doFilter(request, response);
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
