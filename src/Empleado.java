public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private double salario;
    private static int contador=0;
    private int id = 0;

    public Empleado(int dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        contador = contador + 1;
        id = contador;
    }

    // GENERO UN CONSTRUCTOR VACIO ACOSTUMBRARSE A HACERLO SIEMPRE
    public Empleado() {
        contador = contador + 1;
        id = contador;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public static int getContador() {
        return contador;
    }

    public void aplicarAumento(double porcentajeAumento) {
        this.salario += this.salario * (porcentajeAumento / 100);
    }

    public double calculoSalarioAnual() {
        return this.salario * 12;
    }
}