public class Main {
    public static void main(String[] args) {
        Elemento a = new Elemento();
        a.valor = 10;

        Elemento b = new Elemento();
        b.valor = 12;

        Elemento c = new Elemento();
        c.valor = 14;

        Lista minhaLista = new Lista();
        minhaLista.add(a);
        minhaLista.add(b);
        minhaLista.addFim(c);

        System.out.println(minhaLista.getTamanho());

    }
}