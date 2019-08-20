#define _CRT_SECURE_NO_WARNINGS 1
//交换两个整型变量的值
//#include<stdio.h>
//int main()
//{
//	int a = 0;
//	int b = 0;
//	int c = 0;
//	printf("请输入两个整数：");
//	scanf("%d%d", &a, &b);
//	c = a;
//	a = b;
//	b = c;
//	printf("a=%d,b=%d", a, b);
//	system("pause");
//	return 0;
//}

//不引入其他变量
//#include<stdio.h>
//int main()
//{
//	int a = 7; //0111
//	int b = 10;//1010
//	//加减
//	/*a = a + b;
//	b = a - b;
//	a = a - b;*/
//
//	//按位异或
//	a = a^b;
//	b = b^a;
//	a = a^b;
//	printf("a = %d,b = %d", a, b);
//	system("pause");
//	return 0;
//}

//求十个整数中的最大值
//#include<stdio.h>
//int main()
//{
//	int a[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	int max = a[0];
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		if (max < a[i])
//			max = a[i];
//	}
//	printf("max = %d", max);
//	system("pause");
//	return 0;
//}

//将三个数按从大到小的顺序输出
//#include<stdio.h>
//#include<stdlib.h>
////交换函数
//void change(int *i, int *j)
//{
//	int t = 0;
//	t = *i;
//	*i = *j;
//	*j = t;
//}
//int main()
//{
//	int a = 1;
//	int b = 2;
//	int c = 3;
//	if (a < b)
//		change(&a, &b);
//	if (a < c)
//		change(&a, &c);
//	if (b < c)
//		change(&b, &c);
//	printf("%d%d%d", a, b, c);
//	system("pause");
//	return 0;
//}

//求两个数的最大公约数
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int a = 24;
	int b = 18;
	int tmp1 = a;
	int tmp2 = b;
	int c = 0;
	while (c = a%b)
	{
		a = b;
		b = c;
	}
	printf("最大公约数为%d\n", b);
	//最小公倍数为两个数的乘积与他们最大公约数的比值
	printf("最小公倍数为%d\n", tmp1*tmp2 / b);
	system("pause");
	return 0;
}