/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author piyus
 */
public class Co {
    	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    String b = sc.next();
                    String a[]=b.split("");
		  
		    int counter=0;
		   
		    for(int i=0;i<a.length;i++){
		        
		        counter=counter+ Integer.parseInt(a[i]);
                         
                    }
                    System.out.println(counter);
		        
		        int r = 120-n;
		        
		        float res = ((float) (counter+r)/120)*100;
                                            System.out.println(res);
		         if(res<75)
		         System.out.println("NO");
		         else
		         System.out.println("YES");

		    }
		    t--;
		    
		    
		}
}


