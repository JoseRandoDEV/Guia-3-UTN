import  java.util.Scanner;

void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println("Trabajos Practicos de la Guia 3");
    IO.println("");
    Scanner scanner = new Scanner(System.in);
    int opcion;

    do{
        System.out.println("========== MENU OPCIONES ==========");
        System.out.println("1- Ejercicio 1 ");
        System.out.println("2- Ejercicio 2 ");
        System.out.println("3- Ejercicio 3 ");
        IO.println("===================================");
        System.out.println("0- Salir ");
        IO.println("");

        IO.print("Ingrese Su opcion: ");
        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion){
            case 1:
                IO.println("Ejercicio 1");
                break;
            case 2:
                IO.println("Ejercicio 2");
                break;
            case 3:
                IO.println("Ejercicio 3");
                break;
            case 0:
                IO.println("Saliendo del sistema...");
                break;
            default:
                IO.println("Ingrese una opcion correcta...");
                break;
        }

    }while (opcion != 0);

scanner.close();

}
