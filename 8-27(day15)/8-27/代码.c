#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<assert.h>

	/*1.一个数组中只有两个数字是出现一次，
		其他所有数字都出现了两次。
		找出这两个数字，编程实现。*/
//思路：将所有数按位异或在一起，确定二进制位为1的位数，然后按此分组，使得5和6一定会被分在两个组里。再将各组数字按位异或在一起最后得到的就是5和6
void Find_two_dif(int* p1, int* p2,int sz,int arr[])
{
	int i = 0;
	int tmp = 0;
	int pos = 0;
	//将数组中所有数按位异或在一起
	for (i = 0; i < sz; i++)
	{
		tmp ^= arr[i];
	}
	//找出按位异或后二进制中哪一位为1
	for (i = 0; i < sz; i++)
	{
		if (1 == ((tmp>>i)&1))
		{
			pos = i;
			break;
		}
	}
	//分组
	for (i = 0; i < sz; i++)
	{
		if (((arr[i]>>pos)&1) == 1)
		{
			*p1 ^= arr[i];
		}
		/*else
		{
			*p2 ^= arr[i];
		}*/
		//或者
	}
	*p2 = tmp^*p1;
}
int main()
{
	int arr[20] = {1,2,3,4,5,1,2,3,4,6};
	int num1 = 0;
	int num2 = 0;
	int sz = sizeof(arr) / sizeof(arr[0]);
	Find_two_dif(&num1, &num2,sz,arr);
	printf("%d %d", num1, num2);
	return 0;
}


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
//char * my_strcat(char * des,const char * src)
//{
//	char * ret = des;
//	assert(des && src);
//	while (*des++)
//	{
//		;
//	}
//	
//	while (*des++ = *src++)
//	{
//		;
//	}
//	return ret;
//}
//int main()
//{
//	char arr1[20] = "abcdef";//[]内的数字必须填写，使得目标数组的空间足够大
//	char arr2[] = "123";
//	printf("%s\n", my_strcat(arr1, arr2));
//	return 0;
//}