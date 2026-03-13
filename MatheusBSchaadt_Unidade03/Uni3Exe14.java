import java.util.Scanner;

//entradas: distância, tempo
//saidas: velocidade média, quantidade de combustível usado
//processo: velocidadeMedia = distancia / tempo
//litro = distancia / 12
public class Uni3Exe14 {

    public static void main(String[] args) {
        Scanner velocidade = new Scanner(System.in);
        System.out.print("Distância: ");
        float distancia = velocidade.nextFloat();

        System.out.print("tempo: ");
        float tempo = velocidade.nextFloat();

        float velocidadeMedia = distancia / tempo;

        float litro = distancia / 12;

        System.out.print("A velocidade média foi de " + (velocidadeMedia)
                + "km/h e a quantidade de combustível usado foi " + (litro) + " litros.");

            velocidade.close();
    }

}
