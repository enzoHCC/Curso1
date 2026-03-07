import java.util.*;
import java.util.concurrent.*;

public class Forca2 {
    
    public static void main(String[] args) {
        limparTela();
        System.out.println("Bem-vindo(a) ao jogo da Forca!");
        dormir(3000);
        jogarForca();
    }
    public static void jogarForca() {
        String[] palavra = {"casa", "carro", "livro", "janela", "porta",
        "amizade", "trabalho", "alegria", "saudade", "esperança", 
        "computador", "telefone", "internet", "programa", "codigo", 
        "chuva", "sol", "vento", "neve", "relâmpago",
        "cachorro", "gato", "pássaro", "peixe", "cavalo",
        "montanha", "rio", "mar", "floresta", "deserto",
        "cidade", "bairro", "rua", "praca", "mercado", 
        "professor", "aluno", "escola", "universidade", "livraria", 
        "comida", "bebida", "pão", "arroz", "feijão",
        "tempo", "historia", "futuro", "passado", "presente",
        "viagem", "mapa", "onibus", "aviao", "barco",
        "tradicao", "cultura", "arte", "musica", "danca",
        "palavra", "frase", "texto", "poema", "romance", 
        "beleza", "forca", "coragem", "virtude", "honra", 
        "tristeza", "medo", "odio", "solidão", "angustia",
        "felicidade", "amor", "carinho", "abraco", "sorriso",
        "traje", "vestido", "camisa", "sapato", "chapeu",
        "mercadoria", "dinheiro", "troca", "compra", "venda", 
        "governo", "lei", "justica", "poder", "nacao", 
        "poente", "aurora", "crepusculo", "alvorada", "ocaso"};
        boolean sair = false;
        boolean acertouPalavra = false;
        Scanner inputScanner = new Scanner(System.in);
        int indiceAleatorio = ThreadLocalRandom.current().nextInt(palavra.length);
        String respostaUsuario;
        ArrayList<String> letrasJogadas = new ArrayList<>();
        String palavraSorteada = "venda";
        int tamanhoPalavra = palavraSorteada.length();
        int letrasFaltando = palavraSorteada.length();
        String palavraCompleta = palavraSorteada ;
        String caracterCoringa = "_ ";
        String dicaPalavra = "";        
        //for (int i = 0; i < tamanhoPalavra; i++) {
         //   dicaPalavra += caracterCoringa;
        //}
        int letrasAcertadas = 0;
        String caracterAtual = caracterCoringa;
        String letraVerificada = "";
        int tentativas = 10 + palavraSorteada.length();
        int tentativasRestantes = tentativas;
        int tentativasSobrando = tentativas;

        System.out.println("Bem-vindo ao jogo da forca");
        while(acertouPalavra==false){
            while ( sair==false) {
                limparTela();

                dicaPalavra = "";
                //System.out.println("letrasJogadas.toString(): " + letrasJogadas.toString());
                for (int i = 0; i < palavraCompleta.length(); i++) {
                    caracterAtual = caracterCoringa;
                    letraVerificada = String.valueOf(palavraCompleta.charAt(i));
                    // System.out.println("letraVerificada: " + letraVerificada);
                    for (int l = 0; l < letrasJogadas.size(); l++) {
                        if (letraVerificada.equals(letrasJogadas.get(l))) {
                            caracterAtual = letraVerificada;
                            //System.out.println("achou: " + letraVerificada);
                        }
                    }
                    dicaPalavra += caracterAtual + "";
                }

                System.out.println("Dica: a palavra: " + dicaPalavra + " tem " + tamanhoPalavra + " letras.");
                System.out.println("Digite uma letra e tecle Enter para jogar.");
                respostaUsuario = inputScanner.nextLine().trim().toLowerCase();
                letrasJogadas.add(respostaUsuario);
                if(letrasJogadas.size() > 0){
                    System.out.println("Você jogou a(s) letra(s): " + letrasJogadas.toString());
                }        
                if (palavraSorteada.indexOf(respostaUsuario) > -1) {
                    palavraSorteada = palavraSorteada.replace(respostaUsuario, "");
                    letrasAcertadas++;
                    letrasFaltando = tamanhoPalavra - letrasAcertadas;
                }
                System.out.println("Você acertou " + letrasAcertadas + " letras.");
                if(letrasFaltando == 0){
                    System.out.println("Você Ganhou!Parabéns! A palavra era " +palavraCompleta+", você fez com"+tentativasRestantes+" tentativas restantes.");
                    System.out.println("Você deseja pegar outra palavra e continuar a jogar?");
                    System.out.println("[1]-sim");
                    System.out.println("[2]-não");
                    String respostaVitoria = inputScanner.nextLine().trim();
                    int respostaFinal = Integer.valueOf(respostaVitoria);
                    
                    if (respostaFinal==1){
                        jogarForca();
                    
                    } if (respostaFinal==2){
                        acertouPalavra=true;
                    }

                 }    else {
                    System.out.println("Você deseja continuar a jogar?");
                    System.out.println("[1]-sim");
                    System.out.println("[2]-não");
                    String respostaSair = inputScanner.nextLine().trim();
                    int respostaFinal = Integer.valueOf(respostaSair);
                    if (respostaFinal == 2) {
                        sair = true;
                    }   else {
                        sair = false;
                    }
                }
            }
        }
    }
    public static void limparTela() {
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
    }
    public static void dormir(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (Exception e) {
            System.err.println("Erro: "+ e);
        }
    }
}


    