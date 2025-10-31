import java.util.Scanner;

public class CalculadoraImposto {

    public static double somaImposto(double taxaImposto, double custo) {
        double imposto = custo * (taxaImposto / 100.0);
        return custo + imposto;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double custoOriginal;
        double taxa;

        System.out.println("💸 Calculadora de Custo com Imposto 💸");

        System.out.print("Digite o custo do item (antes do imposto): R$ ");
        custoOriginal = scanner.nextDouble();

        System.out.print("Digite a taxa de imposto sobre vendas (em %): ");
        taxa = scanner.nextDouble();

        double custoFinal = somaImposto(taxa, custoOriginal);

        System.out.println("\n--- Resultado ---");
        System.out.printf("Custo original: R$ %.2f\n", custoOriginal);
        System.out.printf("Taxa de imposto: %.2f%%\n", taxa);
        System.out.printf("Custo com imposto: R$ %.2f\n", custoFinal);
        System.out.println("-----------------");

        scanner.close();
    }
}