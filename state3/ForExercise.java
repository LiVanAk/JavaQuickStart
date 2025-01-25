public class ForExercise {
    public static void main(String[] args) {
        int count = 0;
        // 为了适应变化，可以将循环的起始值和结束使用变量存储
        int start = 1, end = 100;
        for (int i = start; i <= end; ++i){
            if (i % 9 == 0) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("count:" + count);
        int n = 10;
        for (int i = 0; i <= n; ++i){
            int j = n-i;
            System.out.println(i + "+" + j + "=" + n);
        }
    }
}
