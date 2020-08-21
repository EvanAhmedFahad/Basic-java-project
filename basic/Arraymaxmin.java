

package basic;

import java.util.Scanner;



public class Arraymaxmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num[] = new int[5];
        int sum = 0;
        System.out.println(" Enter 5 number:");
        
        for (int i = 0; i < 5; i++) {
            num [i]=input.nextInt();
            
        }
        for (int i = 0; i < 5; i++) {
            sum =sum + num[i];
        }
        double avg = sum/5;
        System.out.println("the sum is"+sum);
        System.out.println(" the average"+avg);
        
        double max = num[0];
        double min =num[0];
        for (int i = 1; i < 5; i++) {
            if(max<num[i]){
                max=num[i];
            }
            if(min>num[i]){
                min= num[i];
            }
        }
        System.out.println(" max"+max);
        System.out.println(" min"+min);
        
    }
    
}
