import java.util.Scanner;

public class Uni3Exe06 {

   //entrada pesoPrato
   //saida: valorPagar
   //proceso: pesoPrato * 25(valorDoQuilo)

   public static void main(String[] args) {
    
        Scanner peso = new Scanner(System.in);
        System.out.print("peso do prato em kg:");
        double pesoPrato = peso.nextDouble();

        double valorPagar = pesoPrato * 25;
        System.out.print("O valor do prato do cliente é R$" + valorPagar);
        peso.close();
   }


}
