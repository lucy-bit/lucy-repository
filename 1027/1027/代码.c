#define _CRT_SECURE_NO_WARNINGS 1
类和对象
1、OOP语言——面向对象编程的语言

OOP语言的三大特征：继承、封装、多态(不是Java语言的特征)

面向过程：c——处理问题规模小的数据

面向对象：Java、c++，注意go语言不是——处理问题规模大的问题
找对象，创建对象，使用对象

图解：

类：模板
对象：由类产生的实体
new——实例化一个对象
一个类可以实例化多个对象

实例化一个对象之后，如何访问对象的数据成员？//通过点号
Person per = new Person();  //在定义Person类后
per.数据成员
per.方法

定义方式如下：
class 类名 {
	属性：定义在类的内部，在方法上的外部
	类体         行为：方法
}
类中的元素称为：成员属性。类中的函数称为：成员方法




静态的数据成员和方法只需要通过类名进行访问或者调用
静态的数据成员和方法不依赖于对象（调用静态的数据成员和方法时不需要new对象）；
实例数据成员和方法需要通过对象进行访问或者调用
实例数据成员和方法的调用的前提是要先产生对象
eg：
Person person1 = new Person();
System.out.println(person1.name);//对象
System.out.println(Person.count);//类名


如果类当中的数据成员（实例 / 静态）没有初始话的时候默认值为对应的0值
如果是引用类型：null
如果是简单类型：为对应的0值
char：\u0000          boolean：false


解释：一般上午局部变量放在栈上，new出来的Person对象放在堆上，实例数据成员属于对象，静态数据成员

person1 叫做 Person的引用

一个属性存放的区域在哪和是否被final修饰无关，与是否被static修饰有关



被static所修饰的放在方法区，且只有一份



对于这个代码，若count不被static所修饰，则两次打印的值一样，若被static所修饰，则第二次比第一次打印的多1


在静态方法内部，不允许访问实例数据成员，不允许调用实例成员方法。因为他不依赖对象
如果一定要在静态内部用实例的话，参数传一个类的引用进去就行 eg：

public static void fun1(Person person) {
	System.out.println("name:" + person.name);//name必须创建对象之后才能用
}
...
public static void main(String[] args) {
	Person person1 = new Person();
	Person.fun1(person1);
}


所以每次我们在main方法外再定义新的方法时都要加static，因为main()方法本身就是static所修饰的，在其内部不能调用实例成员方法

main方法为啥必须是静态的？

答：如果main方法不是静态的，他就不能运行了（下面用反证法的思想来思考这个问题）
如果不是静态的，要调用main方法必须先定义testDemo对象，再通过testDemo.main()调用mian方法
//理想是这样 调用main函数的：
public void main(String[] args) {
	TestDemo testDemo = new TestDemo();
	testDemo.main(args:"");
}
//问题是，要生成对象testDemo的前提是要先进入main函数，可是要进入main函数必须先定义
//testDemo对象，这样就尬住陷入逻辑死循环当中了


Java自己在底层实现时，不需要生成里面的对象，直接去调用main函数
所以，我们再写main函数时用static去修饰它，JVM会自动调用mian函数的

在静态方法内不能调用静态方法，是因为静态方法不依赖对象

一个类生成一个.class文件，如果一个java文件中有多个类，则生成多个.class文件

封装：
public      private   访问修饰限定符
体现封装性：private 被private所修饰的属性或者方法 均不能在类外进行访问或者调用

this关键字：
有一个误区：this是当前对象（大错特错）
this是当前对象的引用
静态方法内部，不能使用this（因为静态方法里面没有对象）

在 IDEA 中可以使用 alt + insert(或者 alt + F12) （Fn + ESC都打开的情况下）    快速生成 setter / getter 方法.在 VSCode 中可以使用鼠标右键 菜单->源代码操作 中自动生成 setter / getter 方法


给数据成员初始化的方式：
1、提供一系列的get set方法
2、提供构造函数（作用——用来产生对象
方法名和类名相同   没有返回值
