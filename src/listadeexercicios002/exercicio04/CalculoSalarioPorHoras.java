package listadeexercicios002.exercicio04;

import java.util.Scanner;

public class CalculoSalarioPorHoras {
    public static void main(String[] args) {
        Scanner salarioHora = new Scanner(System.in);
        System.out.print("Digite o quanto você recebe por hora trabalhada: R$ ");
        double valorHora = salarioHora.nextDouble();
        System.out.print("Digite a quantidade de horas você trabalha no mês: ");
        double horaMes = salarioHora.nextDouble();
        salarioHora.close();

        double totalSalario = valorHora * horaMes;
        System.out.printf("O valor total de seu salário no mês é de R$ %.2f", totalSalario);

    }
}
