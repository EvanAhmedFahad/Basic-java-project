
package basic;

import java.util.Scanner;

public class Printonetoten {
    public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
        int sum = 0;
        int m,n;
      
         System.out.println("Enter inisial num :");
        m= input.nextInt();
        
         System.out.println("Enter final num :");
        n= input.nextInt();
        
        
        
        for(int i=m; i<=n; i++){
            
            if(i%2==0){
                sum = sum + i;
            System.out.print("      "+i);
            
            }
            
        }
        System.out.println();
        System.out.println("the sum is  :"+sum);
    }
    
}
