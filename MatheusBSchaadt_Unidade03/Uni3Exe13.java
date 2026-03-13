import java.util.Scanner;

//entradas: altura, comprimento
//saidas: valor final
//processo: valorFinal = (altura * comprimento) * 9) *12.50f;

public class Uni3Exe13 {
    public static void main(String[] args) {
        
        Scanner parede = new Scanner(System.in);
        System.out.print("altura: ");
        float altura = parede.nextFloat();

        System.out.print("comprimento: ");
        float comprimento = parede.nextFloat();

        float valorFinal = ((altura * comprimento) * 9) *12.50f;

        System.out.print("O valor final é R$" +  valorFinal);

        

        parede.close();



        
    }




    
}
