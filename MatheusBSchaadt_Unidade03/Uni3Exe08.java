import java.util.Scanner;

public class Uni3Exe08 {

  //entrada: quantidadeDeDolares
  //saidas: quantidadeDeReais
  //processo: QuantidadeDeReais = quantidadeDedolares  * 5.65(valorDoDolar)
    
public static void main(String[] args){
    
    Scanner cliente = new Scanner(System.in);
        System.out.print("Valor em dólares: ");
        float dolar = cliente.nextFloat();

        float reais = dolar * 5.65f;

        System.out.print("O atendente deve devolver R$" + (reais)  + " para o cliente.");


        cliente.close();

        }





}
