import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== CONVERSOR DE MOEDA ONLINE ===");
        System.out.println("Digite um valor para converte-lo: ");
        float valor = sc.nextInt();
        System.out.println("1 - Dólar\n2 - Euro\nDeseja converter esse valor para qual moeda: ");
        int moeda = sc.nextInt();
        if (moeda == 1) {
            float dolar = (float) (valor / 5.38);
            System.out.println("Valor em dólar: " + dolar);
        }else{
            float euro = (float) (valor / 6.2);
            System.out.println("Valor em euro: " + euro);
        }
    }
}
