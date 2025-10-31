import java.util.Scanner;

public class SomaNumerosPares {
    public static void main(String[] args) {
            System.out.println("Bem vindo(a) ao contador de números pares até determinado número");
            // Entrada de dados
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número para somar todos os números pares até ele: ");
            int num = sc.nextInt();
            int par = 0;
            for(int i = 1; i <= num; i++){
                if(i % 2 == 0){
                    par = par + i;
                }
            }
            System.out.println("A soma dos números pares até o número " + num + " é: " + par);
    }
}
