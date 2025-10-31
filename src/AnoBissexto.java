import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== VERIFICADOR DE ANO BISSEXTO ===");
        System.out.println("Digite o ano para verificar se ele é bissexto: ");
        int ano = sc.nextInt();
        if ((ano % 400 == 0) || (ano % 4 == 0) || (ano % 100 == 0)) {
            System.out.println("O ano " + ano + " é bissexto.");
        }else{
            System.out.println("O ano " + ano + " não é bissexto.");
        }
        sc.close();
    }
}
