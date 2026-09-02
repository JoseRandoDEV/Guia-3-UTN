public class ItemVenta {
    /**identificador (int), descripcion (String), cantidad (int) y precioUnitario (double).**/
    private int id;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;


    public  ItemVenta(){
        id = 0;
        descripcion = "";
        cantidad = 0;
        precioUnitario = 0;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ItemVenta(int id, String descripcion, int cantidad, double precioUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
    double calcularPrecioTotal(){
       return cantidad * precioUnitario;
    }
     public String factura(){
        String mensaje = ("ItemVenta[id= " +id+ ", Descripcion= " +descripcion+ ", Cantidad= " +cantidad+ ", Precio Unitario= $" +precioUnitario+ ", Valor total= $" +calcularPrecioTotal()+"]");
        return mensaje;
    }
}
