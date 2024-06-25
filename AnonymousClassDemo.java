public class AnonymousClassDemo
{
    interface Greeting
    {
        void greet();
    }
    public static void main(String[] args )
    {
        Greeting GreetingInstance=new Greeting()
        {
            public void greet()
            {
                System.out.println("Hello,world!");
            }
        };
        GreetingInstance.greet();
    }
}