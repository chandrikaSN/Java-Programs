class Animal
{
    void eat()
    {
        System.out.println("this animal eats ");

    }
}
class Mammal extends Animal
{
    void walk()
    {
        System.out.println("the mammal walks");
    }
}
class Bird extends Animal
{
    void layEggs()
    {
        System.out.println("this bird lays eggs");
    }
}
class Bat extends Mammal implements Flyable 
{
   public void fly()
   {
    System.out.println("this bat flies");
   }
}
public class HybridInheritanceExample
{
    public static void main(String[] args)
    {
        Bat bat=new Bat();
        bat.eat();
        bat.walk();
        bat.fly();
    }
}
