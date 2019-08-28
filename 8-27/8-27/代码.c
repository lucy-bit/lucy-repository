#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<assert.h>

	/*1.一个数组中只有两个数字是出现一次，
		其他所有数字都出现了两次。
		找出这两个数字，编程实现。*/
	//char arr[20] = "1,2,3,4,5,1,2,3,4,6";



		/*2.喝汽水，1瓶汽水1元，2个空瓶可以换一瓶汽水，
		给20元，可以多少汽水。
		编程实现。*/
		//int n = 0;
		//int empty = 0;
		//int money = 0;
		//int total = 0;
		//scanf("%d", &money);
		//total = money;
		//empty = money;
		//while (empty > 1)
		//{
		//	total += empty / 2;
		//	empty = empty / 2 + empty % 2;
		//}
		////或者有规律可看出，total数等于2*money-1
		////total = 2*money - 1;
		//printf("total = %d", total);
		




		/*3.模拟实现strcpy*/
//
//	char * my_strcpy(const char *arr1, char *arr2)
//	{
//		char* ret = arr2;
//		assert(arr1 && arr2);
//		while (*arr2++ = *arr1++)
//		{
//			;
//		}
//		return ret;
//	}
//int main()
//{
//
//	char arr1[20] = "abcdef";
//	char arr2[20] = { 0 };
//	printf("%s",my_strcpy(arr1,arr2));
//	return 0;
//}





/*4.模拟实现strcat*/
char * my_strcat(char * des,const char * src)
{
	char * ret = des;
	assert(des && src);
	while (*des++)
	{
		;
	}
	
	while (*des++ = *src++)
	{
		;
	}
	return ret;
}
int main()
{
	char arr1[20] = "abcdef";//[]内的数字必须填写，使得目标数组的空间足够大
	char arr2[] = "123";
	printf("%s\n", my_strcat(arr1, arr2));
	return 0;
}