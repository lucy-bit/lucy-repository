/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -25
 * Time: 18:58
 */

/*
1、implenment Cloneable
2、重写Object clone()
3、如果当前类包含了引用类型
    Person -> Money
    在Person的clone方法内，不仅要克隆自己本身
    还需要克隆Money
    */

class Money implements Cloneable{
   double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{

    public String name;
//
    public Money m;
    //构造Money
    public Person() {
        this.m = new Money();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person per = (Person)super.clone();
        per.m = (Money)this.m.clone();
        return per;
        //Person默认继承Object父类
        //因为Object是所有类的父类，向上转型，所以任何类型都可以接收

    }
}
public class TestDemo3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Person person2 = (Person)person.clone();
        System.out.println(person.m.money);
        System.out.println(person2.m.money);
        System.out.println("********************");
        person2.m.money = 99.0;
        System.out.println(person.m.money);
        System.out.println(person2.m.money);
    }
    public static void main1(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.name = "caocao";

        //声明异常
        Person person2 = (Person)person.clone();

      /*  //进行捕获异常
        try {
            Person person2 = (Person)person.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }*/
        System.out.println(person2.name);
    }
}
