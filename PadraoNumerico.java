import java.util.Scanner;

public class PadraoNumerico {

    public static void imprimirPadrao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("⭐ Gerador de Padrão Numérico ⭐");
        
        while (true) {
            System.out.print("Digite um número inteiro positivo (N) para o padrão: ");
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
        imprimirPadrao(n);
        System.out.println("------------------------------------");

        scanner.close();
    }
}