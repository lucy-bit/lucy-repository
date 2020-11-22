/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -11 -16
 * Time: 19:50
 */
class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    class Student {
        public String name;
        public int height;

        public Student(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }
}

//实例内部类
class OuterClass {
    class InterClass {
        public int age;
        public String name;
    }
}
//静态内部类
class OuterClass2 {
    static class InterClass2 {
        public int age;
        static int weight;
    }
}

class OuterClass3 {
    public void func() {
        System.out.println("hhhhhhhhhhhhhhh");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        //匿名内部类
        new OuterClass3() {

        }.func();
    }

    public static void main3(String[] args) {
        //实例内部类
        OuterClass outerClass = new OuterClass();
        OuterClass.InterClass interClass = outerClass.new InterClass();
        //静态内部类
        OuterClass2.InterClass2 interClass2 = new OuterClass2.InterClass2();

    }
    public static void main2(String[] args) {
        Person person = new Person("huahua",20);
        Person.Student student = person.new Student("xiaogui",21);
        OuterClass2.InterClass2 interClass2 = new OuterClass2.InterClass2();

    }
}

