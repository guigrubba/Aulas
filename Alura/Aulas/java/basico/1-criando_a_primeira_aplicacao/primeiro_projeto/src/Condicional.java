import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else{
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if(incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve pagar a locação");
        }

        //=--------------EXERCICIO--------------

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com um número: ");
        double numeroEscolhido = scanner.nextDouble();

        if(numeroEscolhido > 0){
            System.out.println("O número é POSITIVO");
        } else if (numeroEscolhido == 0) {
            System.out.println("O número é ZERO");
        }else {
            System.out.println("o número é NEGATIVO");
        }
    }
}
