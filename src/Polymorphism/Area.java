package Polymorphism;

public class Area {
    float r;
    int a;
    int b;
    public int s=10;

    public float area(float r)
    {
        return (float) (3.14*r*r);
    }

    public int area(int a, int b)
    {
        return a*b;
    }

    public int area(int a)
    {
        return a*a;
    }

    public static void message()
    {
        System.out.println("Welcome to OOPS concept");
    }



}
