
public class Elemento {
    int dado;//qualquer coisa
    Elemento prox;

    public Elemento(int value){
        dado= value;
    }

    public void show(){
        System.out.println("Valor:"+dado);
    }

}