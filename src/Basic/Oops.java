package Basic;

public class Oops {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(3);
        System.out.println(p1.tip);
    }
}



class Pen{
    String color;
    int tip;
    void setColor(String newColour){
        color=newColour;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
