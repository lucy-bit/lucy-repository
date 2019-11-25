import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -25
 * Time: 17:24
 */

/*class Student implements Comparable<Student> {
    public String name;
    public int age;
    public double score;

    @Override
    public int compareTo(Student o) {
        //return this.age - o.age;
        return this.name.compareTo(o.name);
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}*/




//<>内的代表需要排序的那个类型
class Student implements Comparable<Student> {
    public String name;
    public int age;
    public double score;


    //提供构造方法，使用快捷键Alt+Insert,选择Constructor,将所有属性选中即可构造
    public Student (String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    //重写toString方法，Alt+Insert 选择toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
    //重写compareTo方法
    @Override
    public int compareTo(Student o) {
        if (this.score > o.score) {
            return -1;
        } else if (this.score < o.score) {
            return 1;
        } else {
            return 0;
        }
    }

        //return this.name.compareTo(o.name);
        //可以直接调用this.name.comparaTo,是因为源代码已经自动实现了comparaTo接口

        //从小到大排序,让当前的age和传进来的age进行比较
        // return this.age - o.age;

        //从大到小排序
        //return o.age - this.age;
    }
}

   /* @Override
    public int compareTo(Student o) {
        return 0;
    }*/


public class TestDemo2 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("caocao",16,99.9);
        students[1] = new Student("zhangfei",26,19.9);
        students[2] = new Student("guanyu",36,29.9);

        Arrays.sort(students);
        //Alt+Enter，不用写java.util.Arrays包
        System.out.println(Arrays.toString(students));
    }
}

/*
Arrays.sort(students);
System.out.println(Arrays.toString(students));

// 运行出错, 抛出异常. Exception in thread "main" java.lang.ClassCastException: Student cannot be cast to java.lang.Comparable
*/
