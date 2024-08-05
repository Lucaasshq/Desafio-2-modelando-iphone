package Telefone;

public class Telefone implements Ramal{
    @Override
    public void ligar() {
        System.out.println("Ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Desligado");
    }

    @Override
    public void selecionarContato() {
        System.out.println("Selecionado contato");
    }

    @Override
    public void realizarChamada() {
        System.out.println("Realizando chamada");
    }
}
