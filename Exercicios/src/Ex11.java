import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        float a;
        float n;
        float r;
        float an;

        Scanner lerNum = new Scanner(System.in);

        System.out.println("Digite o numero 'A': ");
        a = lerNum.nextFloat();
        System.out.println("Digite o numero 'N': ");
        n = lerNum.nextFloat();

        r = a - n;
        an = a + (n - 1) * r;

        System.out.println("O n-ésimo termo dessa progressão aritimética é: "+an);
    }
}

//A expressão an = a1 + (n – 1) * r é denominada termo geral da Progressão Aritmética (PA).
// Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo),
// r é a razão e a1 é o primeiro termo da Progressão Aritmética.
// Escreva um algoritmo que encontre o n-ésimo termo de uma progressão aritmética.
// Exemplo: a1 = 10, n = 7, r = 3. Resultado: an = 28