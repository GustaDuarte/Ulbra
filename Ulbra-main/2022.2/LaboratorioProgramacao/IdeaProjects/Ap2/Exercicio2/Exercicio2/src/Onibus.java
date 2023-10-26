public class Onibus extends Veiculo{
    @Override
    public void ligar() {
        super.ligar();
        System.out.println("Onibus Ligado");
    }
    @Override
    public void desligar() {
        super.desligar();
        System.out.println("Onibus Desligado");
    }
    @Override
    public boolean getLigado() {
        return super.getLigado();
    }
}