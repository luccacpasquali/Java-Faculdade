import java.util.Scanner;

public class Ex02 {

    public static void main (String[] args){

        int n1;
        int numero;
        int soma;

        Scanner lerNumero = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = lerNumero.nextInt();

        System.out.println("Digite o segundo número: ");
        numero = lerNumero.nextInt();

        soma = n1 + numero;

        System.out.println("A soma de "+ n1 +" + "+ n2 +" resulta em : "+ soma);

    }

}

// Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o resultado da sua soma
