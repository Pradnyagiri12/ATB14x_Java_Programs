class Person {
    String name;
    int age;
}

public class Person {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Alice";
        p1.age = 25;

        Person p2 = new Person();
        p2.name = "Bob";
        p2.age = 30;

        System.out.println(p1.name + " - " + p1.age);
        System.out.println(p2.name + " - " + p2.age);
    }
}
