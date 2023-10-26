public class Main {
    public static void main(String[] args) {
        Automovel auto = new Automovel();
        auto.ligar();
        System.out.println(auto.getLigado());

        Motocicleta moto = new Motocicleta();
        moto.desligar();
        System.out.println(moto.getLigado());

        Onibus o = new Onibus();
        o.desligar();
        System.out.println(o.getLigado());
    }
}