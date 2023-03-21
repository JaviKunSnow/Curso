package F_excepciones.palabrareservadathrow;

public class MiExcepcion extends Exception  {
	
	
	
	public <E extends Exception> MiExcepcion(String mensaje, E excepcion)
	{
		super(mensaje);	
		manejarExcepcion(excepcion);
	}
	
	public <E extends Exception> void manejarExcepcion(E excepcion)
	{
		System.out.println(excepcion.getMessage());
		System.out.println(excepcion.getStackTrace());
	}

}

