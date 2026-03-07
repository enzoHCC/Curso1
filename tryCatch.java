import java.util.*;

public class tryCatch {
    public static void main(String[] args) {
        try {
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("Digite um numero");
            int respostaUsuario = inputScanner.nextInt();
            System.out.println("O número digitado é: "+ respostaUsuario);  
        } catch (Exception i ) {
            System.out.println("Ops! você não digitou um numero... Erro: " + i);
        }
    }
}
