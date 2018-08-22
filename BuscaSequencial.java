package buscasequencial;

import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {
       Scanner tcl = new Scanner(System.in);
        int vetor[] = new int[10];       
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = tcl.nextInt();
            
        }
        boolean resul = false;
        System.out.println("Digite o valor a ser procurado");
        int nume = tcl.nextInt();
        for (int j = 0; j < vetor.length; j++) {
            if(nume == vetor[j]) {
               System.out.println("Numero encontrado na posição: " + j);
                resul = true;
                break;
            }else{
                resul = false;                
            }
        }
        if(resul == false){
            System.out.println("Valor não encontrado");
        }
    }
    
}
