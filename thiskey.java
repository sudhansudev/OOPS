package OOPS;

public class thiskey
{
    String name;
    int age;

    public thiskey(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println(this.name + " & " + this.age);
    }
    public void print1()
    {
        System.out.println(this.name + this.age);
    }
}
class key
{
    public static void main(String [] args)
    {
       thiskey obj = new thiskey("tyson",13);
       obj.print1();
    }
}
