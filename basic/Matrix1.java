
package basic;

import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][]A = new int [2][3];
        int sumofdiagonals = 0;
        int sumofupperelement = 0;
        int sumoflowerelement = 0;
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col]= input.nextInt();
                
            }
        }
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
               
                if(row== col){
                    sumofdiagonals = sumofdiagonals + A[row][col];
                }
                if(col>row){
                    sumofupperelement =sumofupperelement + A[row][col];
                }
                if(row>col){
                    sumoflowerelement = sumoflowerelement+ A[row][col];
                }
            }
        }
         System.out.println("sum of digonals ="+sumofdiagonals);
        System.out.println("sum of upper element="+sumofupperelement);
        System.out.println("sum of lower element ="+sumoflowerelement);
    }
   
}
