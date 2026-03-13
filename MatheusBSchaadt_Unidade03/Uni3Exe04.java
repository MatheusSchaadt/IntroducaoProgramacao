import java.util.Scanner;

public class Uni3Exe04 {
    //analise: calcular usando media ponderada
    // entrada: nota1 nota2 nota3
    //processo:notas * seus respectivos pesos
    //processo:nota1 + nota2 + nota3
    //processo: soma dos pesos
    //processo: soma das notas / soma dos pesos
    //saida; media

    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        System.out.print("nota 1: ");
        float nota1 = notas.nextFloat();
        System.out.print("nota 2: ");
        float nota2 = notas.nextFloat();
        System.out.print("nota 3: ");
        float nota3 = notas.nextFloat();

        float notasVezes = (nota1 * 5) + (nota2 * 3) + (nota3 * 2);
        float media = notasVezes / 10;
        System.out.print(media);

        notas.close();
        


    }



    









}
