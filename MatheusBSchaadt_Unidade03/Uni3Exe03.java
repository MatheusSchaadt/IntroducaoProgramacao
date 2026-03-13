import java.util.Scanner;

public class Uni3Exe03 {

    // analise: sera usado em rs
    // entrada: valor da gasolina, valor pagamento
    // saida:quantidade de litros
    // processo valor do pagamento / valor da gasolina

    public static void main(String[] args) {

        Scanner valorGasolina = new Scanner(System.in);
        System.out.print("Valor do pagamento: ");
        float valorPagamento = valorGasolina.nextFloat();

        float precoFinal = valorPagamento / (5.75f);

        System.out.print("O motorista conseguiu colocar: " + precoFinal);
        
        valorGasolina.close();
        
    }

}
