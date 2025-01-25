public class WhilePrac {
    public static void main(String[] args) {
        int i = 0;
        // 1.循环条件是返回一个布尔值的表达式
        // 2.while循环是先判断再执行语句
        while (i <= 10) {
            System.out.println("i=" + i);
            i++;
        }
        System.out.println("while break...");
        do { 
            System.out.println("i=" + i);
            i++;
        } while (i <= 20);
        System.out.println("do while break....");
    }
}
