/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplomatriz;

/**
 *
 * @author Gustavo
 */
public class ExemploMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        for(int linha = 0 ;linha<3;linha++){
            for (int coluna=0;coluna<3;coluna++){
                System.out.println("Matriz["+linha+"]"+"["+coluna+"]"+matriz[linha][coluna]);
            }
        }
    }
    
}
