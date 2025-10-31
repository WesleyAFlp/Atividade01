import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um termo para ver o número ocupandte na sequência de fibonacci: ");
        int n =  sc.nextInt();
        int termo1 = 0;
        int termo2 = 1;

        System.out.println("Sequência de Fibonacci (Iterativo):");
        System.out.print(termo1 + " " + termo2);

        for (int i = 2; i < n; i++) {
            int proximoTermo = termo1 + termo2;
            System.out.print(" " + proximoTermo);
            termo1 = termo2;
            termo2 = proximoTermo;
        }
    }
}
