/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -09 -18
 * Time: 18:51
 */
class Money {
    public double money;
}
class Person implements Cloneable{
    public int age;

    Money m = new Money();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class TestDemo2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person)person1.clone();
        person2.age = 99;
        System.out.println(person1.age);
        System.out.println(person2.age);
        System.out.println("+++++++++++++++++++++");
        person2.m.money = 22.2;
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
    }

}

