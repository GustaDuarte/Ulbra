 class Retangulo {
    private int base;
    private int altura;
    private int largura;

    public  Retangulo(int base, int altura, int largura){
        this.altura= altura;
        this.base= base;
        this.largura = largura;
    }

    public int calcularArea() {
        return base * altura;
    }
    public int calcularPerimetro() {
        return 2*base + 2* altura;
    }
    public int calcularVolume() {
        return base * altura * largura;
    }
}


