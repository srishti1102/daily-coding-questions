package Basic;

public class Constructors {
    public static void main(String[] args) {
        Student s1=new Student("srishti");
        s1.setRoll(10);
        s1.setName("Mushkan");
        System.out.println(s1.getName());
        System.out.println(s1.getRoll());
    }
}


class Student{
    private String name;
    private int roll;
    //constructor
    Student(String name){
        this.name=name;
    }

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
