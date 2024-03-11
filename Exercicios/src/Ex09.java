import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args){

        int a;
        int b;
        Scanner lerNum = new Scanner(System.in);

        System.out.println("Digite um número");
        a = lerNum.nextInt();
        System.out.println("Digite mais um número");
        b = lerNum.nextInt();

        String resposta = (a == b) ? "Os números sâo iguais!": "Os números são diferenetes";
        System.out.println(resposta);

    }
}

//Leia dois números nas variáveis A e B e identifique se os valores são iguais ou diferentes.
// Caso eles sejam iguais imprima uma mensagem dizendo que são iguais. Caso sejam diferentes,
// informe que são diferentes e qual número é o maior.