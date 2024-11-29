package Basic;

public class AbstractsClass {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.walk();
        h1.eat();
        chicken c1=new chicken();
        c1.walk();
        c1.eat();

    }
}

 abstract class Animals{
    void eat(){
        System.out.println("animals eats");
    }
    abstract void walk();
 }

 class Horse extends Animals{
    void walk(){
        System.out.println("walks on 4 legs");
    }
 }

 class chicken extends Animals{
    void walk(){
        System.out.println("wals on 2 leg");
    }
 }