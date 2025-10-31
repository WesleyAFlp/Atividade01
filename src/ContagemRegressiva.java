import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para a contagem regressiva: ");
        int num = sc.nextInt();
        // Realizando a contagem em loop
        for (int i = num; i >= 1; i--){ //Subtraindo i por 1 a cada vez que o loop é executado
            System.out.println(i);
        }
        System.out.println("COntagem finaliada!");
    }
}
