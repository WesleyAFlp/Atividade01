import java.util.Scanner;
import java.util.Random;
public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        int numero_aleatorio = gerador.nextInt(10);
        System.out.println("Bem vindo(a) ao jogo de advinhação de números!!");
        System.out.println("Um número entre 0 e 10 foi escolhido, você tem 6 tentativas para acertar esse número. Boa sorte!");
        for (int i = 1; i <= 6; i++){
            System.out.println("Digite um número: ");
            int tentativa = sc.nextInt();
            System.out.println("Tentativa: " + i);
            if (tentativa == numero_aleatorio){
                System.out.println("Parabéns! Você acertou! O número é " + numero_aleatorio);
                i = 6;
            }
        }
        System.out.println("As tentativas acabaram! O número gerado foi: " + numero_aleatorio);
    }
}
