import java.util.Stack;
import java.util.Scanner;

public class StackCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Double> stack = new Stack<>();
        
        System.out.println("栈计算器使用说明:");
        System.out.println("1. 输入数字将数字压入栈中");
        System.out.println("2. 输入 +,-,*,/ 进行运算");
        System.out.println("3. 输入 c 清空栈");
        System.out.println("4. 输入 q 退出程序");
        
        while (true) {
            System.out.print("请输入 (当前栈顶: " + (stack.isEmpty() ? "空" : stack.peek()) + "): ");
            String input = scanner.nextLine().trim();
            
            if (input.equals("q")) {
                break;
            }
            
            if (input.equals("c")) {
                stack.clear();
                System.out.println("栈已清空");
                continue;
            }
            
            try {
                // 尝试将输入解析为数字
                double number = Double.parseDouble(input);
                stack.push(number);
            } catch (NumberFormatException e) {
                // 如果不是数字，则判断是否为运算符
                if (input.matches("[+\\-*/]")) {
                    if (stack.size() < 2) {
                        System.out.println("错误：栈中元素不足，无法进行运算");
                        continue;
                    }
                    
                    double num2 = stack.pop();
                    double num1 = stack.pop();
                    double result = 0;
                    
                    switch (input) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num2 == 0) {
                                System.out.println("错误：除数不能为0");
                                stack.push(num1);
                                stack.push(num2);
                                continue;
                            }
                            result = num1 / num2;
                            break;
                    }
                    
                    stack.push(result);
                    System.out.println("计算结果: " + result);
                } else {
                    System.out.println("无效输入！请输入数字或运算符(+,-,*,/)");
                }
            }
        }
        
        scanner.close();
        System.out.println("程序已退出");
    }
}