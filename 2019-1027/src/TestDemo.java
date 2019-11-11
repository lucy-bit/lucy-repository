import java.sql.SQLOutput;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -10 -27
 * Time: 14:50
 */

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        int a = 10;
        System.out.println("吃饭");
    }
    public void sleep() {
        System.out.println("睡觉");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        System.out.println();
    }
}
