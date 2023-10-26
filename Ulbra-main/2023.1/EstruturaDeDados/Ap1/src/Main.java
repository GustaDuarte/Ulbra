import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        //instanciando e testando metodo para verificar a busca do padrao da classe Matriz que sempre deve retornar o mesmo valor(5)
        Matriz teste = new Matriz();
        teste.MatrizTeste();

        // Pedindo o tamanho da matriz ao usuário
        System.out.print("Digite o número de linhas da matriz: ");
        int nLinhas = input.nextInt();
        //padrao da ap1 {{1, 1}, {1, 0}, {0, 1}};
        System.out.print("Digite o número de colunas da matriz: ");
        int nColunas = input.nextInt();


        // Definindo a matriz
        int[][] imagem = new int[nLinhas][nColunas];
        for (int i = 0; i < nLinhas-1; i++){
            for (int j = 0; j < nColunas-1; j++){
                imagem[i][j] = rand.nextInt(2);
            }
        }

        // Pedindo o padrão a ser buscado ao usuário
        System.out.println("Digite o padrão a ser buscado:");
        System.out.print("Número de linhas: ");
        int padraoLinhas = input.nextInt();
        System.out.print("Número de colunas: ");
        int padraoColunas = input.nextInt();
        int[][] padrao = new int[padraoLinhas][padraoColunas];
        for (int i = 0; i < padraoLinhas; i++) {
            for (int j = 0; j < padraoColunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                padrao[i][j] = input.nextInt();
            }
        }

        // Exibindo o padrão para o usuário
        System.out.println("O padrão informado foi:");
        for (int i = 0; i < padraoLinhas; i++) {
            for (int j = 0; j < padraoColunas; j++) {
                System.out.print(padrao[i][j] + " ");
            }
            System.out.println();
        }

        // Iniciando o cronômetro
        long tempoInicial = System.nanoTime();

        // Contando quantas vezes o padrão foi encontrado
        int vezesEcontrado = 0;
        for (int i = 0; i < imagem.length - padrao.length; i++){
            for (int j = 0; j < imagem[0].length - padrao[0].length; j++){
                if (verificaPadrao(imagem, padrao, i , j)) {
                    vezesEcontrado++;
                }
            }
        }

        // Obtendo o tempo de término
        long tempoFinal = System.nanoTime();

        // Imprimindo o resultado da busca
        if (vezesEcontrado > 0) {
            System.out.println("O padrão foi encontrado " + vezesEcontrado + " vezes na imagem.");
        } else {
            System.out.println("O padrão não foi encontrado na imagem.");
        }

        // Imprimindo o tempo gasto na busca
        System.out.println("Tempo gasto: " + (tempoFinal - tempoInicial) / 100000000.0 + " segundos.");
    }

    // Função que verifica se um padrão está presente na imagem em uma determinada posição
    public static boolean verificaPadrao(int[][] imagem, int[][] padrao, int i, int j) {
        for (int k = 0; k < padrao.length; k++) {
            for (int l = 0; l < padrao[0].length; l++) {
                if (padrao[k][l] != imagem[i + k][j + l]) {
                    return false;
                }
            }
        }
        return true;
    }
}