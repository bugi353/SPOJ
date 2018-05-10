/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package czyumieszpotegowaclepsze;

import java.util.Scanner;

/**
 *
 * @author Piotr
 */
public class CzyUmieszPotegowacLepsze {

    
    
    public static void main(String[] args) {
       
        int ile,a, b;
        String d;
        char c;
        
        
        Scanner odczyt = new Scanner(System.in);
        ile = odczyt.nextInt();
        
        for (int i=0; i<ile ; i++)
        {
            a = odczyt.nextInt();
                    
          
            b = odczyt.nextInt();
            
           d =  Integer.toString(a);
           
            c = d.charAt(d.length()-1);
            
            
            switch(c)
            {
                case '0':
                {
                    System.out.println("0");
                    break;
                }
                case '1':
                {
                    System.out.println("1");
                    break;
                }
                case '2':
                {
                    if(b%4==0)
                        System.out.println("6");
                    if(b%4==1)
                        System.out.println("2");
                    if(b%4==2)
                        System.out.println("4");
                    if(b%4==3)
                        System.out.println("8");
                    break;
                    
                }
                case '3':
                {
                    if(b%4==0)
                        System.out.println("1");
                    if(b%4==1)
                        System.out.println("3");
                    if(b%4==2)
                        System.out.println("9");
                    if(b%4==3)
                        System.out.println("7");
                    break;
                }
                case '4':
                {
                    if(b%2==0)
                        System.out.println("6");
                    if(b%2==1)
                        System.out.println("4");
                    break;
                    
                }
                case '5':
                {
                    System.out.println("5");
                    break;
                }
                case '6':
                {
                    System.out.println("6");
                    break;
                }
                case '7':
                {
                    if(b%4==0)
                        System.out.println("1");
                    if(b%4==1)
                        System.out.println("7");
                    if(b%4==2)
                        System.out.println("9");
                    if(b%4==3)
                        System.out.println("3");
                    break;
                }
                case '8':
                {
                    if(b%4==0)
                        System.out.println("6");
                    if(b%4==1)
                        System.out.println("8");
                    if(b%4==2)
                        System.out.println("4");
                    if(b%4==3)
                        System.out.println("2");
                    break;
                }
                case '9':
                {
                    if(b%2==0)
                        System.out.println("1");
                    if(b%2==1)
                        System.out.println("9");
                    break;
                    
                }
            }
            
        }
        
    }
    
}
