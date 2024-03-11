import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args){

        int n1;
        Scanner lerValor = new Scanner(System.in);
        do {
            System.out.println("Digite um número inteiro: ");
            n1 = lerValor.nextInt();

        }while(n1 < 100 || n1 > 200);
        System.out.println("Você digitou um número entre 100 e 200");
        System.out.println("Fim do programa");
    }

}

//Escreva um algoritmo que leia um número e diga,
// através de uma mensagem, se este número está no intervalo entre 100 e 200.
// Caso o número esteja fora do intervalo, solicitar ao usuário que digite novamente,
// até que essa condição seja atendida.