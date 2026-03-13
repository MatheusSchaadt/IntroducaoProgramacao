import java.util.Scanner;

//entradas: fahrenheit
//saidas: celsius
//processo: celsius = ((fahrenheit*9/5)+32);

public class Uni3Exe11 {

    public static void main(String[] args) {
        
        Scanner f = new Scanner(System.in);
        System.out.print("fahrenheit: ");
        float fahrenheit = f.nextFloat();
        float celsius = ((fahrenheit*9/5)+32);

        System.out.print(celsius);

        f.close();


    }
    
}
