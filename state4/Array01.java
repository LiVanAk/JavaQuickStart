
public class Array01 {
        public static void main(String[] args) {
            double[] hens = {1, 2, 3, 4, 5, 6};
            double sumWeight = 0;
            // 得到数组长度：hens.length
            for (int i = 0; i != 6; ++i){
                sumWeight += hens[i];
                System.out.println("第" + (i+1) + "只:" + hens[i]);
            }
            System.out.println("平均重量为：" + sumWeight/6);
        }
}
