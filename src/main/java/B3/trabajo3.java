package B3;
import java.util.Scanner;
public class trabajo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("hola, solicita alguna de las opciones para asistirte: 1)login 2)comprar boleta 3) vender boleta ");
        int Opcion = scanner.nextInt();
        String usuario = "felipe05";
        String contraseñareal="clasejava";


        switch (Opcion){
            case 1:
                scanner.nextLine();
                  System.out.println("escribe tu usuario:  ");
                 String pass = scanner.nextLine();

                System.out.println("escribe tu contraseña:  ");
                String contrasena = scanner.nextLine();

                if (pass.equals("felipe05")&& contrasena.equals("clasejava")) {
                    System.out.println("bienvenido");
                }else {System.out.println("digite el usuario nuevamente"); }

                    }
                }








        }



