package Internet;

public class Safari implements Internet {


    @Override
    public void browser() {
        System.out.println("Pesquisando");
    }

    @Override
    public void email() {
        System.out.println("Acessando email");
    }

    @Override
    public void googleMaps() {
        System.out.println("Acessando google maps");
    }
}
