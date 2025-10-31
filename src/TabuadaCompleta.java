import java.util.Scanner;

public class TabuadaCompleta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== TABUADAS ===");
        // Gerando array para armazenar os números
        int[] num = new int[10];
        // Adicionando valores à array
        for(int i = 0; i < num.length; i++){
            num[i] = i + 1;
            System.out.println(num[i]);
        }
        // Loop para decidir o número da tabuada
        for (int i = 1; i <= 10; i++){
            System.out.println("Tabuada de " + i);
            // Loop para calcular a tabuada
            for(int j = 1; j <= 10; j++){
                int resultado = num[i] * j;
                System.out.println(num[i] + "x" + j + ": " + resultado);
            }
        }
        System.out.println("TABUADAS COMPLETAS");
        sc.close();
    }
}
