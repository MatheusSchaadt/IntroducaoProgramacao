import java.util.Scanner;

public class Uni03Exe01 {

    // analise: sera considerado m
    // entradas:largura, comprimento
    // saidas: area
    // processos:area= largura * comprimento
    // fluxogramas:

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
            System.out.print("digiete a largura(m): ");
            float largura = leitor.nextFloat();
            System.out.println("digite o comprimento(m): ");
            float comprimento = leitor.nextFloat();

            float area = largura * comprimento;

            System.out.print("area = " + area + "m²");

            leitor.close();
        }

    }


    
