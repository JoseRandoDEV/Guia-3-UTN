public class Empleado {
    private String nombre;
    private String apellido;
    private String dni;
    private double salario;

    public Empleado() {
        nombre = "";
        apellido = "";
        dni = "";
        salario = 0;
    }

    public Empleado(String nombre, String apellido, String dni, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getDni() {
        return this.dni;
    }

    double salarioAnual() {

        double anual = 12 * this.salario;

        return anual;
    }

    double incrementoSalarial(double pIngresado) {
        this.salario += ((pIngresado / 100) * salario);
        return this.salario;
    }

    void verDatos() {

        System.out.println("Empleado[Dni= " + dni + ", Nombre= " + nombre + ", Apellido= " + apellido + ", Salario=$" + salario + "]");
    }

}
