package VIP_BANCO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BancoVip bancoVip = new BancoVip();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n================");
            System.out.printf("  ||  Menú ||");
            System.out.println("\n================");
            System.out.println("\n1.Registrar cliente");
            System.out.println("2. Registrar cliente vip");
            System.out.println("3. Atender cliente");
            System.out.println("4. Mostrar fila");
            System.out.println("5. Salir");
            System.out.println(" Seleccionar una opción:");
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion){
                case 1:
                    System.out.println("Nombre del cliente:");
                    bancoVip.agregarClienteNormal(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Nombre del cliente Vip:");
                    bancoVip.agregarClienteVip(scanner.nextLine());
                    break;
                case 3:
                    bancoVip.atenderCliente();
                    break;
                case 4:
                    bancoVip.mostrarFila();
                    break;
                case 5:
                    System.out.println("Saliwndo del sistema");
                    break;
                default:
                    System.out.println("opcion invalida.");
                    break;
            }
        }while (opcion != 5);
        scanner.close();
    }
}