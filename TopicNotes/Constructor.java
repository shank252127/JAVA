class Human {
    int age;
    String name;
    private int money;

    // Constructor;
    // Use to set value or excute some function or task-
    // at the time of the object instanciation;
    // Doesn't have any return type;
    public Human() {
        money = 10;
        System.out.println("I am in Constructor");
    }

    public int getMoney() {
        System.out.println("I am in Getter");
        return money;
    }
}

public class Constructor {
    public static void main(String args[]) {
        System.out.println("I am in Main Class");
        Human h1 = new Human();
        // Getting value;
        int money = h1.getMoney();
        System.out.println(money);
    }
}
// Flow direction : Main Class --> Constructor --> Getter;
