
public class Object02 {
    public static void main(String[] args) {
        // 访问修饰符：控制属性的访问范围
        //      public  protected  default  private
        // 创建对象具有默认值，遵循数组规则
        // int 0  short 0  byte 0  long 0  folat 0.0  double 0.0 
        // char \u0000  boolean false  String null
        Person Lee = new Person();
        System.out.println("Name:" + Lee.name + " age:" + Lee.age + " weight:" + Lee.weight 
        + " letter:" + Lee.letter + " isPass:" + Lee.isPass);
        Lee.name = "Novice";
        Lee.age = 22;
        Lee.isPass = true;
        Lee.letter = 'L';
        Lee.weight = 75.6;
        // 对象可以先声明再创建，也可以直接创建
        Person p1;
        p1 = new Person();
        Person p2 = new Person();
        System.out.println("Name:" + p2.name + " age:" + p2.age + " weight:" + p2.weight 
        + " letter:" + p2.letter + " isPass:" + p2.isPass);
        p2 = Lee;
        System.out.println("Name:" + p2.name + " age:" + p2.age + " weight:" + p2.weight 
        + " letter:" + p2.letter + " isPass:" + p2.isPass);
        // 创建流程
        //  加载类信息（属性和方法，只会加载一次
        //  在堆中分配空间，进行默认初始化
        //  将对象地址赋值给对象名，使得对象名指向新创建对象的地址
        //  进行指定初始化
    }
    
}

class Person {
    int age;
    double weight;
    String name;
    char letter;
    boolean isPass;
}