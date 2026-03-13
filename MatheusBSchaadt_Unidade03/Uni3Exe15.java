import java.util.Scanner;

public class Uni3Exe15 {


    //entrada:numero
    //saida: centena, dezena e unidade
    //processo:
    // centena = numero /100
    //numero = numero % 100 ---> resto
    //dezena = numero /10
    //unidade = numero % 10





    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);
        System.out.print("digite um numero inteiro de no maximo 3 digitos: ");
        int numeroInt = numero.nextInt();

        int centena = numeroInt / 100;
        numeroInt = numeroInt % 100; 
        int dezena = numeroInt /10;
        int unidade = numeroInt % 10;

        System.out.print(centena + " centena(s) " + dezena + " dezena(s) " + unidade + " unidade(s)");
    

        numero.close();

    }

}
