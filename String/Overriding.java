// class Animal {
//     public void makeSound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     @Override
//     public void makeSound() {
//         System.out.println("Dog barks");
//     }
// }

// class Cat extends Animal {
//     @Override
//     public void makeSound() {
//         System.out.println("Cat meows");
//     }
// }

// public class Overriding {
//     public static void main(String[] args) {
//         Animal animal = new Animal();
//         animal.makeSound(); 
        
//         Dog dog = new Dog();
//         dog.makeSound(); 
        
//         Cat cat = new Cat();
//         cat.makeSound(); 
//     }
// }






class Human
{
         public void gender()
         {
             System.out.println("I donto have  gender");
         }
}

class Man extends Human
{       @Override

         public void gender()
         {
             System.out.println("I am a man");
         }
}

public class Overriding {
    public static void main(String[] args) {
        Human human = new Human();
        human.gender();

        Man boy = new Man();
        boy.gender();
         
    }
}