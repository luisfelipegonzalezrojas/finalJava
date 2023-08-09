package B4;
import java.util.Scanner;
import java.util.InputMismatchException;

public class trabajo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                System.out.print("ingrese el primer numero: ");
                double numero1 = scanner.nextDouble();
                System.out.print("ingrese el segundo numero: ");
                double numero2 = scanner.nextDouble();

                if (numero2 == 0) {
                    System.out.println("Error: División por cero.");
                } else {
                    double resultado = numero1 / numero2;
                    System.out.println("Resultado de la división: " + resultado);
                }

            } catch (InputMismatchException e){
                System.out.println("Error: Ingrese un valor numérico válido.");
                scanner.next();
            } catch (Exception e){
                System.out.println("Ha ocurrido un error inesperado.");

            }
            System.out.print("¿Desea realizar otra división? (sí/N): ");
            String continuar = scanner.next();

            if (!continuar.equalsIgnoreCase("si")) {
                System.out.println("¡Hasta luego!");
                break;
            }

        }
        scanner.close();
    }
}
