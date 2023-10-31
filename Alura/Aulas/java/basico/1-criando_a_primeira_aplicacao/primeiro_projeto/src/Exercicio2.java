import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        int numeroDoUsuario;
        Scanner scanner = new Scanner(System.in);
        System.out.println(numeroAleatorio);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeroDoUsuario = scanner.nextInt();

            if(numeroDoUsuario > numeroAleatorio){
                System.out.println("O seu número é maior, escolha um valor menor");
            } else if (numeroDoUsuario < numeroAleatorio) {
                System.out.println("O seu número é menor, escolha um valor maior");
            }else{
                System.out.println("PARABÉNS VOCÊ ACERTOU");
                break;
            }

            if(i == 4){
                System.out.println("ACABARAM AS TENTATIVAS");
            }
        }


    }
}
