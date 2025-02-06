package encapsulation;

public class Encap {
    public static void main(String args[]) {
        // 封装 就是把抽象出的数据[属性]和对数据的操作[方法]封装在一起，数据被保护在内部
        // 程序的其他部分只有通过被授权的操作[方法]，才能对数据[属性]进行操作
        // 封装的好处
        // - 隐藏实现细节
        // - 可以对数据进行验证，保证安全合理

        // 封装的实现步骤
        // 1. 对属性私有化 => 不能直接修改属性
        // 2. 提供一个public的set方法，用于对属性判断并赋值
        // 3. 提供一个public的get方法，用于获取属性的值
        Person Lee = new Person("Lee");
        System.out.println(Lee.name + Lee.getAge());
        Lee.setAge(0);
        Lee.setAge(22);
        System.out.println(Lee.name + Lee.getAge());

    }
}

class Person {
    public String name;
    private int age;
    private double salary;
    private String job;

    Person() {}

    Person(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        if (age > 0 && age <= 120) {
            this.age = age;
            System.out.println("Age set sucessfully...");
        }
        else {
            System.out.println("Invalid input...");
        }
    }

    public int getAge() {
        return this.age;
    }
}