
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }  
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

public class Find_Animal {
  public static void main(String[] args) {
    Animal obj1 = new Animal();

    obj1.animalSound();

    Pig obj2 = new Pig();
    obj2.animalSound();
    Dog obj3 = new Dog();
    obj3.animalSound();
  }
}
