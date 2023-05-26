class Human {
    private int age;

    // This keyword is used to assign value to global-
    // parameter, when arguement/local para and global -
    // same name;
    // In the example below age is local para and age is -
    // is also global variable;
    // If you do not use this keyword, like this -
    // age = age, then local value will assign to local -
    // It will not change the value of global variable age;
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class thisKey {
    public static void main(String args[]) {
        Human h1 = new Human();
        h1.setAge(5);
        int age = h1.getAge();
        System.out.println(age);
    }
}
