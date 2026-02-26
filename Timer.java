import java.time.*;
import java.util.Scanner;

public class Timer {
    public static void main(String[] args){
        
        int horaAtual = LocalDateTime.now().getHour();
        int minutoAtual = LocalDateTime.now().getMinute();
        int segundoAtual = LocalDateTime.now().getSecond();
        Scanner inputScanner = new Scanner(System.in);

        while(true){
            
            System.out.println("O horário é: "+ horaAtual +" horas "+ minutoAtual+ " minutos "+ segundoAtual +" segundos ");
        
            try{
                Thread.sleep(1000);
            } catch(Exception e){
                System.out.println("Erro: " + e);
            }
            try {
                if (System.getProperty("os.name").contains("Windows")) {
                    new ProcessBuilder("cmd","/c","cls" ).inheritIO().start().waitFor();
                } else {
                    System.out.println("\033[H\0332J");
                    System.out.flush();
                }
            } catch(Exception e) {
                System.out.println("Erro: "+ e);
            }
                segundoAtual++;
                if (segundoAtual==60){
                    minutoAtual++;
                } if(minutoAtual==60){
                    horaAtual++;
                }
        }
    }
}
