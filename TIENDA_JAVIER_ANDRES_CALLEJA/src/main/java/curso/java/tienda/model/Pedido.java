package curso.java.tienda.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Pedido {
    private int id;
    private int usuarioId;
    private Timestamp fecha;
    private String metodoPago;
    private String numFactura;
    private double total;

    public Pedido(int id, int usuarioId, Timestamp fecha, String metodoPago, String numFactura, double total) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
        this.numFactura = numFactura;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
