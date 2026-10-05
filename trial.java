package OOPS;

public class trial
{
    public trial()
    {
        System.out.println("huihui");
    }
    public int add(int a , int b)
    {
        return a+b;
    }
    public float add(float a , float b)
    {
        return a+b;
    }
    public double add(double a , double b)
    {
        return a+b;
    }

    public static void main(String[] args)
    {
        trial obj = new trial();
        obj.add(12,22);
//        obj.add(12.4f,5.0f);
//        obj.add(12,34.00);

//        System.out.println("value is :" + a);
//        System.out.println("value is :" + k);
//        System.out.println("value is :" + d);

    }
}
