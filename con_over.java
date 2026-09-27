package OOPS;

public class con_over
{
    String name;
    int age;

    public con_over() //default constructor
    {
        System.out.println("huihui !");
    }

    public con_over(String name)
    //parameterized constructor
    // student can pass only name field and skip the age if he wants to
    {
        this.name = name;
        System.out.println(this.name);
    }
    public con_over(String name , int age)
    // student can pass both name and age
    {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args)
    {
        con_over obj = new con_over("tyson");
        con_over s1 = new con_over();


    }
}
