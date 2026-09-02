public class CuentaEnBanco {
    private String nombre;
    private double balance;
    private  int id;

    public CuentaEnBanco (){
        nombre = "";
        balance = 15000;
        id = 0;
    }
    public CuentaEnBanco(String nombre, double balance){
        this.nombre = nombre;
        this.balance = balance;
        this.id = (int) (Math.random() * 9000) + 1000;
    }
    public String getNombre(){return  this.nombre;}
    public double getBalance(){return this.balance;}
    public int getId(){return  this.id;}
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    double depositar(int deposito){
        this.balance += deposito;
        return this.balance;
    }
    double retirar(int retiro){
        if (balance >= retiro)
        {
            this.balance -= retiro;
            System.out.println("Operacion exitosa.");
        }
        else{
            System.out.println("Operacion invalida, saldo insufisiente.");
        }
        return this.balance;
    }
    void verDatos(){
        System.out.println("Nombre: "+nombre+"| Balance: $"+balance+"| Identificador: "+ id);
    }

}