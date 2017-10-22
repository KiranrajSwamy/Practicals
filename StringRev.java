import java.util.*;

public class StringRev {
    
    public static void main(String args[]){
        
        String str;
        System.out.print("Enter the string");
        Scanner sc= new Scanner(System.in);
        str=sc.nextLine();
        
        String [] strarr= str.split(" ");
        
        int n=strarr.length;
       for(int i=(strarr.length-1); i>=0; i--)
                {
                        System.out.print(strarr[i]);
                        System.out.print(" ");
                }
        
        
    } 
}
