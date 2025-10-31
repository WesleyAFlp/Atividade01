import java.util.Scanner;

public class SomaNumerosImpares {
    public static void main(String[] args) {
        System.out.println("Bem vindo(a) ao contador de números ímpares até determinado número");
        // Entrada de dados
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para somar todos os números ímpares até ele: ");
        int num = sc.nextInt();
        int impar = 0;
        for(int i = 1; i <= num; i++){
            if(i % 2 != 0){
                impar = impar + i;
            }
        }
        System.out.println("A soma dos números ímpares até o número " + num + " é: " + impar);
    }
}
