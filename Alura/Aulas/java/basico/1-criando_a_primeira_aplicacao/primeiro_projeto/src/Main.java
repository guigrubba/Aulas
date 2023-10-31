import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Testando o Print
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (7.5 + 8.2 + 6.9) /3;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(media));
        System.out.println(String.format("teste %.2f reais", media));

        String sinopse = """
                         Filme Top Gun
                         Filme de aventura com galã dos anos 80
                         Muito bom!
                         Ano de lançamento %s
                         """.formatted(anoDeLancamento);

        System.out.println(sinopse);

        //Exericio
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a media do filme: ");
       media = scanner.nextDouble();

        int classificacao = (int) media/2;

        System.out.println(String.format("A classificação do filme é %s estrelas", classificacao));

        System.out.println();
        System.out.println("EXERCICIO DA AULA 2");
        Exercicio1 exercicio1 = new Exercicio1();
        exercicio1.exercicio();
    }
}