package listadeexercicios002.exercicio07;

import java.util.Scanner;

public class CalculoSalarioDespesas {
    public static void main(String[] args) {

    Scanner salarioHora = new Scanner(System.in);
    System.out.print("Digite o quanto você recebe por hora trabalhada: R$ ");
    double valorHora = salarioHora.nextDouble();

    System.out.print("Digite a quantidade de horas você trabalha no mês: ");
    double horaMes = salarioHora.nextDouble();
    salarioHora.close();

    double totalSalario = valorHora * horaMes;
    System.out.printf("O valor total de seu salário bruto no mês é de R$ %.1f.", totalSalario);
    double inss = (8 * 10) / totalSalario;
    System.out.printf("O valor de INSS a ser descontado é: R$ %.2f.", inss);
    double ir = (11 * 10) / totalSalario;
    System.out.printf("O valor de IR a ser descontado sobre o salário bruto é: R$ %.2f.", ir);
    double sindicato = (5 * 10) / totalSalario;
    System.out.printf("O valor de contribuição sindical a ser descontado sobre o salário bruto é: R$ %.2f.", sindicato);

    double despesas = inss + ir + sindicato;
    double salarioliq = totalSalario - despesas;
    System.out.printf("O salário liquido a receber é de: R$ %.2f", salarioliq);

    }
}
