import java.util.Scanner;

public class ClassificadorNumerico {

    public static char classificarNumero(int numero) {
        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;

        System.out.println("🔢 Classificador de Número Positivo/Negativo 🔢");

        System.out.print("Digite um número inteiro: ");
        valor = scanner.nextInt();

        char resultado = classificarNumero(valor);

        System.out.println("\nO resultado da classificação é: " + resultado);

        scanner.close();
    }
}