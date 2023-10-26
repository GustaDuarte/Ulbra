public class Aluno {
    double prova1;
    double prova2;
    double media;

    Prova nota = new Prova();

    double calcularMedia(double prova1, double prova2){
        //pegar as NOTA1 e NOTA2 para calcular a media
        //Media aritmética
        this.prova1 = prova1;
        this.prova2 = prova2;
        media = (prova1+prova2)/2;
        return media;
    }


}
