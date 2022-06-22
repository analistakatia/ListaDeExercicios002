package listadeexercicios002.exercicio03;

import java.util.Scanner;

public class ConversãoDeMedidas {

    public static void main(String[] args) {
        System.out.println("***CONVERSÃO DE MEDIDAS***");

        Scanner metro = new Scanner(System.in);
        System.out.print("Digite uma medida em metros: ");
        double metros = metro.nextDouble();
        metro.close();

        double conversao = metros * 100;
        System.out.printf("Você digitou " +metros+ " metros. Esse valor convertido em centímetros é: %.2f cms", conversao);

    }
}
