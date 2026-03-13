import java.util.Scanner;

public class Uni03Exe10 {

    // entrada: catetttoOposto, catetoAdjacente
    // saida: hipotenusa
    // processo:
    // hipptenusa² = catetoOposto² + catetoAdjacente²
    // hipotenusa= raiz quadrada (hipotenuza)

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("catetoOposto: ");
        double catetoOposto = s.nextDouble();
        

        System.out.print("catetoAdjacente: ");
        double catetoAdjacente = s.nextDouble();

        double hipotenusa = catetoOposto * catetoOposto + Math.pow(catetoAdjacente, 2);

        hipotenusa = Math.sqrt(hipotenusa);
        System.out.print(hipotenusa);

        s.close();
    }

}