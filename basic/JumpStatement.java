
package basic;


public class JumpStatement {
    public static void main(String[] args) {
       for(int i=1; i<=100; i++){
            
                
                if(i==10){
                    continue;
                   
                }
                
                for(int j=1; j<=100; j++){
                     if(j>26){
                     break;
                 }
                     System.out.println(j);
                }
               
                
                ;
        }
    }
    
}
