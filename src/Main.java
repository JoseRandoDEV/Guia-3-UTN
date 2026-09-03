import java.util.Scanner;

void main() {

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
            case 1 -> ejercicio1(scanner);
            case 2 -> ejercicio2();
            case 3 -> ejercicio3(scanner);
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

public void ejercicio1(Scanner scanner) {
    Empleado empleado1 = new Empleado(23456345, "Carlos", "Gutierrez", 25000);
    Empleado empleado2 = new Empleado(34234123, "Ana", "Sanchez", 27500);

    System.out.println("\n-------------- DATOS DE LOS EMPLEADOS ----------------------");
    System.out.println("Empleado [Dni: " + empleado1.getDni() + " | " + "Nombre: " + empleado1.getNombre() + " | " + empleado1.getApellido() + " | " + "Sueldo:" + empleado1.getSalario() + "]");
    System.out.println("Empleado [Dni: " + empleado2.getDni() + " | " + "Nombre: " + empleado2.getNombre() + " | " + empleado2.getApellido() + " | " + "Sueldo:" + empleado2.getSalario() + "]");

    System.out.print("\nIngrese el porcentaje que desea aumentar el sueldo a Carlos: ");
    double aumento = scanner.nextDouble();
    scanner.nextLine();

    empleado1.aplicarAumento(aumento);
    System.out.println("\nEl salario con aumento de " + empleado1.getNombre() + " es de $" + empleado1.getSalario());

    char res;

    do {
        System.out.print("Desea calcular el sueldo anual (s/n): ");
        res = scanner.next().charAt(0);
        scanner.nextLine();

        if (res == 's' || res == 'S') {
            double sueldoAnual = empleado1.calculoSalarioAnual();
            System.out.println("\nEl calculo anual del salario de " + empleado1.getNombre() + " es de: " + sueldoAnual);
            System.out.println("\n");

        } else if (res == 'n' || res == 'N') {
            System.out.println("\nGracias por utilizar el sistema....\n");
        } else {
            System.out.println("Tecla incorrecta...\n");
        }

    } while (res != 's' && res != 'S' && res != 'n' && res != 'N');

    System.out.println("------------ ID DE EMPLEADOS --------------");
    System.out.println("Id:" + empleado1.getId() + " " + empleado1.getNombre());
    System.out.println("Id:" + empleado2.getId() + " " + empleado2.getNombre());
    System.out.println("--------- CONTADOR DE EMPLEADOS -----------");
    System.out.println("Total de empleados: " + empleado2.getContador());
}

public void ejercicio2() {
    Cuenta_Bancaria cuentaBancaria = new Cuenta_Bancaria(1, "Jose", 15000);
    double resultadoBalance = cuentaBancaria.credito();
    System.out.printf("\nCon un deposito de $2500 el balance Total es de: $ %.2f ", resultadoBalance);
    System.out.printf("\n\n");

    double resultadoExtraccion = cuentaBancaria.debito();
    System.out.printf("\nRealizando una extraccion de $ 1500, el balance es de: $ %.2f", resultadoExtraccion);
    System.out.printf("\n");

    double resultadoExtraccio2 = cuentaBancaria.debito2();
    System.out.printf("\nRealizando una extraccion de $ 30000, el balance es de: $ %.2f", resultadoExtraccio2);
    System.out.printf("\n");

    double resultadoBalanceFinal = cuentaBancaria.imprimir();
    System.out.printf("\nEl Balance final de: $ %.2f", resultadoBalanceFinal);
    System.out.printf("\n\n");
}

public void ejercicio3(Scanner scanner) {

    int opcion2;
    ItemVenta venta = null;

    do {
        submenuEjercicio3();
        opcion2 = scanner.nextInt();
        scanner.nextLine();

        switch (opcion2) {
            case 1 -> {
                venta = new ItemVenta();
                agregarItem(scanner, venta);
            }
            case 2 -> mostrarItem(venta);
            case 3 -> ingresarNuevaCantidad(scanner, venta);
            case 4 -> nuevoPrecioUnitario(scanner, venta);
            case 5 -> precioTotal(venta);
            case 0 -> System.out.println("\nRegresando al menu principal...\n");
        }

    } while (opcion2 != 0);
}

public void submenuEjercicio3() {
    System.out.println("\n------------ SUB MENU ITEMS -----------");
    System.out.println("1- Agregar Item");
    System.out.println("2- Mostrar Item");
    System.out.println("3- Ingresar nueva cantidad");
    System.out.println("4- Ingresar nuevo precio unitario");
    System.out.println("5- Imprimir precio total");
    System.out.println("0- Regresar al menu anterior");
    System.out.print("\nIngrese su opcion: ");
}

public void agregarItem(Scanner scanner, ItemVenta venta) {
    System.out.println("\n========== INGRESO DE PRODUCTOS =========");
    System.out.print("ID del producto: ");
    venta.setId(scanner.nextInt());
    scanner.nextLine();

    System.out.print("Descripcion: ");
    venta.setDescripcion(scanner.nextLine());

    System.out.print("Cantidad: ");
    venta.setCantidad(scanner.nextInt());

    System.out.print("Precio unitario: ");
    venta.setPrecioUnitario(scanner.nextDouble());
    scanner.nextLine();
    System.out.println("=========================================");
}

public void mostrarItem(ItemVenta venta){
    if (venta == null){
        System.out.println("\nError, Ingrese el item ....\n");
    }else {
        System.out.println("\n" + venta.mostrarInformacion());
    }
}

public void ingresarNuevaCantidad(Scanner scanner, ItemVenta venta){
    System.out.print("Ingrese la nueva cantidad: ");
    venta.setCantidad(scanner.nextInt());
    System.out.println("Cantidad actualizada correctamente...\n");
    System.out.println(venta.mostrarInformacion());
}

public void nuevoPrecioUnitario(Scanner scanner, ItemVenta venta){
    System.out.print("Ingrese el nuevo precio unitario: ");
    venta.setPrecioUnitario(scanner.nextDouble());
    System.out.println("Precio actualizado correctamente...\n");
    System.out.println(venta.mostrarInformacion());
}

public void precioTotal(ItemVenta venta){
    System.out.println("\nEl precio Total de la factura es $" + venta.calculaPrecioTotal(venta.getCantidad(), venta.getPrecioUnitario()));
}