
package matriz;

import java.util.Random;
import java.util.Scanner;


public class Matriz {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random numer = new Random(10);
      int matriz[][] = new int[5][5]; 
      
        for (int c = 0; c < matriz.length; c++) {
            for (int l = 0; l < matriz[0].length; l++){
                matriz[l][c] = numer.nextInt(100);
                
            }
        }
       for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("\t");
        }
        boolean resul = false;
        int nume = tcl.nextInt();
        for (int a = 0; a < matriz.length; a++) {
            for (int b = 0; b < matriz[0].length; b++) {
                
            
                if(nume == matriz[a][b]){
                   System.out.println("Numero encontrado na coluna: " + (b + 1) + " linha: " + (a+1));
                    resul = true;
                    break;
                }
            }
            
        }
        if(resul == false){
            System.out.println("Valor não encontrado");
        }
    }
}    
    
