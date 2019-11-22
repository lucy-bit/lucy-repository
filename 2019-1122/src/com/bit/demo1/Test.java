package com.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -22
 * Time: 16:34
 */
class Address {
    private String house;
    private int floor;

    public Address(String house,int floor) {
        this.floor = floor;
        this.house = house;
    }
}
class Student {
    public String name;
    public Address address;

    public Student(String name,Address address) {
        this.name = name;
        this.address = address;

    }
}
public class Test {
    public static void main(String[] args) {
       /* Cat cat = new Cat("杜甫","灰白");
        Animal animal = cat;//向上转型*/
       Animal animal = new Cat("杜甫","灰白");
       animal.eat();
       /* Bird bird = (Bird)animal;
        bird.fly();*/
       if(animal instanceof Bird) {
           //Bird必须是animal的一个实例才能完成向下转型
           Bird bird = (Bird)animal;
           bird.fly();
       }

       //
    }
    public static void main2(String[] args) {
        Address address = new Address("长思一",2);
        Student student = new Student("鬼鬼",address);
        System.out.println(student);
    }
    public static void main1(String[] args) {
        Cat cat = new Cat("杜甫","灰白");
        Bird bird = new Bird("大王","白色");

      /*  cat.eat();
        Bird bird = new Bird("大王","白色");
        bird.fly();
        bird.eat();*/
    }
}
