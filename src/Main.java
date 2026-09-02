<<<<<<< Updated upstream
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
=======
import java.util.Scanner;

>>>>>>> Stashed changes
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println("Trabajos Practicos de la Guia 3");
    IO.println("Probando este forma de agregar la rama");

<<<<<<< Updated upstream
}
=======
    // CONSTANTES DE COLOR ANSI
    String RESET = "\u001B[0m";
    String ROJO = "\u001B[31m";
    String VERDE = "\u001B[32m";
    String AMARILLO = "\u001B[33m";
    String AZUL = "\u001B[34m";
    String CIAN = "\u001B[36m";

    System.out.println(CIAN + "\nTrabajos Practicos de la Guia 3\n" + RESET);

    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
        menu_principal(); //LLAMADA AL METODO O FUNCION
        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {  //SWITCH MAS LIMPIO CON -> Y SIN BREAK
            case 1 -> verEmpleados(scanner);
            case 2 -> verCuentaEnBanco(scanner);
            case 3 -> menu3(scanner);
            case 0 -> System.out.println(ROJO + "\nSaliendo del sistema..." + ROJO);
            default -> System.out.println(AMARILLO + "Ingrese una opcion correcta..." + RESET);
        }

    } while (opcion != 0);
    scanner.close();
}

public void menu_principal() {
    String AZUL = "\u001B[34m";
    String RESET = "\u001B[0m";
    System.out.println(AZUL + "========== MENU OPCIONES ==========" + RESET); //REEMPLACE TODOS LOS IO x SOUT
    System.out.println("1- Ejercicio 1 ");
    System.out.println("2- Ejercicio 2 ");
    System.out.println("3- Ejercicio 3 ");
    System.out.println(AZUL + "===================================" + RESET);
    System.out.println("0- Salir\n");
    System.out.print("Ingrese su opcion: ");
}

void verEmpleados(Scanner scanner) {
    Empleado miEmpleado = new Empleado("Carlos", "Gutiérrez", "23456345", 25000);
    Empleado miEmpleado2 = new Empleado("Ana", "Sánchez", "34234123 ", 27500);
    miEmpleado.verDatos();
    miEmpleado2.verDatos();

    double aumento = miEmpleado.salarioAnual();
    System.out.println("El salario anual de Carlos es:$"+aumento);

    System.out.println("Ingrese el porcentaje de aumento que desea.");
    int porcentaje = scanner.nextInt();
    scanner.nextLine();
    miEmpleado.incrementoSalarial(porcentaje);

    System.out.println("El salario actual de Carlos sumandole el 15% es:$"+miEmpleado.getSalario());
}
void verCuentaEnBanco(Scanner scanner) {
    CuentaEnBanco miBanco = new CuentaEnBanco("Maxi", 15000);
    System.out.println("Ingrese el monto a depositar.");
    int deposito = scanner.nextInt();
    scanner.nextLine();
    miBanco.depositar(deposito);
    miBanco.verDatos();
    System.out.println("Ingrese el monto a retirar.");
    int retiro = scanner.nextInt();
    scanner.nextLine();
    miBanco.retirar(retiro);
    miBanco.verDatos();
    System.out.println("Ingrese el monto a retirar.");
    retiro = scanner.nextInt();
    scanner.nextLine();
    miBanco.retirar(retiro);
    miBanco.verDatos();
}
void menu3(Scanner scanner){
    int op;
    ItemVenta miVenta = null;
    do {
        System.out.println("Ingrese una de las siguientes opciones:");
        System.out.println("1. Agregar ítem");
        System.out.println("2. Informacion del Item");
        System.out.println("3. Ingresar una nueva cantidad y actualiza el atributo");
        System.out.println("4. Ingresar un nuevo precio unitario");
        System.out.println("5. Factura");
        System.out.println("6. Salir");
        op = scanner.nextInt();
        scanner.nextLine();
        switch (op) {
            case 1 -> miVenta = agregarItem(scanner);
            case 2 -> {
                if (miVenta != null) {
                    System.out.println(miVenta.factura());
                } else {
                    System.out.println("No se registro carga previa.");
                }
            }
            case 3 -> {
                if (miVenta != null) {
                    miVenta.setCantidad(mCantidad(scanner));
                } else {
                    System.out.println("No se registro carga previa.");
                }
            }
            case 4 -> {
                if (miVenta != null) {
                    miVenta.setPrecioUnitario(mPrecioUnitario(scanner));
                } else {
                    System.out.println("No se registro carga previa.");
                }
            }
            case 5 -> {
                if (miVenta != null){
                    System.out.println("Precio total del producto: $"+miVenta.calcularPrecioTotal());
            }else{
                System.out.println("No se registro carga previa.");
            }
        }


            case 6-> System.out.println("Saliendo de la ejecucion.");
        }

    }while (op != 6);
}
ItemVenta agregarItem(Scanner scanner) {
    int id;
    String tipo;
    int cantidad;
    double precioUnidad;
    System.out.println("Ingrese el id.");
    id = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Ingrese tipo de item.");
    tipo = scanner.nextLine();
    System.out.println("Ingrese la cantidad.");
    cantidad = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Ingrese el precio unitario.");
    precioUnidad = scanner.nextDouble();
    scanner.nextLine();
    ItemVenta miVenta = new ItemVenta(id, tipo, cantidad, precioUnidad);

    return miVenta;
}

int mCantidad(Scanner scanner) {
    int cantidad;
    System.out.println("Ingrese la nueva cantidad.");
    cantidad = scanner.nextInt();
    scanner.nextLine();
    return cantidad;
}
double mPrecioUnitario(Scanner scanner){
    double precio;
    System.out.println("Ingrese el nuevo precio unitario.");
    precio = scanner.nextDouble();
    return precio;
}
>>>>>>> Stashed changes
