import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }

        long inicio, fim;

        inicio = System.currentTimeMillis();
        Ordenar.insertionSort(arr);
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio)/1000.0 + " segundos"+ "\n");
        System.out.println("====================================================");
        System.out.println("====================================================\n");
        inicio = System.currentTimeMillis();
        Ordenar.selectionSort(arr);
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio)/1000.0 + " segundos");


    }
}