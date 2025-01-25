
public class Object01 {
    public static void main(String[] args) {
        // 单独变量 => 不利于数据管理(信息拆解)
        // 数组存储 => 1.无法存储数据类型  2.难以对应变量名与内容
        // 即不利于数据管理，效率低下
        // 类与对象：
        //      引入的根本原因：现有技术无法完美解决新的需求
        // 对象[属性, 行为]
        // 类：自定义数据类型
        // 对象：类的具体实现
        // 同义表达：
        //      创建一个对象
        //      实例化一个对象
        //      把类实例化
        Cat cat1 = new Cat();
        cat1.name = "Steve";
        cat1.age = 10;
        cat1.color = "white";
        System.out.println("Name:" + cat1.name + " age:" + cat1.age + " color:" + cat1.color);
        // 总结
        // 1.类是抽象的，概念的，代表一类事物，是一种数据类型
        // 2.对象是具体的，实际的，代表一个具体事物，是实例
        // 3.类是对象的模板，对象是类的具体实现个体，对应一个实例
        // 方法区：加载类的方法
        // 成员变量 = 属性 = 字段(field)

    }    
}

// 定义一个类
class Cat {
    String name;
    int age;
    String color;
}
