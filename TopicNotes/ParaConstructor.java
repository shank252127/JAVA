class Human {
    int age;

    // Constructor;
    // Default Constructor;
    public Human() {
        age = 10;
    }

    // We can have same name constructor with different -
    // Parameters;
    // Parameterised Constructor;
    public Human(int age) {
        this.age = age;
    }

    public int getMoney() {
        return age;
    }
}

public class ParaConstructor {
    public static void main(String args[]) {
        Human h1 = new Human();
        Human h2 = new Human(15);
        int age1 = h1.getMoney();
        int age2 = h2.getMoney();
        System.out.println(age1);
        System.out.println(age2);
    }
}
