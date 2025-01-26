public class OverloadPrac {
    public static void main(String[] args) {
        // 方法的重载：减轻起名和记名的麻烦，即允许同功能的函数重复使用，以对应不同种类的参数
        // 允许同一个类中存在多个同名的方法，但要求形参列表不同
        // 方法名-必须相同  形参列表-必须不同（类型或个数或顺序有一样不同即可）  返回类型：无要求
        // 若相同但形参的变量名不同：无法构成重载，只是方法的重复定义
        Calculator MyCalc = new Calculator();
        System.out.println(MyCalc.calc(1, 2));
        System.out.println(MyCalc.calc(1, 1.5));
        System.out.println(MyCalc.calc(2.5, 2));
        System.out.println(MyCalc.calc(1, 2, 3));
    }
}

class Calculator {
    public int calc(int num1, int num2) {
        return num1 + num2;
    }
    public double calc(int num1, double num2) {
        return num1 + num2;
    }
    public double calc(double num1, int num2) {
        return num1 + num2;
    }
    public int calc(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}