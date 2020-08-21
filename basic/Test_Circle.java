
package basic;


public class Test_Circle {
    private double radius = 1.0;
    private  String color  = "red";
     double r;
    
    Test_Circle(){
        
    }
    Test_Circle(double r){
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    
    }

    public double getArea() {
     
     return  Math.PI*radius*radius;
    }
    
    
}
    
    

