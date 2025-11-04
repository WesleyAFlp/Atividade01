package Vetores;
import java.util.Scanner;
public class Media {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double media = 0;
        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a " + (i+1) + " nota: ");
            notas[i] = sc.nextDouble();
            media += notas[i]/5;
        }
        System.out.println("A média dessas notas é: " + media);
        sc.close();

    }
}
