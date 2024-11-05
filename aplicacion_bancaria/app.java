import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        String nombre = "Mario Juarez";
        String tipoCuenta = "Debito";
        double saldo = 2000.99;
        int opcion = 0;

        System.out.println("***********************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoCuenta);
        System.out.println("Su saldo disponible es: " + saldo);
        System.out.println("\n***********************************");

        String menu = """
                *** Escriba el numero de la opcion deseada ***
                1 - Consulta de saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actualizado es: " + saldo + "$");
                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el saldo que desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actualizado es: " + saldo);
                    break;
                case 9:
                    System.out.println("Gracias por su visita");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }


    }
}
