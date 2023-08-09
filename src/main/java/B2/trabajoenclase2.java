package B2;

public class trabajoenclase2 {
    public static void main(String[] args) {
        int numerototal = 100;
String pares = "";
String impares="";
        for (int i = 0; i < numerototal ; i++) {

            if(i % 2 == 0){
                pares = pares+ i + "-";
            }else if(i %2!=0) {
                impares = impares+ i + "-";
            }
            else{
                System.out.print("el numero no es entero");
            }
        }
        System.out.println(pares);
        System.out.println(impares);
    }
}
