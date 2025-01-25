public class Arithmatic {
    public static void main(String[] args) {
        // a % b = a - a / b * b;
        int num = 10%(-3);
        System.out.println(num);

        int i = 10;
        ++i;
        System.out.println("i=" + i);
        i = i++;    // (1) temp = i (2) i = i + 1 (3) i = temp
        // i = ++i;    // (1) i = i + 1 (2) i = temp (3) i = temp
        System.out.println("i=" + i);
    }
}
