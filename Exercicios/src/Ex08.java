import java.util.Scanner;

public class Ex08 {
        public static void main(String[] args){
            int n1;

            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um número");
            n1 = scan.nextInt();
            String resposta = (n1 >= 50) ? "Maior oui igual a 50" :"Menor que 50";

            System.out.println(resposta);
        }
}

//Escreva um algoritmo que leia um número e mostre uma mensagem caso este número seja maior
// ou igual a 50, outra se ele for menor que 50.
