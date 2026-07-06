package OOPS;

public class class_trial
{
    String name;
    int age;

    public void initial(String name, int age)
    {
        name = name;
        age = age;
    }
}
class demo
{
    public static void main(String[] agrs)
    {
        class_trial s1 = new class_trial();
        s1.initial("golu",20);

        class_trial s2 = new class_trial();
        s2.initial("monu",21);

        class_trial s3 = new class_trial();
        s3.initial("lund",22);

        System.out.println("name : " + s1.name + " & age : "+s1.age);
        System.out.println("name : " + s2.name + " & age : "+s2.age);
        System.out.println("name : " + s3.name + " & age : "+s3.age);
    }
}