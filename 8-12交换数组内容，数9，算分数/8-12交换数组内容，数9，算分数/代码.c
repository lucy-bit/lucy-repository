#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
//交换两个数组的内容
//int main()
//{
//	int arr1[5] = { 1, 2, 3, 4, 5 };
//	int arr2[5] = { 5, 4, 3, 2, 1 };
//	int arr3[5] = { 0 };
//	int i = 0;
//  int sz = sizeof(arr)/sizeof(arr[1]);
//	for (i = 0; i < sz; i++)
//	{
//		arr3[i] = arr1[i];
//		arr1[i] = arr2[i];
//		arr2[i] = arr3[i];
//	}
//	printf("arr1 = ");
//	for (i = 0; i < 5; i++)
//	{
//		printf("%d ", arr1[i]);
//	}
//	printf("\n");
//	printf("arr2 = ");
//	for (i = 0; i < 5; i++)
//	{
//		printf("%d ", arr2[i]);
//	}
//	system("pause");
//	return 0;
//}

//2. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
//int main()
//{
//	double sum = 0.0;
//	int i = 0;
//	for (i = 1; i <= 100; i++)
//	{
//		int j = i;
//		if (0 == i % 2)
//			j *= (-1);
//		sum += 1.0/j;
//	}
//或者 int flag = 1.0;
// for (i = 1; i <= 100; i++)
	/*{
		sum += flag / j;
		flag *= (-1);
	}*/
//	printf("sum = %lf", sum);
//	system("pause");
//	return 0;
//}

//3. 编写程序数一下 1到 100 的所有整数中出现多少次数字9。
//int main()
//{
//	int sum = 0;
//	int i = 0;
//	for (i = 1; i <= 100; i++)
//	{
//		if (9 == i%10)
//			sum++;
//		if (9 == i/10)
//			sum++;
//	}
//	printf("sum = %d", sum);
//	system("pause");
//	return 0;
//}

//测试上课学的内容
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int a = 10;
	int b = 20;
	(a > b) ? (printf("%d\n", a)) : (printf("%d\n", b));//条件操作符

	system("pause");
	return 0;
}


