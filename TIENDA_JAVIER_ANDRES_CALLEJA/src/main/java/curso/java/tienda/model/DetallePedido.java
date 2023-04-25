package curso.java.tienda.model;

public class DetallePedido {
    private int id;
    private int pedidoId;
    private int productoId;
    private int unidades;
    private double precioUnidad;
    private double impuesto;
    private double total;

    public DetallePedido(int id, int pedidoId, int productoId, int unidades, double precioUnidad, double impuesto, double total) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.productoId = productoId;
        this.unidades = unidades;
        this.precioUnidad = precioUnidad;
        this.impuesto = impuesto;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
