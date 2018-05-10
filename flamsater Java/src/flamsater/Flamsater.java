
package flamsater;

import java.util.Date;
import java.util.Scanner;

public class Flamsater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long start, stop;
        
        start = System.currentTimeMillis();
        
        int a, x;
        Scanner o = new Scanner (System.in);
        StringBuilder e;
        a = o.nextInt();
        String w;
        
        for (int i = 0; i < a; i++)
        {
            w = o.next();
            x = 1;
            for(int j = 1; j< w.length(); j++)
            {
                if(w.charAt(j)==w.charAt(j-1) && j<w.length()-1)
                    x++;
                else if(w.charAt(j)!=w.charAt(j-1))
                {
                    if(x<3)
                    {
                        x = 1;
                    }
                    else 
                    {
                        e = new StringBuilder(w);
                        e.delete(j-x+1, j);
                        e.insert(j-x+1, x);
                        w = e.toString();
                        if (3<=x && x<10)
                            j = j-x+1;
                        else if (10<=x && x<100)
                             j = j-x+2;
                        else if (100<x && x<=999)
                            j = j-x+3;
                        x = 1;
                        
                    }
                }
                else if(w.charAt(j)==w.charAt(j-1))
                {
                    x++;
                    if (3<=x)
                    {
                    
                    e = new StringBuilder(w);
                        e.delete(j-x+1, j);
                        e.insert(j-x+2, x);
                        w = e.toString();
                    }
                }
            }
            System.out.println(w);  
        }
        stop = System.currentTimeMillis();
        System.out.println(stop-start);
        
    }
}
