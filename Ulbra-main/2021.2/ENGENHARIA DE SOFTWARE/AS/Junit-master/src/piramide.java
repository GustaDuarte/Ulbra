class Piramide {
    private int base;
    private int altura;

    public  Piramide(int base,int altura){
        this.altura= altura;
        this.base = base;
    }

    public int calcularVolume() {
        return (base * altura) / 3;
    }
}
