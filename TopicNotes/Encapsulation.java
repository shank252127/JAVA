class Human {
    int age;
    String name;
    // Making Private means we cannot use it outside the class;
    // It will give error when directly;
    private int money = 123;

    // GET;
    // we can access the private variable through method -
    // available in the same class;
    public int getMoney() {
        System.out.println("I am in Get Method");
        return money;
    }

    // SET;
    // Will set the value of private variable indirectly;
    public void setMoney(int money) {
        System.out.println("I am in Set Method");
        // When both name are same, we need to avoid assigning value to itself;
        // In this case we need to identify the instance variable with this.money;
        this.money = money;
    }
}

public class Encapsulation {
    public static void main(String args[]) {
        System.out.println("I am in Main Class");
        Human h1 = new Human();
        // Getting value;
        int val = h1.getMoney();
        System.out.println(val);
        // Setting value;
        h1.setMoney(456);
        // Getting the new value;
        val = h1.getMoney();
        System.out.println(val);

    }
}
