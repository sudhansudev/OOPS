package OOPS;

public class a2
{
    private String name;
    private int age;

    //parameterized constructor
    public a2(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println(this.name + " & "  + this.age);
    }

    // @Override
    public String toString()
    {
        return "Student { name = '" +
                name + "' , " +
                " age = " +
                age +
                " } ";
    }
}
class any1
{
    public static void main(String []args)
    {
        a2 obj = new a2("golu",12);
        a2 obj1 = new a2("tyson",23);
        System.out.println(obj);
        System.out.println(obj1);

    }
}
