/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -10 -29
 * Time: 21:11
 */

/*
class Person {
    //使用封装定义属性
    private String name;
    private int age;

    //定义行为
    public static int count = 20;
    public final int SIZE = 10;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
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

    private void eat(){
        System.out.println("吃饭");
    }
    public void sleep() {
        this.eat();
        System.out.println("睡觉");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void func1() {
        //System.out.println("name : " + this.name);error
        count = 999;
        System.out.println("static.func1()");
    }
}

public class TestDemo {

    public static void func(Person person) {
        System.out.println(person.getName());
        person.sleep();
    }

    public static int[] func2(int[] array) {
        int[] ret = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i]*2;
        }
        return array;
    }

    public static void main(String[] args) {

    }


    public static void main6(String[] args) {
        Person person1 = new Person();
        System.out.println("=============");
        Person person2 = new Person();
        System.out.println("=============");
        Person person3 = new Person();
    }

    public static void main5(String[] args) {
        Person person1 = new Person();
        System.out.println(person1);
        /*System.out.println(person1.getName());//
        System.out.println(person1.getAge());//
        System.out.println(Person.count);*/
    }


public static void main4(String[] args) {
        Person person1 = new Person();
        System.out.println("===============");
        Person person2 = new Person("caocao");
        System.out.println("===============");
        Person person3 = new Person("caocao",99);
        }


public static void main3(String[] args) {
        Person person = new Person();
        person.setName("caocao");
        person.setAge(88);
        System.out.println(person.getName());//caocao
        System.out.println(person.getAge());
        Person person2 = new Person();
        person2.setName("zhangfei");
        person2.setAge(188);
        System.out.println(person2.getName());//zhangfei
        System.out.println(person2.getAge());
        //person.name = "caocao";
        /*person.age = 99;*/

        */


//        1、编写一个类Calculator,有两个属性num1,num2,这两个数据的值，不能在定义的同时初始化，最后实现加减乘
//        除四种运算.
class Calculator {

}


public class Testdemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.SIZE);
        System.out.println(Person.count);
    }
}
