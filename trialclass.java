package OOPS;

public class trialclass
{
    String name;
    int age;
    // contructor with no parameter
//    trialclass()
//    {
//        System.out.println("huihui");
//    }

    // parameterized constructor
    trialclass(String name, int age)
    {
         this.name = name;
         this.age = age;
    }
//    public void initialize (String name , int age)
//    {
//        this.name = name;
//        this.age = age;
//    }
    public void print()
    {
        System.out.println(this.name + " " + this.age);
    }
}

class std
{
    public static void main(String [] args)
    {
        trialclass s1 = new trialclass("tyson",18);
//        s1.initialize("tyson", 18);

        trialclass s2 = new trialclass("golu",20);
//        s2.initialize("sekhar", 20);

        s1.print();
        s2.print();

    }
}

