import java.util.Scanner;

public class Uni3Exe05{

public static void main(String[] args) {
    //entrada:quantidade de galinha 
    // processo:quantidade de galinha * valor chip= total1
    //processo: quantidade de galinha * valor alimento  = total2
    // processo  total1 + total2
    //saidas; gasto total   


            Scanner galinhas = new Scanner(System.in);
            System.out.print("quantidade de galinha: ");
            float galinha = galinhas.nextFloat();
            
            float total1 =  galinha * 4;
            float total2 = ((galinha * 3.50f) * 2);
            float valorTotal = total1 + total2;

            System.out.print("O gasto total para marcar " + galinha + " é R$" + valorTotal);


            galinhas.close();







}







}