package modelo;

public class Articulo {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private String imagen;
    private int cantidad;

    
    
    public Articulo(){
    	
    }
    
    // Constructor
    public Articulo(int id, String nombre, String descripcion, double precio, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

	public int getCantidad() {
		// TODO Auto-generated method stub
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		// TODO Auto-generated method stub
		this.cantidad = cantidad;
		
	}
}
