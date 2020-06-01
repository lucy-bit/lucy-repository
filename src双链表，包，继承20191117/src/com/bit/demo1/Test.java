package com.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-11-17
 * Time: 14:47
 */

/**
 * 组合示例代码：
 *
 */
class Address {
    private String house;
    private int floor;

    public Address(String house,int floor) {
        this.floor = floor;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Address{" +
                "house='" + house + '\'' +
                ", floor=" + floor +
                '}';
    }
}

class Student {
    public String name;
    public Address address;

    public Student(String name,Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
public class Test {
    private static int i=1;
    public int getNext(){
        return i++;
    }
    public static void main(String [] args){
        Test test=new Test();
        Test testObject=new Test();
        test.getNext();//1
        testObject.getNext();//2   3
        System.out.println(testObject.getNext());//3  4
        System.out.println(Test.i);
    }
    public static void main6(String[] args) {
        Animal animal  = new Cat("小花2","红");
        //向下转型的前提条件是：父类已经引用了
        // 子类(向下转型后的类型)的对象
        if(animal instanceof Bird) {
            Bird bird = (Bird)animal;
            bird.fly();
        }
    }

    public static void main5(String[] args) {
        Animal animal  = new Bird("小花2","红");
        animal.eat();
        //向下转型-》不好
        Bird bird = (Bird)animal;
        bird.fly();
    }

    /**
     * 以下为向上转型
     * @param animal
     */

    public static void function(Animal animal) {

    }

    public static Animal  function2() {
        Cat cat = new Cat("小花2","红");
        return cat;
    }

    public static void main4(String[] args) {
        Cat cat = new Cat("小花2","红");
        function(cat);
    }

    public static void main3(String[] args) {
        //Animal animal = new Animal("小花");
        /*Cat cat = new Cat("小花2","红");
        Animal animal = cat;//向上转型*/
        //父类引用  引用子类的对象-》向上转型
        Animal animal  = new Cat("小花2","红");
        //animal.func1();error  父类引用
        // 只能调用父类自己的方法或者访问自己的属性
    }

    public static void main2(String[] args) {
        Address address = new Address("6号楼",3);
        Student student = new Student("caocao",address);
        System.out.println(student);

    }
    public static void main1(String[] args) {
        Cat cat = new Cat("小花","红");
        System.out.println("==============");
        Cat cat2 = new Cat("小花","红");
        System.out.println("=============");
        Bird bird = new Bird("小明","羽毛");
        //cat.eat();
        /*Bird bird = new Bird("小明","羽毛");
        bird.eat();
        bird.fly();*/
    }
}
