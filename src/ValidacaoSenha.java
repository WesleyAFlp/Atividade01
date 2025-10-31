import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== VALIDADOR DE SENHAS ===");
        System.out.print("Digite sua senha para valida-la: ");
        String senha = sc.nextLine();
        if(senha.length() < 6) {
            System.out.println("Senha invalida");
        }else{
            System.out.println("Senha válida!");
        }
    }
}
