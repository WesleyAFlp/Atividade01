import java.util.Scanner;

public class ClassificacaoIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade para descobrir sua classificação: ");
        int idade = sc.nextInt();
        switch (idade) {
            case 1:
                System.out.println("Você é criança."); break;
            case 2:
                System.out.println("Você é adolescente."); break;
            case 3:

        }

    }
}
