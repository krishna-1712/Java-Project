
public class Task_this {
  int modelYear;
  String modelName;

  public Task_this(String modelName) {

    this(2005, modelName);
  }

  public Task_this(int modelYear, String modelName) {

    this.modelYear = modelYear;
    this.modelName = modelName;
  }

  public void printInfo() {
    System.out.println(modelYear + " " + modelName);
  }

  
    public static void main(String[] args) {

      Task_this car1 = new Task_this("Corvette");

      Task_this car2 = new Task_this(1969, "Mustang");

      car1.printInfo();
      car2.printInfo();
    }
  }

