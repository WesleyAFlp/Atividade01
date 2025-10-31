import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== VERIFICADOR DE NÚMERO PERFEITO ===");
        System.out.println("Digite um número para descobrir se ele é perfeito: ");
        int num = sc.nextInt();
        int[] divisores = new int[num];
        divisores[0] = 1;
        for (int i = 1; i < num; i++){
            if (num % i == 0){
                divisores[i] = i;
            }
        }
        int soma = 0;
        for (int i = 1; i < divisores.length; i++){
            soma = soma + divisores[i];
        }
        if (soma == num){
            System.out.println("O número " + num + " é um número perfeito!");
        }else{
            System.out.println("O número " + num + " não é um número perfeito");
        }
    }
}
