package OOPS;

public class a3
{
    String name;
    int age;
    public a3(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}

class any3
{
    public static void main(String []agrs)
    {
        a3 obj1 = new a3("golu",18);
        a3 obj2 = new a3("golu",18);
        System.out.println(obj1.name == obj2.name); // value +  address
        System.out.println(obj1.name.equals(obj2.name)); // check the actual value
        System.out.println(obj1.name.equals(obj2.name));
    }
}
