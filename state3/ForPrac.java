public class ForPrac {
    public static void main(String[] args) {
        // 1.循环条件是一个返回布尔值的表达式
        // 2.初始化和变量迭代可以写在其他地方，但分号不可省略
        // 3.没有循环条件时可以执行死循环，但程序块应当有跳出的条件
        // 4.循环初始值和变量迭代都可以写多个，但初始化语句应同类型，中间用逗号隔开
        for (int i = 0; i != 10; ++i) {
            System.out.println("执行第" + i +"次");
        }

    }
}
