
package basic;


public class Wrapper_class {
    public static void main(String[] args) {
        
        int x =30;
        int y =Integer.valueOf(x);
        System.out.println(" y="+y);
        Integer z=x;
        System.out.println("z ="+z);
        
        Double d =new Double (10.4);
        
        System.out.println(" d ="+d);
        double e = d.doubleValue();
        System.out.println("e ="+e);
        
        
        
        
    }
    
}
