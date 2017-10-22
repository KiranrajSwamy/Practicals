import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pattern.print;

/**
 *
 * @author Jayraj
 */
public class PatternPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // number of spaces
        int n = 5,num=1;
        int k = 2*n - 2;
  
        
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<k; j++)
            {
                // printing spaces
               // System.out.print(" ");
            }
            //k = k - 1;
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print(num+" ");
                num++;
            }
  
            // ending line after each row
            System.out.println();
    }
    
}

}