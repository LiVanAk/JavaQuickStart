package encapsulation.extend;

// Father
public class Student {
    // 继承以提高代码复用性
    public String name;
    public int age;
    private double score;
    Student() {}
    Student(String name) {
        this.name = name;
        System.out.println("SuperClass Student");
    }
    public void setScore(double score) {
        this.score = score;
    }
    public void showInfo() {
        System.out.println("Name:" + name + " Age:" + age + " Score:" + score);
    }

}
