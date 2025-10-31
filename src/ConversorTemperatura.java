import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo(a) ao conversor de temperatura!");
        System.out.println("1 - Fahrenheit\n2 - Celsius\nDeseja converter para:");
        int tipo = sc.nextInt();
        if (tipo == 1) {
            System.out.println("Digite a temperatura para a conversão: ");
            float temperatura = sc.nextFloat();
            float fahrenheit = (temperatura * 9/5) + 32;
            System.out.println("Fahrenheit: " + fahrenheit);
        }else{
            System.out.println("Digite a temperatura para a conversão: ");
            float temperatura = sc.nextFloat();
            float celsius = (temperatura - 32) * 5/9;
            System.out.println("Celsius: " + celsius);
        }
        sc.close();
    }
}
