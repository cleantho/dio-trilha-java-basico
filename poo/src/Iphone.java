public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public Iphone() {        
    }

    @Override
    public void tocar() {
        System.out.println("Iphone: tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Iphone: pausando música.");
    }

    @Override
    public void selecionarMusica(String nome) {
        System.out.println("Iphone: selecionando música '" + nome + "'.");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Iphone: Ligando para o número ( " + numero + " ).");
    }

    @Override
    public void atender() {
        System.out.println("Iphone: atendendo ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iphone: iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Iphone: exibindo página '" + url + "'.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Iphone: adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Iphone: atualizando página.");
    }

}
