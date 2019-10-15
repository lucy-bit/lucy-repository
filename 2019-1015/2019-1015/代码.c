#define _CRT_SECURE_NO_WARNINGS 1
/*
2. 判定一个数字是否是素数
3. 打印 1 - 100 之间所有的素数
4. 输出 1000 - 2000 之间所有的闰年
5. 输出乘法口诀表
6. 求两个正整数的最大公约数
7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
8. 编写程序数一下 1到 100 的所有整数中出现多少个数字9。
9. 求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本
身，如；153＝1＋5＋3?，则153是一个“水仙花数”。)
10. 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输
入，最多输入三次。三次均错，则提示退出程序
11. 写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1
12. 获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列。
13. 输出一个整数的每一位.
14. 完成猜数字游戏 */

import java.util.Scanner;
public class Test {
	//1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上) 
	/*
	public static void main(String[] args) {
	age(12);
	age(24);
	age(33);
	age(60);
	}
	public static void age(int age) {
	if(age < 18) {
	System.out.println("少年");
	}else if(age >= 19 && age <= 28) {
	System.out.println("青年");
	}else if(age >= 29 && age <= 55) {
	System.out.println("中年");
	}else if(age >= 56) {
	System.out.println("老年");
	}
	}
	*/

	//2. 判定一个数字是否是素数 
	/*
	public static void main(String[] args) {
	int ret = if_prime(7);
	if(0 == ret) {
	System.out.println("不是素数");
	}else {
	System.out.println("是素数");
	}
	}

	public static int if_prime(int num) {
	int i = num/2;
	for(int j=2; j<i; j++) {

	if(num%j == 0) {
	return 0;
	}
	}
	return 1;
	}
	*/

	//3. 打印 1 - 100 之间所有的素数 
	/*
	public static void main(String[] args) {
	for(int i=2; i<100; i++) {
	int ret = if_prime(i);
	if(0 != ret) {
	System.out.print(i +" ");
	}
	}
	}

	public static int if_prime(int num) {
	int i = num/2;
	for(int j=2; j<i; j++) {

	if(num%j == 0) {
	return 0;
	}
	}
	return 1;
	}
	*/

	//4. 输出 1000 - 2000 之间所有的闰年
	/*
	public static void main(String[] args) {
	int sum = 0;
	for(int i=1000; i<=2000; i++) {
	int ret = judge(i);
	if(0 != ret) {
	sum++;
	System.out.print(i +" ");
	}
	}
	System.out.println(sum);
	}

	public static int judge(int num) {
	if(((num%4 == 0) && (num%100 != 0)) || (num%400 == 0)) {
	return 1;
	}else {
	return 0;
	}
	}
	*/

	//5. 输出乘法口诀表 
	/*
	public static void main(String[] args) {
	int i = 1;
	for(i=1; i<=9; i++) {
	for(int j=1; j<=i; j++) {
	System.out.printf("%d * %d = %-3d ",i,j,i*j);
	}
	System.out.printf("\n");
	}
	}
	*/

	//6. 求两个正整数的最大公约数 
	/*
	public static void main(String[] args) {
	int ret = common(3,7);
	System.out.println(ret);

	}
	public static int common(int i, int j) {
	if(j < i) {
	int ret = 0;
	ret = i;
	i = j;
	j = ret;
	}
	for(int n=i; ; n+=i) {
	if(n%j == 0) {
	return n;
	}
	}
	}
	*/

	//7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值

	/*public static void main(String[] args) {
	int i = 1;
	double sum = 0.0;

	//最简便，鹏哥讲过
	int flag = 1;
	for(i=1; i<=100; i++) {
	sum += 1.0/i*flag;
	flag *= -1;
	}


	//奇数和偶数分开计算求和
	for(i=1; i<=99; i+=2) {
	sum += 1.0/i;
	}
	for(i=2; i<=100; i+=2) {
	sum += -1.0/i;
	}
	System.out.println(sum);
	}
	*/

	//8. 编写程序数一下 1到 100 的所有整数中出现多少个数字9。
	/*
	public static void main(String[] args) {
	int i = 1;
	int sum = 0;
	for(i=1; i<=100; i++) {
	if(i%10 == 9) {
	sum++;
	}
	if(i/10 == 9) {
	sum++;
	}
	}
	System.out.println(sum);
	}
	*/

	//9. 求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 
	//身，如；153＝1＋5＋3?，则153是一个“水仙花数”。) 



	/*public static void main(String[] args) {
	int i = 0;
	int a = 0;
	int b = 0;
	int c = 0;
	for(i=0; i<=999; i++) {
	{
	a = i % 10;
	b = (i / 10) % 10;
	c = i / 100;
	if((a*a*a + b*b*b + c*c*c) == i) {
	System.out.println(i + "是水仙花数");
	}
	}
	}
	}
	*/

	//10. 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 
	//入，最多输入三次。三次均错，则提示退出程序 
	/*
	public static void main(String[] args) {
	int password = 123;
	Scanner sc = new Scanner(System.in);
	int i = 1;
	while(i <= 3) {
	i++;
	int myword = sc.nextInt();
	if(myword == password) {
	System.out.println("密码输入正确");
	break;
	}else {
	System.out.println("密码输入错误，请重新输入");
	}
	}
	if(i > 3) {
	System.out.println("密码三次输入错误，您已失去资格");
	}
	sc.close();
	}
	*/

	//11. 写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1 
	/*
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	change(num);
	sc.close();
	}

	public static void change(int num) {
	int shang = num;
	int sum = 0;
	while(shang != 0) {
	if ((shang % 2) == 1) {
	sum++;
	}
	shang /= 2;
	}
	System.out.print(sum);
	}
	*/

	//12. 获取一个数二进制序列中所有的偶数位even和奇数位odd， 分别输出二进制序列
	//分析：输入一个十进制数n，通过(n >> i) & 1的方法得到n的二进制的每一位，存到数组binary中。
	//求出数组binary的长度sz, 再分别得到奇偶位
	/*
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	binary(num);
	sc.close();

	}
	public static void binary(int num) {
	int[] binary = {0};
	int[] odd = {0};
	int[] even = {0};
	int i = 0;
	while((num>>i) != 0) {
	binary[i] = (num>>i) & 1;
	i++;
	}
	int sz = binary.length;
	for(i=0; i<sz; i+=2) {
	even[i] = binary[i];
	}
	for(i=1; i<sz; i+=2) {
	odd[i] = binary[i];
	}
	System.out.println("奇数位为");
	for(i=sz-1; i>0; i-=2) {
	System.out.print(odd[i]);
	}
	System.out.print("\n");
	System.out.println("偶数位为");
	for(i=sz; i>=0; i-=2) {
	System.out.print(even[i]);
	}
	}
	}
	*/

	//13. 输出一个整数的每一位. 
	/*
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int i = 0;
	int[] arr = {0};
	while(num != 0) {
	arr[i] = num%10;
	num /= 10;
	i++;
	}
	int sz = arr.length;
	for(i=sz-1; i>=0;  i--) {
	System.out.print(arr[i]);
	}
	sc.close();
	}
	*/
	//14. 完成猜数字游戏 */
	public static void main(String[] args) {
		int num = 123;
		int n = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			if (num == n) {
				System.out.println("猜对了");
				break;
			}
		}
		sc.close();
	}
}














