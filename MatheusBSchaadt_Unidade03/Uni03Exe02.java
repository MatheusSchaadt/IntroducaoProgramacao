import java.util.Scanner;

public class Uni03Exe02 {

    //analise:
    //entradas: valor produto, 
    //saidas:valor do desconto e valor do produto com desconto
    //processo:
    // valor do desconto = valor do produto * 0.12
    // valor do pruduto - valor desconto
    //fluxogramas:

public static void main(String[] args) {
    Scanner Produto = new Scanner(System.in);
    System.out.print("valor do calçado: ");
    float valorProduto = Produto.nextFloat();   

    float desconto = valorProduto * (12) / 100;
    float precoFinal = valorProduto - desconto;

    System.out.println("o valor de desconto é R$" + desconto);
    System.out.println("O preço do par de sapatos com desconto é R$" + precoFinal);
    Produto.close();





    
    
    

    


}




}



