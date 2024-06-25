class Animal
{
    void eat()
    {
        System.out.println("this animal eats food");

    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("the gog barks");
    }
}
class Cat extends Animal
{
    void meow()
    {
        System.out.println("the cat mewos");
    }
}
public class HierarchicalInheritanceExample
{
    public static void main(String[] args)
    {
        Dog dog=new Dog();
        dog.eat();
        dog.bark();
         
        Cat cat=new Cat();
        cat.eat();
        cat.meow();
    }
}