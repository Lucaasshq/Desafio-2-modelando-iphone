package MP3;

public class iPod implements MP3 {
    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void SelecionarMusica() {
        System.out.println("Selecionando musica");
    }
}
