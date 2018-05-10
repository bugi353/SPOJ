/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package czyumieszpotegowac;

import java.lang.Math;
import java.util.Scanner;
        
public class Czyumieszpotegowac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int ile;
        double a, b, potega;
        String ostatniaCyfra;
        
        Scanner odczyt = new Scanner(System.in);
        ile = odczyt.nextInt();
        
        for (int i=0; i<ile ; i++)
        {
            a = odczyt.nextDouble();
          
            b = odczyt.nextDouble();
           
            if(a%10 == 0)
            {
                System.out.println("0");
            }
            
            else
            {
            potega = Math.pow(a, b);
            
            
            ostatniaCyfra = Long.toString((long)potega);
            System.out.println(potega);
            System.out.println(ostatniaCyfra.substring(ostatniaCyfra.length()-1));
            }
            
        }
        
    }
    
}
