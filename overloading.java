package OOPS;

public class overloading
{
    public int add(int a , int b) //
    {
        return a+b;
    }
    public double add(double a , double b) //
    {
        return a-b;
    }
    public static void main(String[] args)
    {
        overloading obj = new overloading();
        System.out.println(obj.add(12,20));
        System.out.println(obj.add(120.0,20.0));

    }
}
