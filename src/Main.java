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
            case 1 -> ejercicio1();
            case 2 -> System.out.println(VERDE + "Ejercicio 2" + RESET);
            case 3 -> System.out.println(VERDE + "Ejercicio 3" + RESET);
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

public void ejercicio1() {
    Empleado empleado1 = new Empleado(23456345, "Carlos", "Gutierrez", 25000);
    Empleado empleado2 = new Empleado(34234123, "Ana", "Sanchez", 27500);

    System.out.println("\n-------------- DATOS DE LOS EMPLEADOS ----------------------");
    System.out.println("Empleado [Dni: " + empleado1.getDni() + " | " + "Nombre: " + empleado1.getNombre() + " | " + empleado1.getApellido() + " | " + "Sueldo:" + empleado1.getSalario() + "]");
    System.out.println("Empleado [Dni: " + empleado2.getDni() + " | " + "Nombre: " + empleado2.getNombre() + " | " + empleado2.getApellido() + " | " + "Sueldo:" + empleado2.getSalario() + "]");

    Scanner ingreso_teclado = new Scanner(System.in);
    System.out.print("\nIngrese el porcentaje que desea aumentar el sueldo a Carlos: ");
    double aumento = ingreso_teclado.nextDouble();
    ingreso_teclado.nextLine();

    empleado1.aplicarAumento(aumento);
    System.out.println("\nEl salario con aumento de " + empleado1.getNombre() + " es de $" + empleado1.getSalario());
    //System.out.println("\n");
    Scanner respuesta = new Scanner(System.in);
    char res;

    do {
        System.out.print("Desea calcular el sueldo anual (s/n): ");
        res = respuesta.next().charAt(0);

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
}

