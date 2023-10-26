public class Prova {
    double notaParte1;
    double notaParte2;
    double notaTotal;

    double calcularNotaTotal(double notaParte1, double notaParte2){
        this.notaParte1 = notaParte1;
        this.notaParte2 = notaParte2;
        notaTotal = notaParte1+notaParte2;
        if (notaTotal > 10){notaTotal=10;}
        return notaTotal;
    }
}
