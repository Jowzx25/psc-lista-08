import java.util.Scanner;

public class TrianguloNumerico {

    public static void imprimirTriangulo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("⭐ Gerador de Triângulo Numérico ⭐");
        
        while (true) {
            System.out.print("Digite um número inteiro positivo (N): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Por favor, digite um número inteiro positivo.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next();
            }
        }
        
        System.out.println("\n--- Padrão de Saída (n = " + n + ") ---");
        imprimirTriangulo(n);
        System.out.println("------------------------------------");

        scanner.close();
    }
}