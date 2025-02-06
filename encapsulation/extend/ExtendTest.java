package encapsulation.extend;

/*
 * 1. 子类继承了所有的属性和方法，但私有属性和方法不可以在子类直接访问，要通过公共的方法访问
 * 2. 子类必须调用父类的构造器才可以完成父类的初始化
 * 3. 当创建子类对象时，默认情况下总会条用父类的无参构造器，如果父类没有提供无参构造器，则必须在
 *    子类的构造器中使用super去指定使用父类的哪个构造器来完成对父类的初始化工作，否则编译不会通过
 * 
 */

public class ExtendTest {
    public static void main(String[] args) {
        Graduate lee = new Graduate();
        Pupil novi = new Pupil();
        lee.name = "Lee";
        lee.age = 22;
        // lee.score = 1;   The field Student.score is not visibleJava(33554503)
        novi.name = "Novi";
        novi.age = 6;
        lee.showInfo();
        novi.showInfo();

        lee.testing();
        lee.setScore(99);
        novi.testing();
        novi.setScore(60);

        lee.showInfo();
        novi.showInfo();
    }
}
