public class Veiculo {
    private boolean ligado;
    public void ligar() {
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }
    public boolean getLigado(){
        return ligado;
    }
}