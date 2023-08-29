import models.Smartphone;

public class Main {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone();

        System.out.println("Iphone Ligado!");
        System.out.println("---------------------------------");

        // Operações do aparelho telefônico
        smartphone.atender();
        smartphone.ligar();
        smartphone.iniciarCorreioDeVoz();

        System.out.println("---------------------------------");

        // Operações de reprodução de música
        smartphone.getMusicPlay().play();
        smartphone.getMusicPlay().stop();
        smartphone.getMusicPlay().selecionarMusica();

        System.out.println("---------------------------------");

        // Operações de navegação na internet
        smartphone.getWebNavegator().exibirPagina();
        smartphone.getWebNavegator().adicionarNovaPagina();
        smartphone.getWebNavegator().AtualizarPagina();
    }
}