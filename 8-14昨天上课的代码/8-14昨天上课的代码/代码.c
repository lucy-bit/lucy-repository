#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
//int main()
//{
//	char arr1[] = "welcome to bit!!!";
//	char arr2[] = "0";
//	int sz = strlen
//	while ()
//	{
//		for (i = 0;i<=)
//	}
//	return 0;
//}

//int binary_search(int * arr, int k, int sz)
//{
//	int right = sz - 1;
//	int left = 0;
//	while (left <= right)
//	{
//		int mid = left + (right - left) / 2;
//		if (arr[mid] < k)
//			left = mid + 1;
//		else if (arr[mid] > k)
//			right = mid - 1;
//		else
//			return mid;
//	}
//	return -1;
//}
//
//int main()
//{
//	int i = 0;
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	int k = 7;
//	int ret = binary_search(arr, k, sz);
//	if (ret == -1)
//		printf("找不到");
//	else
//		printf("找到了，下标为%d", ret);
//	system("pause");
//	return 0;
//}

#include "add.h"
int main()
{
	int a = 10;
	int b = 20;
	int ret = add(a, b);
	printf("%d", ret);
	system("pause");
	return 0;
}