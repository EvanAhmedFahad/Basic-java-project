
package basic;

import java.util.Scanner;


public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         double[] num =new double[5];
         double sum =0;
        System.out.println("Enter 5 number:");
        for (int i = 0; i <5; i++) {
            num[i] =input.nextDouble();
            
        }
        for (int i = 0; i < 5; i++) {
            sum =sum +num[i];
            
        }
        System.out.println("the sum is:"+sum);
    }
    
}
