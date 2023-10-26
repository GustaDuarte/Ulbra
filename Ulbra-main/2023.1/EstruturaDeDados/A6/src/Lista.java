public class Lista { //head / cabeça / descritor
    Elemento inicio;
    Elemento fim;
    int tamanho;



    public boolean add(Elemento e){
        if (this.inicio == null){
            addFist(e);
        }else{
            e.proximo = this.inicio;
            this.inicio = e;
            this.tamanho++;
        }

        return true;
    }

    public int getTamanho(){
        int tam = 0;
        Elemento e = this.inicio;
        while (e != null){
            tam++;
            e = e.proximo;
        }
        return tam;
    }

    public int getTamanho2(){
        return this.tamanho;
    }

    public boolean addFim(Elemento e){
        if (this.inicio == null){
            addFist(e);
        }else{
            Elemento aux = inicio;
            while (aux.proximo != null){
                aux = aux.proximo;
            }
            aux.proximo = e;
            fim = e;
            tamanho++;
        }
        return true;
    }

    public boolean addFim2(Elemento e){
        if (this.inicio == null){
            addFist(e);
        }else{
            Elemento aux = fim;
            aux.proximo = e;
            fim = e;
            tamanho++;
        }
        return true;
    }

    public boolean addFist(Elemento e){
        this.inicio = e;
        this.fim = e;
        this.tamanho++;
        return true;
    }

}
