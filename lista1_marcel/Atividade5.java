import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira cadeia de DNA:");
        String dna1 = scanner.nextLine();

        System.out.println("Digite a segunda cadeia de DNA:");
        String dna2 = scanner.nextLine();

        int distanciadehaming = calculatedistanciadehaming(dna1, dna2);
        System.out.println("Distância de Hamming: " + distanciadehaming);

        scanner.close();
    }

    public static int calculatedistanciadehaming(String dna1, String dna2) {
        if (dna1.length() != dna2.length()) {
            throw new IllegalArgumentException("As cadeias de DNA devem ter o mesmo comprimento.");
        }

        int distancia = 0;
        for (int i = 0; i < dna1.length(); i++) {
            if (dna1.charAt(i) != dna2.charAt(i)) {
                distancia++;
            }
        }
        return distancia;
    }
}
