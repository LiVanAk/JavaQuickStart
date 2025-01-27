public class Constructor01 {
    public static void main(String[] args) {
        Person Lee = new Person("Lee", 22);
        System.out.println("Name:" + Lee.name + " Age:" + Lee.age);
        System.out.println("Lee Hash:" + Lee.hashCode());
        
    }
}

class Person {
    String name;
    int age;
    // 使用this，在构造器中使用属性，从而解决变量的作用域问题
    // this表示当前对象
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
        System.out.println("This Hash:" + this.hashCode());
    }
    // this关键字的理解
    // this是一种引用，指向对象本身
    // 哪个对象调用，就是指向哪个对象
}