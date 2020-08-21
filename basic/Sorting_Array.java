
package basic;

import java.util.Arrays;

public class Sorting_Array {
    public static void main(String[] args) {
        int []num = {10,-3,4,5,23,45};
        Arrays.sort(num);
        for (int i = 0; i < 6; i++) {
            System.out.print("  "+num[i]);
            
        }
        System.out.println();
        for (int i = 5; i >=0; i--) {
            
            System.out.print(" "+num[i]);
        }
    }
    
}
