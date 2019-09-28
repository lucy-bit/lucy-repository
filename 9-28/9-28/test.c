#define _CRT_SECURE_NO_WARNINGS 1


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
10. javac - encoding UTF - 8(可小写)文件名.java



Windows(GBK进行编码)
Linux(UTF8进行编码)
编码 解码 需要一一对应

如果在代码里面添加了中文的东西，在编译的时候用这个：
javac - encoding UTF - 8(大小写都行)Test.java    来指定它的编码形式是UTF - 8


ascii码表有255个值，常用前128个
Unicode码表更大，包含ascii码表
一个汉字两个字节

只有char是无符号的，其他都是有符号的类型
Java中char占2个字节(可以打印汉字)，没有负数，只表示字符 范围是0 - 65535
Java中没有ascii码表的概念
都是有符号的，没有无符号的

byte->字节类型 对标的是c语言里的char类型
范围是 - 128 ——127，如果数字超出这个范围，不能编译，会报错（安全性）
Byte.MAX_VALUE

短整型short：
//2个字节  16位  15 （-2^15 到 2^15-1)

****************************************************************************
Java当中的内置类型（基本类型）（8种）（面试题）
int 4
long 8
double 8
float 4
char 2
byte 1
short 2
boolean   Java规范中没有规定明确的大小(c语言里没有，c++里有）
注意：String不是基本类型，而是引用类型
c语言：非0为真  0为假
Java中boolean表示真和假
boolean bool = true / false(只能定义为这样)

*****************************************************************************
String 引用类型
String str = "\"Java 20"\";
\转义字符
字符串拼接：直接用 +

int a = 10;
("a = " + a)   输出a = 10               只要 输出中有字符串，就可以满足追加
String str1 =

块注释中不能嵌套块注释

c中用const char a = 10定义常量
Java中用final定义常量  final int a = 10   它的值不能被修改。我们可以在定义的时候不给初始值，但是当后面一旦赋予新的值后，就不能进行二次赋值了
被final所修饰的变量成为变量。只能赋值一次不能进行二次赋值

final int a;
a = 10;//阔以





在Java中，大类型给小类型必须强制类型转换
小的给大的，隐式的转换
int a = 10;
double b = 20.0;
a = (int)b;//强转
b = a;//隐形转换


char boolean 不是数字类型
boolean类型不可以和其他类型之间转换
int a = 10;
boolean = true;
a = b;
b = a;//都不行


算术转换：当大类型和小类型，会提升为较大的类型进行运算
int a = 10;
double b = 99l;
int c = (int)(a + b);//但最好都变成double


1. 不同类型的数据混合运算, 范围小的会提升成范围大的.
2. 对于 short, byte 这种比 4 个字节小的类型, 会先提升成 4 个字节的 int, 再运算.
byte a = 10;
byte b = 20;
byte c = (byte)(a + b);



虽然short和char都是两个字节，但是因为范围不同，所以不能转换
short s = 10;
char c = s;//会报错

char c2 = 9;
short s2 = (short)c2;//阔以



不可互相转化，除非强转












