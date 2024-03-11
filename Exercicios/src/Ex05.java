import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){

        int a;
        int b;
        int x;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor A:");
        a = entrada.nextInt();
        System.out.println("Digite o valor B:");
        b = entrada.nextInt();

        System.out.println("O valor de A era :"+a+" e o valor B era: "+b);

        x = a;
        a = b;
        b = x;

        System.out.println("O valor de A agora é :"+a+" e o valor B agora é: "+b);

    }

}

//Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor davariável
// A passe a ser o valor da variável B, e o valor da variável B passe a ser o valorda variável A.
// Apresentar uma mensagem com o valor original de cada variável e outra com os valores trocados.
