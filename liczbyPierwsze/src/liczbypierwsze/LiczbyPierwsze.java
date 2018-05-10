/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liczbypierwsze;

import java.util.Scanner;

/**
 *
 * @author Piotr
 */
public class LiczbyPierwsze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner odczyt = new Scanner(System.in);
        int ile, lp;
        
        ile = odczyt.nextInt();
        
        for(int j=0; j<ile; j++)
        {
            lp = odczyt.nextInt();
            if(lp == 1)
            {
                System.out.println("NIE");
                continue;
            }
            if(lp == 2)
            {
                System.out.println("TAK");
                continue;
            }
            for(int i=2; i<lp; i++)
        {
            if(lp%i == 0)
            {
                System.out.println("NIE");
                break;    
            }
            if(i == lp-1 && lp%i != 0)
                {
                    System.out.println("TAK");
                }
                
        }
        }
        
    }
    
}
