#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
int main()
{
//	//1.在屏幕上输出菱形
	//int i = 0;
	//int j = 0;
	//int line = 0;
	//printf("请输入行数: ");
	//scanf("%d", &line);
	//for (i = 0; i < line; i++)
	//{
	//	//打印空格
	//	for (j = 0; j < line - i-1; j++)
	//	{
	//		printf(" ");
	//	}
	//	for (j = 0; j < 2 * i + 1; j++)
	//	{
	//		printf("*");
	//	}
	//	printf("\n");

	//}
	//for (i = 0; i < line - 1; i++)
	//{
	//	for (j = 0; j < i + 1; j++)
	//	{
	//		printf(" ");
	//	}
	//	for (j = 0; j < (line -1- i) * 2 - 1; j++)
	//	{
	//		printf("*");
	//	}

	//	printf("\n");
	//}




	int line = 0;
	int n = 0;
	int i = 0;
	scanf("%d", &n);

	for (line = 0; line <= n; line++)
	{
		//打印空格
		for (i = n-line; i > 0; i--)
		{
			printf(" ");
		}
		//打印*
		for (i = 1; i <= (2 * line - 1); i++)
		{
			printf("*");
		}
		printf("\n");
	}
	for (line = n-1; line > 0; line--)
	{
		//打印空格
		for (i = 1; i <= n-line; i++)
		{
			printf(" ");
		}
		//打印*
		for (i = 1; i <= (2 * line - 1); i++)
		{
			printf("*");
		}
		printf("\n");
	}



	system("pause");
	return 0;
}





//2.求出0～999之间的所有“水仙花数”并输出。
//“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，如；153＝1＋5＋3 ? ，则153是一个“水仙花数”。

/*
在数论中，水仙花数（Narcissistic number）也称为自恋数、自幂数、阿姆斯壮数或阿姆斯特朗数（Armstrong number），是指一N位数，其各个数之N次方和等于该数。
例如153、370、371及407就是三位数的水仙花数，其各个数之立方和等于该数：
153 = 1^3 + 5^3 + 3^3。
370 = 3^3 + 7^3 + 0^3。
371 = 3^3 + 7^3 + 1^3。
407 = 4^3 + 0^3 + 7^3。
*/
//#include<math.h>
//int main()
//{
//	int i = 0; 
//
//	int tmp = 0;
//	for (i = 1; i <= 1000000; i++)
//	{
//		//计算位数
//		//123
//		int count = 0;
//		int sum = 0;
//		tmp = i;
//		while (tmp)
//		{
//			tmp /= 10;
//			count++;
//		}
//		tmp = i;
//		while (tmp)
//		{
//			sum += pow(tmp%10, count);
//			tmp /= 10;
//		}
//		if (sum == i)
//		{
//			printf("%d ", i);
//		}
//	}
//	system("pause");
//	return 0;
//}






/*3.
求Sn = a + aa + aaa + aaaa + aaaaa的前5项之和，其中a是一个数字，
例如：2 + 22 + 222 + 2222 + 22222*/
//答案是24690
//#include<math.h>
//int main()
//{
//	int a = 0;
//	int i = 0;
//	int sum = 0;
//	int n = 0;
//	int tmp = 0;
//	printf("请输入一个数字:> ");
//	scanf("%d", &a);
//	/*for (i = 0; i < 5; i++)
//	{
//		n += pow(10, i)*a;
//		sum += n;
//	}*/
//	//或者
//	for (i = 0; i < 5; i++)
//	{
//		tmp = tmp * 10 + a;
//		sum += tmp;
//	}
//
//
//
//	printf("sum == %d\n", sum);
//	system("pause");
//	return 0;
//}