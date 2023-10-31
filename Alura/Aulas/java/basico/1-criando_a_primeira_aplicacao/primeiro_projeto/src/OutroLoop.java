import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double totalNota = 0;
        int numeroDeNotas = 0;
        double nota = 0;

        while (nota != -1) {
            System.out.print("Diga sua avaliação para o filme ou digite -1 para acabar: ");
            nota = leitura.nextDouble();
            if(nota != -1){
                totalNota += nota;
                numeroDeNotas++;
            }
        }

        System.out.println("Média de avaliações: " + totalNota/numeroDeNotas);
    }
}
