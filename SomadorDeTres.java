import java.util.Scanner;

public class SomadorDeTres {

    public static int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("➕ Somador de Três Números ➕");

        System.out.print("Digite o primeiro número inteiro: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        num3 = scanner.nextInt();

        int resultado = somar(num1, num2, num3);

        System.out.println("\nA soma de " + num1 + ", " + num2 + " e " + num3 + " é: " + resultado);

        scanner.close();
    }
}