package Basic;

public class Inheritence {
    public static void main(String[] args) {
        // single level inheritence example
         Fish shark=new Fish();
        shark.eat();

        // multi level inheritance example
        Mammal dog=new Mammal();
        dog.eat();
        dog.legs=4;
        System.out.println(dog.legs);

        //hierarchical inheritence example

        Birds peacock = new Birds();
        peacock.eat();
        peacock.fly();
    }
}
// base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

//derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims");
    }
}

// others derived class
class Mammal extends Animal{
    int legs;
    void walks(){
        System.out.println("walks");
    }
}

// other derived class

class Birds extends Animal{
    void fly(){
        System.out.println("fly");
    }
}