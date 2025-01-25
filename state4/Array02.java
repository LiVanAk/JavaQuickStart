import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        // int array[] or int[] array
        // 1. int[] array = new int[5]
        int[] nums = new int[5];
        Scanner numScanner = new Scanner(System.in);
        System.out.println("请输入数字");
        for (int i = 0; i != nums.length; ++i){
            nums[i] = numScanner.nextInt();
        }
        for (int i = 0; i != nums.length; ++i){
            System.out.println("第" + (i+1) + "个数字：" + nums[i]);
        }
    }
}
