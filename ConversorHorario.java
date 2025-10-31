import java.util.Scanner;

public class ConversorHorario {

    public static int converterPara12h(int horas24, char[] periodo) {
        if (horas24 < 0 || horas24 > 23) {
            periodo[0] = 'E';
            return -1;
        }

        if (horas24 >= 0 && horas24 <= 11) {
            periodo[0] = 'A';
        } else {
            periodo[0] = 'P';
        }

        if (horas24 == 0 || horas24 == 12) {
            return 12;
        } else if (horas24 > 12) {
            return horas24 - 12;
        } else {
            return horas24;
        }
    }

    public static void exibirConversao(int horas12, int minutos, char periodo) {
        String sufixo;
        if (periodo == 'A') {
            sufixo = "A.M.";
        } else if (periodo == 'P') {
            sufixo = "P.M.";
        } else {
            System.out.println("Erro