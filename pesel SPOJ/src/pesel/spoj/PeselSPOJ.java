/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesel.spoj;

import java.util.Scanner;
import java.lang.Math;

        
public class PeselSPOJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long pesel, ile, suma, konwersja;
        long [] x = new long [12];
        Scanner odczyt = new Scanner(System.in);
        ile = odczyt.nextInt();
        
        
        
       for (int i=0; i<ile; i++)
       {
           pesel = odczyt.nextLong();
           konwersja = pesel;
           
           for( int j=0; j<11; j++)
           {
                
               x[j] = konwersja/(long)(Math.pow(10,-j)*(Math.pow(10,10)));
               konwersja = konwersja - x[j] * (long)(Math.pow(10,-j)*Math.pow(10,10));
             
              
           }
           
           suma = x[0]*1+x[1]*3+x[2]*7+x[3]*9+x[4]*1+x[5]*3+x[6]*7+x[7]*9+x[8]*1+x[9]*3+x[10]*1;
           
           
           if ((suma > 0) && (suma%10)==0)
           {
               System.out.println("D");
           }
           else
               System.out.println("N");
       }
    }
    
}
