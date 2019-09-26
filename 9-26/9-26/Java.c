#define _CRT_SECURE_NO_WARNINGS 1\

JDK->Java Development Kit Java开发工具包
JRE->Java runtime Environment Java运行环境
JVM->Java Viture machine Java虚拟机
（了解各自作用，京东面试曾经考过）
它们三者的关系：

windows + r 键  打开cmd命令窗
windows + e 键 打开文件资源管理器窗口

dir显示文件夹下的内容

javac Test.java(文件名)->进行编译生成.class文件（二进制字节码文件）
java Test(文件名)->运行

Java的两个特性：
一次编译，到处运行 。因为所有的Java程序最后都是跑到JVM上，JVM内切到JDK上，所以只要操作系统上安装了JDK都可以运行
跨平台




冯诺依曼体系
由五部分组成：输入设备，输出设备，运算器，控制器，内存储器
输入设备：键盘等
输出设备：屏幕等
运算器：执行运算
控制器：处理逻辑
内存储器：

外存储器：磁盘(E盘，F盘，D盘这些) ，U盘，光盘

输入一个“hello world” 会从输入设备经过 内存储器 进入 输出设备 再显示出来
I / O输入输出设备

如果一个变量未初始化，编译也不能通过，c语言中可以编译，里面放的是随机值
*************************************************************************************************************
//行注释
/*

*/块注释
1. public->公共的
2. class->定义类。结构体的高配版本。、
后边跟的是类名。
在一个.java文件里面，只能有一个public修饰的类
类名一定要和文件名一样
3. class{ 类体（属性 方法） }
4. main函数->又叫main方法
5. public static  （面试问题：为什么main方法被static所修饰？）
6. static： 静态的。 Java当中static的作用非常多
7. String[] args : 定义数组->字符串数组
c : int arr[10];       Java: int[] arr = ...
	c语言中没有字符串类型，Java中的字符串类型是String
	8. main函数的参数意义是什么？
	9.System.out.println("Hello Java20!");
("Hello Java20!")  ： 字符串(Java中的字符串没有\0）
	System.out.println->相当于c中的printf();
println(10)：输出 并 换行
print(10) : 只输出
printf("%d\n", 10)
10. javac - encoding UTF - 8 文件名.java



Windows(GBK进行编码)
Linux(UTF8进行编码)
编码 解码 需要一一对应

如果在代码里面添加了中文的东西，在编译的时候用这个：
javac - encoding UTF - 8 Test.java    来指定它的编码形式是UTF - 8









