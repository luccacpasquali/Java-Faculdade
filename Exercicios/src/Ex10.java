import java.util.Scanner;
    public class Ex10 {
        public static void main(String[] args){
            int num;
            Scanner lerNum = new Scanner(System.in);
            boolean teste = false;
            do {
                System.out.println("Digite um número entre 1 e 50");
                num = lerNum.nextInt();
                if (num < 1 || num > 50 ){
                    System.out.println("Número inválido!");
                }else{
                    teste = true;
                    for(int i = num; i <= 50; i++){
                        System.out.println(i);
                    }
                }
            }while (!teste);
    }
}

//Escreva um algoritmo que leia um número de 1 a 50. Escreva-os na tela indo do numero digitado até o número 50.
//Caso o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número inválido!”,
// e solicitar uma nova entrada até que essa condição seja atendida