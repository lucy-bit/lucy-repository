#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//1.调整数组使奇数全部都位于偶数前面。
//
//题目：
//
//输入一个整数数组，实现一个函数，
//来调整该数组中数字的顺序使得数组中所有的奇数位于数组的前半部分，
//所有偶数位于数组的后半部分。

//思路：从前往后找到第一个奇数，从后往前找到第一个偶数，将两者交换，直到i=j为止

//void Adjust(int * arr)
//{
//	int i = 0;
//	int j = 9;
//	int tmp = 0;
//	while (i<j)
//	{
//		if (0 == arr[i] % 2)
//		{
//			if (1 == arr[j] % 2)
//			{
//				tmp = arr[i];
//				arr[i] = arr[j];
//				arr[j] = tmp;
//			}
//			else
//			{
//				j--;
//			}
//		}
//		else
//		{
//			i++;
//		}
//	}
//}
//int main()
//{
//	int arr[] = { 0,1,2,3,4,5,6,7,8,9 };
//	int i = 0;
//
//	Adjust(arr);
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	return 0;
//}

//2.
//杨氏矩阵 
//有一个二维数组.
//数组的每行从左到右是递增的，每列从上到下是递增的.
//在这样的数组中查找一个数字是否存在。
//时间复杂度小于O(N);
//
//数组：
//1 2 3
//2 3 4
//3 4 5
//
//
//1 3 4
//2 4 5
//4 5 6
//
//1 2 3
//4 5 6
//7 8 9

//分析：从第一行第一个元素开始判断，若相等返回该值；
//									若大于该数，与该行最后一个数比较
//																	若相等，返回该值
//																	若小于该数，倒着往前依次比较
//																	若大于该数，转向下一行仍按照这种方法比较
//									若小于该数，则要查找的数字不存在
int Check(int(*p)[3], int n)
{
	if (n == **p)
	{
		return 1;
	}
	else if ()
}
int main()
{
	int arr[3][3] = { 1, 2, 3, 2, 3, 4, 3, 4, 5 };
	int n = 0;
	int ret = 0;
	scanf("%d", &n);
	ret = Check(arr, n);
	return 0;
}
