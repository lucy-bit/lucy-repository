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
void Adjust(int arr[],int sz)
{
	int i = 0;
	int j = sz - 1;
	while (i<j)
	{
		int tmp = 0;
		while (i<j && arr[i]%2 != 0)
		{
			i++;
		}
		while (i<j && arr[j]%2 == 0)
		{
			j--;
		}
		if (i < j)
		{
			tmp = arr[i];
			arr[i]= arr[j];
			arr[j] = tmp;
		}	
	}
}
int main()
{
	//int arr[] = { 0,1,2,3,4,5,6,7,8,9 };
	int arr[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
	int sz = sizeof(arr) / sizeof(arr[0]);
	int i = 0;
	Adjust(arr,sz);
	for (i = 0; i < 10; i++)
	{
		printf("%d ", arr[i]);
	}
	return 0;
}

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

//分析：从右上角（或左下角）元素p开始判断，若p<该数字，p所在行不再考虑，row++，接着从右上角开始判断
//                                         若p>该数字，p所在列不再考虑，col--，仍从右上角开始判断
//                                         若相等，返回1
//    循环结束的条件：当p所在行或列越界时就说明整个数组内都没有要找的数字，返回0
//注意：这里用到了返回型参数，传入row和col的地址，使得在函数内部就能改变两个的值，解决了返回值只有一个参数带来的问题
// int Check(int arr[3][3],int* prow,int* pcol, int n)
//{
//	 int x = 0;
//	 int y = *pcol - 1;
//	 while (x<=*prow && y>=0)
//	 {
//		 if (arr[x][y] < n)
//		 {
//			x++;
//		 }
//		 else if (arr[x][y] > n)
//		 {
//			 y--;
//		 }
//		 else
//		 {
//			 *prow = x;
//			 *pcol = y;
//			 return 1;
//		 }
//	 }
//	 return 0;
//}
//int main()
//{
//	int row = 3;
//	int col = 3;
//	int arr[3][3] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//	int n = 0;
//	int ret = 0;
//	scanf("%d", &n);
//	ret = Check(arr,&row,&col,n);
//	if (0 == ret)
//		printf("不存在\n");
//	else if (1 == ret)
//		printf("存在,下标为%d %d\n",row,col);
//	return 0;
//}



