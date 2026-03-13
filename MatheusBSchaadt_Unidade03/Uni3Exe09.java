import java.util.Scanner;

public class Uni3Exe09 {

    //entrada: raio, altura
    //saidas volume
    //proceso: volume = pi(3.13159) * raio² * altura

    public static void main(String[] args) {
        
        Scanner pi = new Scanner(System.in);
        System.out.print("raio: ");
        float raio = pi.nextFloat();

        System.out.print("altura: ");
        float altura = pi.nextFloat();

        float volume = 3.14159f * (raio*raio) * altura;

        System.out.print(volume);

        pi.close();





    }







    
}
