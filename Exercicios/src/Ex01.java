import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args){

        int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um nùmero: ");

        numero = entrada.nextInt();

        if(numero > 10){
            System.out.println("O nùmero " + numero + "é maior que 10");
        }else{
            System.out.println("O nùmero " + numero + " é menor ou igual que 10");
        }

    }
    //cometario cruz

}
