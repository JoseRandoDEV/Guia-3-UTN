public class Cuenta_Bancaria {
    private int id;
    public String nombre;
    public double balance;

    public Cuenta_Bancaria(int id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public Cuenta_Bancaria() {
    }

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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credito(){
        return balance = balance + 2500;
    }

    public double debito() {
        if (balance >= 1500) {
            return balance = balance - 1500;
        }else {
            return balance;
        }
    }

    public double debito2(){
        if (balance >= 30000){
            return balance = balance - 30000;
        }else {
            return balance;
        }
    }

    public double imprimir(){
        return balance;
    }
}

