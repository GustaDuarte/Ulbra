public class minhaPilha {
    private int vetor[] = new int[10];
    private int topo;

    public void inicializar() {
        topo = -1;
    }

    public int pop(){
        int valor= vetor[topo];
        topo--;
        return valor;
    }

    public int push(int valor) {
        topo++;
        vetor[topo] = valor;
        return vetor[topo];
    }

    public void top(){
        System.out.println(vetor[topo]);
    }

    public void exibir() {
        System.out.println(vetor[topo]);
    }
}