
package bubble.sort;
public class BubbleSort {

    public static void main(String[] args) {
        int vetor[] = {1, 2, 50, 12, 35, 10};
        int aux;
        
        for (int i = 0; i < vetor.length; i++) {
            
            for (int j = 0; j < vetor.length; j++) {
                if(vetor[i] < vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }  
            }  
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
            
       }
    }   
}
