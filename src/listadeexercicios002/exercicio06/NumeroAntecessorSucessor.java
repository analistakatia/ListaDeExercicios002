package listadeexercicios002.exercicio06;

import java.util.Scanner;

public class NumeroAntecessorSucessor {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = numero.nextInt();
        numero.close();

        int antecessor = num - 1;
        int sucessor = num + 1;
        System.out.print("O antecessor do número " +num +" é " + antecessor + " e o sucessor é " + sucessor);
    }
}
