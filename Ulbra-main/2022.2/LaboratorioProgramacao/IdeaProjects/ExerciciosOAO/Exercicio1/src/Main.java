public class Main {
    public static void main(String[] args) {
        //cria objeto relogio
        Relogio rl = new Relogio();

        //acertar relogio
        rl.acertarRelogio(3,30,50);

        //mostrar as posições dos ponteiros do relogio
        System.out.println("Posição da hora " + rl.ponteiroHora.posicao);
        System.out.println("Posição do minuto " + rl.ponteiroMinuto.posicao);
        System.out.println("Posição do segundo " + rl.ponteiroSegundo.posicao);

        //
        int hora = rl.lerHora();
        int minuto = rl.lerMinuto();
        int segundo = rl.lerSegundo();

        //mostra hora, minuto e segundo
        System.out.println("Hora: "+hora);
        System.out.println("Minuto: "+minuto);
        System.out.println("Segundo: "+segundo);

        Relogio r2 = new Relogio();
        r2.acertarRelogio(14,0,0);
        System.out.println("Valor da hora: "+r2.lerHora());
    }
}