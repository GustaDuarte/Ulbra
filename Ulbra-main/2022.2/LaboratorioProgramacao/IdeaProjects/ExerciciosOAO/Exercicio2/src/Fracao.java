public class Fracao {
    public int numerador;
    public int denominador;
    public int numerador2;
    public int denominador2;
    public int numerador3;
    public int denominador3;

    public void mult(){
        numerador3 = numerador*numerador2;
        denominador3 = denominador*denominador2;
        System.out.println("O resultado da fracao eh: ");
        System.out.println("Numerador: "+numerador3);
        System.out.println("Denominador: "+denominador3);
}

    /* OUTRA FORMA DE MOSTRAR O RESULTADO

        public int resultnumerador(){return numerador3;}
        public int resultdenominador(){return denominador3;}
     */

}
