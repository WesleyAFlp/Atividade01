package Vetores;
import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alunos = new String[10];
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i] = sc.nextLine();
        }
        System.out.println("Alunos armazenados!");
        System.out.println("Digite o nome do aluno para busca-lo no vetor: ");
        String nomeBusca = sc.nextLine();

        boolean encontrado = false;
        for (int j = 0; j < alunos.length; j++) {
            if (nomeBusca.equals(alunos[j])) {
                encontrado = true;

            }
        }

        if (encontrado==true) {
            System.out.println("Aluno encontrado!");
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }
}