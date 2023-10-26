/*3 - Crie uma classe que gera um número aleatoriamente (entre 5 e 10) por
Math.random. Em seguida, faça com que apareça em tela uma senha
numérica contendo a mesma quantidade de dígitos correspondentes ao
valor aleatório gerado. Apresente em tela o número sorteado e a senha.
 */

public class exercicio3 {
    public static void main(String[] args) {

        int numeroAleatorio;
        int variavel;
        String variavelString = "";

        System.out.println("\n===========================================");
        numeroAleatorio = 5 + (int)(Math.random()*6);
        System.out.println("Numero aleatorio gerado: "+numeroAleatorio);

        for (int i = numeroAleatorio; i != 0; i--){
            variavel = 0 + (int)(Math.random()*9);
            variavelString = ""+variavelString.concat(String.valueOf(variavel));
        }

        System.out.println("Senha aleatoria gerada: "+variavelString);
        System.out.println("===========================================\n");
    }
}
