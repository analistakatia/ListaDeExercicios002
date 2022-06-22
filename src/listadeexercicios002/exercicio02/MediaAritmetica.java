package listadeexercicios002.exercicio02;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {

        Scanner notas = new Scanner(System.in);


        System.out.print("Digite a 1ª nota bimestral: ");
        double nota1 = notas.nextDouble();
        System.out.print("Digite a 2ª nota bimestral: ");
        double nota2 = notas.nextDouble();
        System.out.print("Digite a 3ª nota bimestral: ");
        double nota3 = notas.nextDouble();
        System.out.print("Digite a 4ª nota bimestral: ");
        double nota4 = notas.nextDouble();
        notas.close();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("A média dos bimestres é: %.2f", media);
    }
}

