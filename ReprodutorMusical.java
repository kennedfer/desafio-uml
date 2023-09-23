public class ReprodutorMusical extends Aplicacao {
    private String musicaAtual;
    private boolean estaTocando;

    @Override
    void aoIniciar() {
        System.out
                .println("Prepara o dispositivo de audio e seta musicaAtual como a primeira ou como o arquivo aberto");

        tocar();
    }

    @Override
    void aoPausar() {
        // Ao pausar nao se refere à pausar uma musica e sim à aplicação
        System.out.println("iniciar notificação de reprodução");
    }

    @Override
    void aoResumir() {
        System.out.println("oculta a notificação do reprodutor");
    }

    @Override
    void aoDestruir() {
        System.out.println("encerra processos, libera a notificação da memoria");
    }

    void tocar() {
        System.out.println("inica a reprodução a partir do dispositivo de audio");
        System.out.println("estaTocando setado para true");
    }

    void pausar() {
        System.out.println("estaTocando setado para false");
        System.out.println("pausa a reprodução do audio");
    }

    void selecionarMusica() {
        System.out.println("abre o gerenciador de arquivo");
    }

    void selecionarMusica(int posiçãoMusicaNaLista) {
        System.out.println("seta musica atual apartir de uma lista");
    }
}
