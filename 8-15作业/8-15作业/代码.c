#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//int main()
//{
//	/*1.实现一个函数，打印乘法口诀表，口诀表的行数和列数自己指定，
//		输入9，输出9 * 9口诀表，输入12，输出12 * 12的乘法口诀表。
//	*/
//	//1*1=1
//	//2*1=2 2*2=4 
//	//3*1=3 3*2=6 3*3=9
//	int n = 0;
//	int i = 0;
//	int j = 0;
//	printf("请输入打印几行:> ");
//	scanf("%d", &n);
//	for (i = 1; i <= n; i++)
//	{
//		for (j = 1; j <= i; j++)
//		{
//			printf("%d*%d=%-2d ", j, i, i*j);
//		}
//		printf("\n");
//	}
//	return 0;
//}

//2.使用函数实现两个数的交换
//void change(int* a, int* b)
//{
//	int tmp = 0;
//	tmp = *a;
//	*a = *b;
//	*b = tmp;
//}
//int main()
//{
//	int num1 = 0;
//	int num2 = 0;
//	printf("请输入两个数:> ");
//	scanf("%d%d", &num1, &num2);
//	change(&num1, &num2);
//	printf("num1 = %d, num2 = %d\n", num1, num2);
//	return 0;
//}

//
////3.实现一个函数判断year是不是润年。
//int Judge(int y)
//{
//	if ((y%4==0 && y%100!=0) || (y%400==0))
//		return 1;
//	return 0;
//}
//int main()
//{
//	int year = 0;
//	printf("请输入年份:>");
//	scanf("%d", &year);
//	if (1 == Judge(year))
//	{
//		printf("是闰年\n");
//	}
//	else
//	{
//		printf("不是闰年\n");
//	}
//
//	return 0;
//}

//4.
//创建一个数组，
//实现函数init（）初始化数组、
//实现empty（）清空数组、
//实现reverse（）函数完成数组元素的逆置。
//要求：自己设计函数的参数，返回值。
void init(int * arr,int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		arr[i] = i;
	}
}

void empty(int * arr, int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		arr[i] = 0;
	}
}

void reverse(int * arr, int sz)
{
	int arr1[] = { 0 };
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		arr1[i] = arr[i];
	}
	for (i = 0; i < sz; i++)
	{
		arr[i] = arr1[sz - i];
	}
}
int main()
{
	int i = 0;
	int arr[5];
	int sz = sizeof(arr) / sizeof(arr[0]);

	init(arr,sz);
	for (i = 0; i < sz; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");

	reverse(arr, sz);
	for (i = 0; i < sz; i++)
	{
		printf("%d ", arr[i]);
		printf("\n");
	}

	empty(arr,sz);
	for (i = 0; i < sz; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");

	return 0;
}