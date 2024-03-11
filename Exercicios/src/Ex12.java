import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        float raio;
        float altura;


        Scanner lerNum = new Scanner(System.in);

        System.out.println("Digite o raio do cilindro");
        raio = lerNum.nextFloat();
        System.out.println("Digite a altura do cilindo");
        altura = lerNum.nextFloat();

        float volume = 3.14f * (raio * raio) * altura;

        System.out.println("O volume do cilindro é  :" +volume);
    }

}

//Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seu volume
// calculado de acordo com a seguinte fórmula: volume = 3.14 * raio2 * altura;
//Exemplo: raio = 10, altura = 15. Volume = 4710