import java.util.Scanner;

public class Uni03Exe12 {

    //entradas: nome, horasTrabalhadas, dependentes 
    //saidas: salarioLiquido, salario Bruto
    //processo: horasTrabalhadas * 10 = salarioTrabalho
    //    dependentes * 60 = salarioFamilha
    //   salarioFamilha + salarioTrabalho = salarioBruto
    //    salarioBruto * 0.135 = salario liquido



  public static void main(String[] args) {

    System.out.print("nome do funcionario: ");
    Scanner nome = new Scanner(System.in);
     String nomes = nome.next();
    
     System.out.print("horas trabalhadas: ");
     float horasTrabalhadas = nome.nextFloat();
     float salarioTrabalho = horasTrabalhadas * 10;

     System.out.print("dependentes: " );
     float dependentes = nome.nextFloat();

     float salarioFamilha = dependentes * 60;
     float salarioBruto = salarioFamilha + salarioTrabalho;
     
     float  inssImposto= salarioTrabalho * 0.135f;
   
     float salarioLiquido = salarioTrabalho - inssImposto + salarioFamilha;
    
    System.out.println  ("O funcionário"  +   (nomes) + "possui um salário bruto de R$" + (salarioBruto) +  " um salário líquido de R$:"  + (salarioLiquido));
    
     nome.close();


     


               






  }
    
}