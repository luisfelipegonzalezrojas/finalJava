package B1;
//Trabajo en clase

//1)Deben desarrolla un software que calcule el menor de 2 numero declarados anteriormente.
//        2)Deben desarrolla un software que calcule su edad a partir del anio de nacimiento
public class trabajoenclase {

    public static void main(String[] args) {
        int var1= 3;
        int var2 = 4;

        if( var1 > var2 ){
            System.out.println("la variable 1 es mayor");

        }else{
            System.out.println("la variable 2 es mayor");

        }
        final int añonacimiento= 1990;
        int añosactual= 2023;

        int edad = añosactual - añonacimiento;
        System.out.println(edad);




    }

}
