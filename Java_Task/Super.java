 class Person {
String name;

Person(String name){
    this.name = name;
     System.out.println(name);
    
}
    
}
class Employee extends Person{
Employee(String name){
    super(name);
}
}

public class Super {
    public static void main(String[] args) {
        Employee e1 = new Employee("Krishna");
      
      
    }
}
