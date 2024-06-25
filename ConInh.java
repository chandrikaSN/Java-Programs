class Base
{
    Base()
    {
        System.out.println("base class constructor called");
    }
}
class Derived extends Base
{
   Derived()
   {
    System.out.println("derived  class Constructor called");
   }
}
class ConInh
{
    public static void main(String[] args)
    {
        Derived d =new Derived(); 
    }
}