import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int quantidade = 0;

        System.out.println("-1 para sair:");
        while (true) {
            int numero = scanner.nextInt();
            if (numero == -1) {
                break;
            }
            soma += numero;
            quantidade++;

            maior = Math.max(maior, numero);
            menor = Math.min(menor, numero);
        }

        if (quantidade == 0) {
            System.out.println("Nenhum número digitado.");
        } else {
            double media = (double) soma / quantidade;

            System.out.println("Quantidade: " + quantidade);
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.printf("Média: %.2f\n", media);
        }

        scanner.close();
    }
}
