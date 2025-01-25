
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = check.nextInt();
        if(age >= 18) {
            System.out.println("已成年");
        } else {
            System.out.println("未成年");
        }

        
    }
}
