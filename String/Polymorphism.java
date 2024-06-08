class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();
        
        for (Animal animal : animals) {
            animal.makeSound(); 
        }
    }
}
