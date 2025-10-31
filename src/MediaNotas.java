import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[3];
        System.out.println("Bem-vindo(a) ao boletim online");
        for (int i = 0; i < 3; i++){
            System.out.println("Digite a nota " + i + ": ");
            notas[i] = sc.nextFloat();
        }
        float media = (notas[0] + notas[1] + notas[2]) / 3;
        System.out.println("A média do aluno é: " + media);
        if (media >= 7) {
            System.out.println("Aluno aprovado");
        }else {
            System.out.println("Aluno reprovado");
        }
        sc.close();
    }
}
