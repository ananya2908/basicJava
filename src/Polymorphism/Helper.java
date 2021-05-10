package Polymorphism;

public class Helper extends Area{

    public static void message()
    {
        System.out.println("Welcome to Polymorphism");
    }


    public static void main(String args[])
    {
        Area a=new Area();
        float circleArea;
        int sqArea;
        int recArea;

        circleArea=a.area((float) 2.5);
        sqArea=a.area(4);
        recArea=a.area(2,5);

        System.out.println(circleArea);
        System.out.println(sqArea);
        System.out.println(recArea);
        message();
        System.out.println(a.s);



    }
}
