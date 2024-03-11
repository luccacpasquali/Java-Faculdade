import java.awt.*;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args){

        int a;
        int b;

        Scanner lerValor = new Scanner(System.in);

        System.out.println("Digite o valor A:");
        a = lerValor.nextInt();
        System.out.println("Digite o valor B:");
        b = lerValor.nextInt();

        if(a == b){
            System.out.println("Os valores sao iguais!");
        } else if (a > b) {
            System.out.println("O valor A é maior que B");
        }else{
            System.out.println("O valor B é maior que A");
        }

    }

    /* Escreva um algoritmo que leia os valores de dois números inteiros distintos nas variáveis A e B
    e informe qual deles é o maior. Caso os números sejam iguaisinformar ao usuário que a sequência
    de números informados é inválida */

}
