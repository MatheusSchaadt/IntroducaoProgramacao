import java.util.Scanner;

/*entrada: valorTotalCompra, valorDado
saida: número mínimo de notas de troco qtd 100, qtnd10, qt1
processo:valor do troco = valorDado - valorTotalCompra  
 qtdNotas100 = valor do troco / 100   
qtdNotas10 = valor do troco % 100 / 10
 qtdNotas1 = valor do troco % 10
 minimo = qtdNotas100 + qtdNotas10 + qtdNotas1

*/

public class Uni3Exe16 {

public static void main(String[] args) {
    
    Scanner notas = new Scanner(System.in);
    System.out.print("valor total da compra: ");
    int valorTotal = notas.nextInt();

    System.out.print("valor dado pelo cliente: ");
    int valorDado = notas.nextInt();
    
    int troco = valorDado - valorTotal;

    int nota100 = troco /100;
    troco = troco % 100;
    int nota10 = troco  / 10;
    int nota1 = troco % 10;

    int minimo = nota1 + nota10 + nota100;

    System.out.println("O número mínimo de notas de troco é:" + minimo);
    System.out.println("Notas de R$ 100: " + nota100);
    System.out.println("Notas de R$ 10: " + nota10);
    System.out.println("Notas de R$ 1: " + nota1);
    

    notas.close();
}
}
    
