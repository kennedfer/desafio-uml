public class Navegador extends Aplicacao {
    private int numeroDePaginasAbertas;
    private String paginaAtual;

    @Override
    void aoDestruir() {
        System.out.println("Encerra processos e libera memoria");

    }

    @Override
    void aoIniciar() {
        System.out.println("pega ultima pagina vista ou link e seta à pagina atual");
        System.out.println("pega da memoria quantas paginas estao abertas e seta o numeroDePaginasAbertas");

        exibirPagina();
    }

    @Override
    void aoPausar() {
        System.out.println("Salva alguns dados (Ex: posição na pagina)");

    }

    @Override
    void aoResumir() {
        System.out.println("Seta as configurações com base nos dados salvos");
    }

    void exibirPagina() {
        System.out.println("Exibindo a pagina atual");
    }

    void adicionarNovaAba() {
        System.out.println("Criando nova aba");
    }

    void atualizarPagina() {
        System.out.println("Tenta fazer uma conexao com a pagina");
        exibirPagina();
    }
}
