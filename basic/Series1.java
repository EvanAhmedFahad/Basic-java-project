
package basic;

import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n,sum =0;
         
        System.out.print("Enter number :");
        n = input.nextDouble();
        
        for(double i=1.5; i<n; i=i+1){
            System.out.print(i+"  ");
            sum = sum +i;
            
        }
        System.out.println();
        System.out.println("sum  ="+sum);
        
    }
    
}
