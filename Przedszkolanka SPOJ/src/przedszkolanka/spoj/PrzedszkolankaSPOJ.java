/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package przedszkolanka.spoj;

import java.util.Scanner;
        
public class PrzedszkolankaSPOJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       int grupaA, grupaB, cukierki, ile, cnaos = 1;
       
       Scanner wczytaj = new Scanner(System.in);
       ile = wczytaj.nextInt();
       
       for (int i = 0; i<ile; i++)
       {
           grupaA = wczytaj.nextInt();
           grupaB = wczytaj.nextInt();
           cnaos = 1;
           if (grupaA >= grupaB)
                while(true)
           {
               cukierki = cnaos*grupaA;
               
               if(cukierki%grupaB == 0)
               {
                   break;
               }
               cnaos++;
           }
           else
               while(true)
           {
               cukierki = cnaos*grupaB;
               
               if(cukierki%grupaA == 0)
               {
                   break;
               }
               cnaos++;
           }
          
           System.out.println(cukierki);
       }
       
       
       
    }
    
}
