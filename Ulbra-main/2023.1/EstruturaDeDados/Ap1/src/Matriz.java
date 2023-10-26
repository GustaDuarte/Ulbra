public class Matriz {
    private int[][] imagem = {
            {0, 0, 1, 1, 0, 0, 1, 0, 0, 0},
            {1, 1, 0, 0, 0, 1, 1, 0, 0, 0},
            {1, 1, 1, 0, 0, 1, 0, 0, 0, 1},
            {0, 0, 0, 1, 1, 0, 0, 0, 1, 1},
            {0, 0, 0, 1, 1, 1, 0, 1, 1, 0},
            {0, 1, 1, 0, 0, 0, 1, 1, 0, 1},
            {1, 0, 0, 0, 1, 1, 1, 0, 1, 0},
            {0, 0, 1, 0, 0, 0, 1, 1, 1, 1},
            {0, 1, 1, 1, 1, 0, 0, 0, 1, 0},
            {1, 1, 0, 1, 0, 1, 0, 1, 0, 0} };

    int[][] padrao = {
            {1, 0},
            {0, 1} };
    int vezesEncontrado = 0;
    public void MatrizTeste(){
        long tempoInicial = System.nanoTime();

        for (int i = 0; i < imagem.length - padrao.length + 1; i++) {
            for (int j = 0; j < imagem[0].length - padrao[0].length + 1; j++) {
                if (verificaPadrao(i, j, padrao)) {
                    vezesEncontrado++;
                }
            }
        }

        long tempoFinal = System.nanoTime();
        System.out.println("O padrão foi encontrado " + vezesEncontrado + " vezes na imagem.");
        System.out.println("Tempo gasto: " + (tempoFinal - tempoInicial) / 1000000.0 + " segundos.");
    }

    public boolean verificaPadrao(int i, int j, int[][] padrao) {
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
