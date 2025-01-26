
public class ScopePrac {
    public static void main(String[] args) {
        // 1. 局部变量一般是指成员方法中定义的变量，作用域仅在方法中->定义它的代码块中
        // 2. 全局变量也就是属性，作用域为整个类体
        // 3. 全局变量可以不赋值，初始化时为默认值
        // 4. 局部变量必须赋值，因为定义局部变量时不会初始化
        // 5. 全局变量/属性：可以被本类使用，或其他类使用（通过对象调用）
        // 6. 属性可以加修饰符(public, protected, private)
        // 7. 局部变量不可以加修饰符
        Test myTest = new Test();
        System.out.println(myTest.num1);
        myTest.cry();
        Person myPerson = new Person();
        myPerson.port(myTest);
    }
}

class Test {
    int num1;
    public void cry() {
        int num2 = 0;
        System.out.println(num2);
    }
}

class Person {
    public void port(Test T) {
        System.out.println(T.num1);
    }
}