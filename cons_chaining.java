package OOPS;

public class cons_chaining
{
    int age;
    String name;
    public cons_chaining()
    {
        this("tyson");
        System.out.println("default constructor !");
    }

    public cons_chaining(String name)
    {
        this("tyson1m" , 20);
        System.out.println("single parameter !");
    }

    public cons_chaining(String name , int age)
    {
        System.out.println("double parameter !");
    }
    public static void main(String[] args)
    {
        cons_chaining obj = new cons_chaining();
    }
}
