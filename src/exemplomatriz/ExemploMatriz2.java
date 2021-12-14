/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplomatriz;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class ExemploMatriz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        int matrizA[][] = new int[4][4];
	   int linha;
	   int coluna;

	  
   Scanner sc = new Scanner(System.in);


	   //entrada de dados//
	  for(linha=1;linha<=3;linha++)
		  {
      for(coluna=1;coluna<=3;coluna++)
		{
      System.out.println("Digite os valores da matrizA["+linha +"]" + "[ "+coluna+"]:");
      matrizA[linha][coluna] = sc.nextInt();
 				
		}
	  
		  }
	    	  
	   //Saida de Dados//

 for(linha=1;linha<=3;linha++)
		  {
      for(coluna=1;coluna<=3;coluna++)
		{

     System.out.println("matrizA["+linha +"]" + "[ "+coluna+"]:" + matrizA[linha][coluna]);

			}
			  }
    }
}
    
    

