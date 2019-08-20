#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<math.h>

//素数
//int main()
//{
//	int i = 0;
//	int j = 0;
//	int count = 0;
//	for (i = 101; i < 200; i += 2)
//	{
//		int flag = 1;
//		for (j = 2; j < sqrt(i); j++)
//		{
//			if (i%j == 0)
//			{
//				flag = 0;
//				break;
//			}
//		}
//		if (flag)
//		{
//			printf("%d ",i);
//			count++;
//		}
//	}
//	printf("count = %d", count);
//	system("pause");
//	return 0;
//}


//乘法口诀
//int main()
//{
//	int i = 0;
//	int j = 0;
//	for (i = 1; i < 10; i++)
//	{
//		for (j = 1; j <= i; j++)
//		{
//			printf("%d*%d=%-2d ", i, j, i*j);
//		}
//		printf("\n");
//	}
//	system("pause");
//	return 0;
//}


//闰年
//int main()
//{
//	int i = 0;
//	int j = 0;
//	int count = 0;
//	for (i = 1000; i <= 2000; i++)
//	{
//		if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
//		{
//			printf("%d ", i);
//			count++;
//		}
//	}
//	printf("count=%d", count);
//	system("pause");
//	return 0;
//}

//求十个整数中的最大值
//int main()
//{
//	int i = 0;
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	int max = arr[0];
//	for (i = 0; i < 10; i++)
//	{
//		if (max < arr[i])
//		max = arr[i];
//	}
//	printf("max=%d\n", max);
//	system("pause");
//	return 0;
//}

//交换两个数
int main()
{
	int a = 5;
	//101
	int b = 7;
	//111
	int c = a&b;
	printf("%d", c);
	system("pause");
	return 0;
}





