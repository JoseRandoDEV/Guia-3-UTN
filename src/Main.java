import  java.util.Scanner;

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

    do{
        menu_principal(); //LLAMADA AL METODO O FUNCION
        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion){  //SWITCH MAS LIMPIO CON -> Y SIN BREAK
            case 1 -> System.out.println(VERDE + "Ejercicio 1" + RESET);
            case 2 -> System.out.println(VERDE + "Ejercicio 2" + RESET);
            case 3 -> System.out.println(VERDE + "Ejercicio 3" + RESET);
            case 0 -> System.out.println(ROJO + "\nSaliendo del sistema..." + ROJO);
            default -> System.out.println(AMARILLO + "Ingrese una opcion correcta..." + RESET);
        }

    }while (opcion != 0);
scanner.close();
}

public void menu_principal(){
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