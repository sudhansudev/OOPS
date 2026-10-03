package OOPS;
public class std2 {
    String name;
    int age;


    //constuctor
    public std2(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(this.name + " " + this.age);
    }
    public void print()

    {
        System.out.println(this.name + " " + this.age);
    }
}
class stdnt
{
    public static void main(String [] args)
    {
        std2 s1 = new std2("tyson",18);
    }
}
