package OOPS;

public class cons
{
    String name;
    int age;

    public cons() // default constructor
    {
        System.out.println("huihui");
    }
    cons(String name ,int age) // \ hello
    {
        this.name = name;
        this.age = age;
        System.out.println(this.name + " - " + this.age);
    }

//    public void print()
//    {
//        System.out.println(this.name + " - " + this.age);
//    }
    public static void main(String[] args)
    {
        cons s1 = new cons("tyson" , 20);
        cons s2 = new cons("monu" , 21);
        cons s3 = new cons("gagi" , 19);
//        s1.print();
//        s2.print();
//        s3.print();
    }
}
