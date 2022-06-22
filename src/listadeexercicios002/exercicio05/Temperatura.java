package listadeexercicios002.exercicio05;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner graus = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double grau = graus.nextDouble();
        graus.close();

        double grauCelsius = ((grau - 32) / 9) * 5;
        System.out.printf(grau+ " graus Fahrenheit corresponde a %.1f graus Celsius", grauCelsius);
    }
}
