import Internet.Internet;
import MP3.MP3;
import Telefone.Ramal;

public class Iphone implements Internet, MP3, Ramal {

    @Override
    public void browser() {
        System.out.println("Acessando browser via Iphone");

    }

    @Override
    public void email() {
        System.out.println("Acessando email via Iphone");
    }

    @Override
    public void googleMaps() {
        System.out.println("Acessando google maps via Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica via Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica via Iphone");
    }

    @Override
    public void SelecionarMusica() {
        System.out.println("Selecionando musica via Iphone");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando via Iphone");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando via Iphone");
    }

    @Override
    public void selecionarContato() {
        System.out.println("Selecionando contato via Iphone");
    }

    @Override
    public void realizarChamada() {
        System.out.println("Realizando chamada via Iphone");
    }
}
