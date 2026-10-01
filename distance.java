package OOPS;

public class distance
{
    int feet;
    int inches;

    void setDistance(int feet, int inches)
    {
        this.feet = feet;
        this.inches = inches;
        System.out.println("distance : " + feet + " ft " + inches + " inches");
    }
}
class D
{
    public static void main(String [] args)
    {
        distance s1 = new distance();
        distance s2 = new distance();
        s1.setDistance(2 , 3);
        s2.setDistance(3, 5);
    }
}