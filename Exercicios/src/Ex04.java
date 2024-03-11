import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){

        int n1;
        int n2;
        int soma;
        int sub;
        float div;
        int mult;

        Scanner lerNumeros = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        n1 = lerNumeros.nextInt();
        System.out.println("Digite o segundo numero:");
        n2 = lerNumeros.nextInt();

        soma = n1 + n2;
        sub = n1 - n2;
        div =  (n2 == 0) ? n1: (float) n1 /n2 ;
        mult = n1 * n2;

        System.out.println("Soma: "+ soma);
        System.out.println("Subtração: "+sub );
        System.out.println("Divisão: "+div);
        System.out.println("Multiplicação: "+mult);



    }

}

//Escreva um algoritmo que leia dois números e ao final mostre a soma,
// subtração,multiplicação e a divisão dos números lidos