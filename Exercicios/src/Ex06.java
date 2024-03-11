import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args){

        float ceucius;
        float fahrenheit;
        Scanner lerTemp = new Scanner(System.in);

        System.out.println("Digite a temeperatura em celcius: ");
        ceucius = lerTemp.nextFloat();
        fahrenheit = (9 * ceucius + 160) / 5;
        System.out.println(ceucius+" graus ceucius são "+fahrenheit+" graus fahrenheit");
    }

}

//Desenvolvimento de Software
//Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é:
//F = (9 * C + 160) / 5