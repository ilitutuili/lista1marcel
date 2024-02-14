import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);

        String[] cores = {"preto", "marrom", "vermelho", "laranja", "amarelo", "verde", "azul", "violeta", "cinza", "branco"};
        int[] valores = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Digite as cores das duas faixas do resistor separadas por espaço ou hífen:");
        String entrada = scanner.nextLine();
        String[] coresInput = entrada.split(" ");

        int valor1 = -1, valor2 = -1;
        for (int i = 0; i < cores.length; i++) {
            if (coresInput[0].equals(cores[i])) {
                valor1 = valores[i];
            }
            if (coresInput[1].equals(cores[i])) {
                valor2 = valores[i];
            }
        }

        if (valor1 == -1 || valor2 == -1) {
            System.out.println("Erro: Uma ou mais cores inválidas.");
            scanner.close();
            return;
        }

        int valorFinal = valor1 * 10 + valor2;

        System.out.println("O valor do resistor é: " + valorFinal);

        scanner.close();
    }
}
