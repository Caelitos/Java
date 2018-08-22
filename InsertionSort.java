package insertion.sort;

import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {
      Random num = new Random();
       int vetor[] = new int[5];       
        
        for (int i = 0; i < vetor.length; i++) {
            
            vetor[i] = num.nextInt(10);
        }

        for (int i = 0; i < vetor.length; i++) {
            int aux = vetor[i];

            for (int j = i - 1; j >= 0 && vetor[j] > aux; j--) {
                vetor[j + 1] = vetor[j];
                vetor[j] = aux;
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        
    }
    
}
