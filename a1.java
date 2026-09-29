package OOPS;

public class a1
{
    private String name;
    private int age;

    // parameterized constructor 
    public a1(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // getter to read the property
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        if(age < 0) return ;// validation 
        this.age = age;
    }

}

class any
{
    static void main()
    {
        a1 obj = new a1("golu",78);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        obj.setName("goluuu");
        obj.setAge(23);
        System.out.println(obj.getAge());
    }
}
