class Animal {
    String name;
    int age;

    void makeSound() {
        System.out.println("Animal Make Sound");
    }
}

class Dog extends Animal {
    String breed;

    @Override
    void makeSound() {
        System.out.println("Dog Barks");

    }

    void fetch() {
        System.out.println("Dog is fetching");
    }
}

class Cat extends Animal {
    String colour;

    void makeSound() {
        System.out.println("Cat Meows");
    }

    void climb() {
        System.out.println("Cat is Climbing");
    }
}

public class Task_Animal {
    public static void main(String[] args) {

        Dog obj1 = new Dog();
        obj1.name = "American Eskimo";
        obj1.age = 10;
        obj1.breed = "Golden";
        obj1.makeSound();
        obj1.fetch();

        Cat obj2 = new Cat();
        obj2.name = "Pinky";
        obj2.age = 5;
        obj2.colour = "Brown";
        obj2.makeSound();
        obj2.climb();

    }
}
