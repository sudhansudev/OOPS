package OOPS;

public class constr1
{
    String name;
    int age;
    // CONSTRUCTOR CHAINING
    //default constructor
    public constr1()
    {
        System.out.println("huihui");
//        this("tyson");
        System.out.println("default .");
    }
    //parameterized constructor
    public constr1(String name)
    {
        this.name = name;
//        this("golu",20);
        System.out.println("one parameter");
    }
    public constr1(String name, int age)
    {
        this.age = age;
        this.name = name;
        System.out.println("two parameter" + age + " & " + name);
    }
}
    class Random
    {
        public static void main(String [] args)
        {
            constr1 obj = new constr1("tyson",56);

        }
    }

