public class ItemVenta {
    private int id;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public ItemVenta(int id, String descripcion, int cantidad, double precioUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public ItemVenta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double calculaPrecioTotal(int cantidad, double precioUnitario) {
        return cantidad * precioUnitario;
    }

    public String mostrarInformacion(){
        return "ItemVenta[id:" + id + "| Descripcion: " + descripcion + "| Cantidad: " + cantidad + "| Precio Unitario: $ " + precioUnitario + "| Total: $" + calculaPrecioTotal(cantidad, precioUnitario) + "]";
    }
}
