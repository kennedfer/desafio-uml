public class AparelhoTelefonico extends Aplicacao {
    private long numeroAtual;
    private boolean temSinalDeRede;

    @Override
    void aoIniciar() {
        System.out.println("exibindo o app");
    }

    @Override
    void aoPausar() {
        System.out.println("salva dados");
    }

    @Override
    void aoResumir() {
        System.out.println("seta configurações apartir dos dados salvos");
    }

    @Override
    void aoDestruir() {
        System.out.println("libera a memoria");
    }

    void ligar() {
        System.out.println("verifica temSinalDeRede e caso sim");
        System.out.println("liga para o numeroAtual");
    }

    void atender() {
        System.out.println("inicia a conexão com a chamada");
    }

    void iniciarCorreioDeVoz() {
        System.out.println("inicia o serviço de chamada e envia um correio de voz ao numeroAtual");
    }
}
