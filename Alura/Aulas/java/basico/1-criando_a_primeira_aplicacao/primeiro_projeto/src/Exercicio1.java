import java.util.Scanner;

public class Exercicio1 {
    public void exercicio(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        int celsius = scanner.nextInt();

        int fahrenheit = (int) (celsius *  1.8) + 32;

        System.out.println(String.format("A temperatura em Fahrenheit é %s", fahrenheit));
    }
}
