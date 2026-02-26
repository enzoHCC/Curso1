import java.util.*;

public class Calculadora {
  
  private static String respostaUsuario;
  private static String respostaUsuario2;
  public static void main(String[] args){
    
    Scanner inputScanner = new Scanner(System.in);
    boolean sair=false;
    boolean respostaErrada =true;
    while(sair==false | respostaErrada==true){
      System.out.println("Digite a operação que você deseja entre as opções abaixo;");
      System.out.println("[S]-Soma");
      System.out.println("[L]-Subtração");
      System.out.println("[D]-Divisão");
      System.out.println("[M]-Multiplicação");
      respostaUsuario = inputScanner.nextLine().trim();
    
      if(respostaUsuario.equals("S") || respostaUsuario.equals("s")) {
      respostaErrada=true;
      
      System.out.println("Digite o primeiro número a ser somado e tecle Enter: ");
      respostaUsuario = inputScanner.nextLine().trim();
      double numeroUm = Double.valueOf (respostaUsuario);
      
      System.out.println("Digite o segundo número a ser somado e tecle Enter: ");
      respostaUsuario2 = inputScanner.nextLine().trim();
      double numeroDois = Double.valueOf(respostaUsuario2);
      
      double resultado = (double) numeroUm +numeroDois;
      System.out.println("A soma dos dois numeros são: " + (resultado));

      } else if(respostaUsuario.equals("L") || respostaUsuario.equals("l")){
        respostaErrada=true;

        System.out.println("Digite o primeiro número a ser subtraído e tecle Enter: ");
        respostaUsuario = inputScanner.nextLine().trim();
        double numeroUm = Double.valueOf(respostaUsuario);
        
        System.out.println("Digite o segundo número a ser subtraído e tecle Enter: ");
        respostaUsuario2 = inputScanner.nextLine().trim();
        double numeroDois = Double.valueOf(respostaUsuario2);
        
        double resultado = (double) numeroUm -numeroDois;
        System.out.println("A subtração desses dois números são: " + (resultado));

      } else if(respostaUsuario.equals("D") || respostaUsuario.equals("d")){
        respostaErrada=true;

        System.out.println("Digite o primeiro número a ser dividido: ");
        respostaUsuario = inputScanner.nextLine().trim();
        double numeroUm = Double.valueOf(respostaUsuario);
        
        System.out.println("Digite o segundo número a ser dividido: ");
        respostaUsuario2 = inputScanner.nextLine().trim();
        double numeroDois = Double.valueOf(respostaUsuario2);
        
        double resultado = (double) numeroUm /numeroDois;
        System.out.println("A divisão desses números são: " + (resultado));

      } else if(respostaUsuario.equals("M") || respostaUsuario.equals("m")) {
        respostaErrada=true;

        System.out.println("Digite o primeiro número a ser multiplicado: ");
        respostaUsuario = inputScanner.nextLine().trim();
        double numeroUm = Double.valueOf(respostaUsuario);
        
        System.out.println("Digite o valor do segundo número a ser multiplicado: ");
        respostaUsuario2 = inputScanner.nextLine().trim();
        double numeroDois = Double.valueOf(respostaUsuario2);
        
        double resultado = (double) numeroUm *numeroDois;
        System.out.println("A multiplicação desses números são:" + (resultado ));

      }else {
        System.out.println("Resposta Inválida! Por favor tente novamente: ");
        try{
          Thread.sleep(5000);
        } catch(Exception ev){
          System.err.println("Error: " + ev);
        }
      }

      System.out.println("Deseja Continuar:");
      System.out.println("[1]-Sim"); 
      System.out.println("[2]-Não");
      String respostaFinal = inputScanner.nextLine().trim();
      
      int rFinal = Integer.valueOf(respostaFinal);

      if (rFinal == 1) {
        sair = false;
      } 
    } 
    if (sair == true){
      inputScanner.close();
    }
  }
}

