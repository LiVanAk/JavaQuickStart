public class FloatNum {
    public static void main(String[] args) {
        float num1 = 1.234f;
        double num2 = 2.456;
        double num3 = num1;
        double num4 = .123;
        double num5 = 1.234f;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);

        double num6 = 2.7;
        double num7 = 8.1/3;
        System.out.println(num6);       // abs(num6-num7) < 1e-6
        System.out.println(num7);       // check the differ
    }
}
