import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para descobrir se ele é primo: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("O número " + num + " não é primo!");
        }else{
            System.out.println("O número " + num + " é primo!");
        }
        sc.close();
    }
}
