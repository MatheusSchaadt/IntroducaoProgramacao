import java.util.Scanner;

public class Uni3Exe07 {


        //entrada: quantidade de 350ml,600ml,2l
        //saida: totalLitros
        //proceso:converter ml em litros
        // quantidade de 350ml  * 0.35 = lata
        // quantidade de 600ml  * 0.6 = garrafa600
        // quantidade de  2l  * 2.0(n precisa) = garrafa2L
        // lata + garrafa600 + garrafa2L = totalLitros

        public static void main(String[] args) {

                Scanner litros = new Scanner(System.in);
                System.out.print("Quantidade de 350ml: ");
                float lata = litros.nextFloat();

                System.out.print("Quantidade de 600ml: ");
                Float garrafa600 = litros.nextFloat();

                System.out.print("Quantidade de 2l: ");
                float garrafa2L = litros.nextFloat();

                float litrosTotal = (lata * 0.35f) + (garrafa600 * 0.6f) + (garrafa2L * 2.0f);

                System.out.print("O cliente comprou ao total " + (litrosTotal) + " litros");

                litros.close();

        }

}
