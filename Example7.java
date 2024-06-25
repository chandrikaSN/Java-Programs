public class Example7
{
    public void greet(String name, int age)
    {
        System.out.println("hello" + name + "you are" + age + "years old");

    }
     public static void main(String args[])
     {
         Example7 example=new Example7();
         example.greet("allisce", 30);
     }
}