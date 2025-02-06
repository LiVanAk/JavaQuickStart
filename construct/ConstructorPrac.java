
public class ConstructorPrac {
    public static void main(String[] args) {
        Person p1 = new Person("Steve", 22);
        System.out.println("Name: " + p1.name + " Age: " + p1.age);
        Person p2 = new Person();
        System.out.println("Name: " + p2.name + " Age: " + p2.age);

    }
}

class Person {
    // 构造方法又称构造器，是类的一种特殊的方法，它的主要作用是完成对新对象的初始化
    // 1. 方法名与类名相同
    // 2. 没有返回值
    // 3. 在创建对象时，系统会自动调用该类的构造器完成对象的初始化
    String name;
    int age;

    // 注意事项：
    // 1. 一个类可以定义多个构造器，即构造器的重载
    // 2. 构造器名与类名要相同
    // 3. 构造器没有返回值
    // 4. 构造器是完成对象的初始化，并不是创建对象
    // 5. 在创建对象时，系统自动调用该类的构造方法
    // 6. 如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器（也叫默认无参构造方法）
    // 7. 一旦定义新的构造器，默认的构造器就会被覆盖，不能再使用默认的无参构造器，除非显式定义之后才可使用

    // Constructor
    public Person() {
        name = "Init";
        age = 18;
    }
    public Person(String pName, int pAge) {
        name = pName;
        age = pAge;
    }
    
    // 流程分析
    // 1. 在方法区中加载Person类信息，只会加载一次
    // 2. 在堆中分配空间(地址)
    // 3. 完成对象初始化 [1.默认初始化  2.显式初始化  3.构造器初始化]
    // 4. 将对象在堆中的地址返回给p
}