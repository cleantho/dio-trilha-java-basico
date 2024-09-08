public class App {
    public static void main(String[] args) throws Exception {
        String music = "November rain";
        String phoneNumber = "84-9999-8888";
        String urlPage = "https://github.com/cleantho";
        
        Iphone myIPhone = new Iphone();
        
        myIPhone.tocar();
        myIPhone.pausar();
        myIPhone.selecionarMusica(music);
        myIPhone.ligar(phoneNumber);
        myIPhone.atender();
        myIPhone.iniciarCorreioVoz();
        myIPhone.exibirPagina(urlPage);
        myIPhone.adicionarNovaAba();
        myIPhone.atualizarPagina();
    }
}
