
package basic;


public class MainClass {
    public static void main(String[] args) {
        Animal1 myAnimal = new Animal1();
        Animal1 mycat = new Cat();
        Animal1 mydog = new Dog();
        myAnimal.animalSound();
        mycat.animalSound();
        mydog.animalSound();
    }
    
}
