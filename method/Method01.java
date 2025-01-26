
public class Method01 {
    public static void main(String[] args) {
        Cat wang = new Cat();
        wang.name = "Wang";
        wang.age = 5;
        wang.echo();
    }
}

class Cat {
    String name;
    int age;
    public void echo() {
        System.out.println("I'm " + name + ".");
        System.out.println("My age is " + age + ".");
    }
}