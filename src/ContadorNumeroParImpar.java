import java.util.Scanner;

public class ContadorNumeroParImpar {
    public static void main(String[] args) {
        System.out.println("Bem vindo(a) ao contador de números pares e ímpares até determinado número");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para contar todos os números pares e ímpares até ele: ");
        int num = sc.nextInt();
        int par = 0;
        int impar = 0;
        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                par = par + 1;
            }else{
                impar = impar + 1;
            }
        }
        System.out.println("A quantidade de números pares é: " + par);
        System.out.println("A quantidade de números ímpares é: " + impar);
    }
}

