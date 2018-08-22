
import java.util.Random;
import java.util.Scanner;

 
public class BuscaBinaria{
     public static void main(String[] args) {
    Scanner tcl =  new  Scanner( System.in );
        Random valores = new Random();
        
        System.out.println ( "Informe o tamanho do vetor " );
        
        int num = tcl.nextInt();
        int vetor[] = new int [num];
        
            
        for ( int i =  0 ; i < vetor.length; i ++ ) {
            vetor [i] = valores.nextInt (num);

        }
        int min = vetor [ 0 ];
        int max = vetor.length;
        int meio = (min + max) /  2 ;

        System.out.println ( "Valor para procurar: " );
        int valor = tcl . nextInt ();

        if (valor < meio) {
            for ( int i =  0 ; i < vetor.length; i ++ ) {
                if (valor == vetor [i]) {
                    System.out.println ( " O valor se encontra em: "  + i);
                }
            }
        } else  if (valor > meio) {
            for ( int i =  0 ; i < vetor.length; i ++ ) {
                if (valor == vetor [i]) {
                    System.out.println ( " O se encontra em: "  + i);
                }
            }
        } else  if (valor == meio) {
            System.out.println ( " O valor se encontra em: "  + meio);
        }
    }
}