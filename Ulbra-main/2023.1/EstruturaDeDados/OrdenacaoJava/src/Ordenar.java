public class Ordenar {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        int comp = 0;
        int troca = 0;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move os elementos do arr[0...i-1] maiores que a chave para uma posição à frente
            while (j >= 0 && arr[j] > key) {
                comp++;
                arr[j + 1] = arr[j];
                j = j - 1;
                troca++;
            }
            arr[j + 1] = key;
            troca++;
        }
        System.out.println("Insertion Sort:");
        System.out.println("Comparações: " + comp);
        System.out.println("Trocas: " + troca);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int comp = 0;
        int troca = 0;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                comp++;
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            troca++;
        }
        System.out.println("Selection Sort:");
        System.out.println("Comparações: " + comp);
        System.out.println("Trocas: " + troca);
    }

}