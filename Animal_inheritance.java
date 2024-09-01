public class Animal_inheritance {
public void  eat(){
    System.out.println("She/He eat.");
}
public void Sleep(){
    System.out.println("She/He Sleep.");
}
}
 class Cat extends Animal_inheritance{
    public void meow(){
        System.out.println("She do meow.");
    }    
 }
 class Dog extends Animal_inheritance{
    public void bark(){
        System.out.println("He Bark.");
    }
    }

    class Kitten extends Cat
    {
        public void cry()
        {
            System.out.println("Kitten is crying");
        }
    }

    class Babydog extends Dog
    {
      public void colour()
      {
        System.out.println("Colour is brown");
      }
    }
    

 class Driver{
public static void main(String[] args) {
    Cat c=new Cat();
    c.meow();
    Dog d=new Dog();
    d.bark();
    d.eat();
    Kitten k=new Kitten();
    k.cry();
    k.meow();
    Babydog b=new Babydog();
    b.colour();
    b.bark();
}
 }