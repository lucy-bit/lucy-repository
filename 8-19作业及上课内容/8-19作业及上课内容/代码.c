#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
//int Fib(int n)
//{
//	if (n <= 2)
//	{
//		return 1;
//	}
//	else
//	return Fib(n - 1) + Fib(n - 2);
//}
//int main()
//{
//	//1.递归和非递归分别实现求第n个斐波那契数。
//	//1 1 2 3 5 8 13 21
//	//1 2 3 4 5 6  7  8
//	
//
//	//递归
//	int n = 0;
//	scanf("%d", &n);
//	printf("%d",Fib(n));
//	return 0;
//}
//int Fib(int n)
//{
//	//1 1 2 3 5 8 13 21
//	//1 2 3 4 5 6  7  8
//	int a = 1;
//	int b = 1;
//	int c = 0;
//	if (n <= 2)
//		return 1;
//	else
//	{
//		while (n > 2)
//		{
//			c = a + b;
//			a = b;
//			b = c;
//			n--;
//		}
//
//		return c;
//	}
//}
////非递归
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	printf("%d",Fib(n));
//	return 0;
//}



////2.编写一个函数实现n^k，使用递归实现
//int my_power(int n, int k)
//{
//	int result = 0;
//	while (k!=0)
//	{
//		result = n *n;
//		k--;
//	}
//	return result;
//}
//int main()
//{
//	int n = 0;
//	int k = 0;
//	printf("请输入n和k:> ");
//	scanf("%d%d", &n, &k);
//	printf("%d\n", my_power(n, k));
//	return 0;
//}

//3. 写一个递归函数DigitSum(n)，输入一个非负整数，返回组成它的数字之和，
//例如，调用DigitSum(1729)，则应该返回1 + 7 + 2 + 9，它的和是19
//int DigitSum(int n)
//{
//	int sum = 0;
//	if (n / 10 != 0)
//		sum = DigitSum(n / 10) + n % 10;
//	else
//		return n % 10;
//	return sum;
//}
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	printf("%d\n", DigitSum(n));
//	return 0;
//}
//

//4. 编写一个函数 reverse_string(char * string)（递归实现）
//实现：将参数字符串中的字符反向排列。
//要求：不能使用C函数库中的字符串操作函数。
//char reverse_string(char *string)
//{
////从最后一个开始从前往后打印，看起来就像反向排列了.从第一个开始找'\0'，找到后从后往前打印
//	if (*string != '\0')
//		reverse_string(string + 1);
//	printf("%c", *string);
//}
//int main()
//{
//	char arr[] = "hello bit";
//	reverse_string(arr);
//	return 0;
//}
//

//5.递归和非递归分别实现strlen
////递归
//int my_strlen(char *str)
//{
//	if (*str != '\0')
//	return my_strlen(++str) + 1;
//	return 0;
//}
//非递归
//int my_strlen(char *str)
//{
//	int count = 0;
//	while(*str != '\0')
//	{
//		count++;
//		str++;
//	}
//	return count;
//}
//int main()
//{
//	char arr[] = "abc";
//	printf("%d\n", my_strlen(arr));
//
//	return 0;
//}
//
//6.递归和非递归分别实现求n的阶乘
//int Fac(int n)
//{
//	int sum = 1;
//	while (n != 0)
//	{
//		sum *= n;
//		n--;
//	}
//	
//	return sum;
//}
//int Fac(int n)
//{
//	int sum = 1;
//	if (n != 0)
//	sum = Fac(n - 1)*n;
//
//	return sum;
//}
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	printf("%d", Fac(n));
//	return 0;

//}
//7.递归方式实现打印一个整数的每一位
//void print(int n)
//{
//	if (n / 10 != 0)
//	{
//		print(n / 10);
//	}
//		printf("%d ", n % 10);
//
//}
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	print(n);
//	return 0;
//}

//1.
//写一个函数返回参数二进制中 1 的个数
//比如： 15 0000 1111 4 个 1
//程序原型：
//int count_one_bits(unsigned int value)
//{
//	// 返回1的位数 
//}
//int count_one_bits(unsigned int n)
//{
//	int i = 0;
//	int count = 0;
//	for (i = 0; i < 32; i++)
//	{
//		if ((n >> i) & 1 == 1)
//		{
//			count++;
//		}
//	}
//	return count;
//}
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	printf("%d",count_one_bits(n));
//	return 0;
//}

//2.获取一个数二进制序列中所有的偶数位和奇数位，
//分别输出二进制序列。
//void Output_Binary(int n)
//{
//	//00000101  0000 1010
//	//5 10
//	//even 偶数0011 0000
//	//odd 奇数0000  0011
//	int i = 0;
//	printf("打印奇数位:\n");
//	for (i = 31; i > 0; i-=2)
//	{
//		if (((n >> i)&1) == 1)
//		{
//			printf("1");
//		}
//		else
//			printf("0");
//	}
//	printf("\n");
//	printf("打印偶数位:\n");
//	for (i = 30; i >= 0; i -= 2)
//	{
//		if (((n >> i)&1 )== 1)
//		{
//			printf("1");
//		}
//		else
//			printf("0");
//	}
//}
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	Output_Binary(n);
//	return 0;
//}

//
////3. 输出一个整数的每一位。
//void Output(int n)
//{
//	if (n/10 != 0)
//	Output(n / 10);
//	printf("%d ", n % 10);
//
//}
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	Output(n);
//	return 0;
//}

//4.编程实现：
//两个int（32位）整数m和n的二进制表达中，有多少个位(bit)不同？
//输入例子 :
//1999 2299
//输出例子 : 7
int binary_different(unsigned int i, unsigned int j)
{
	int count = 0;
	int tmp = 0;
	int n = 0;
	tmp = i^j;
	for (n = 0; n < 32; n++)
	{
		if (1 == ((tmp >> n) & 1))
			count++;
	}
	return count;
	
}
int main()
{
	int i = 0;
	int j = 0;
	scanf("%d%d", &i, &j);
	printf("%d\n",binary_different(i,j));
	return 0;
}