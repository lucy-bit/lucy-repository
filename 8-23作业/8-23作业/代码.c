#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
//1.实现一个函数，可以左旋字符串中的k个字符。
//ABCD左旋一个字符得到BCDA
//ABCD左旋两个字符得到CDAB
//思路：逆转“abc123”，先逆转abc，在逆转123——cba321。再逆转整个字符串——123abc
//void reverse(char *left ,char * right )
//{
//	int tmp = 0;
//	while (left < right)
//	{
//		tmp = *left;
//		*left = *right;
//		*right = tmp;
//		left++;
//		right--;
//	}
//
//}
//void Left_rotate(char * str, int n, int sz)
//{
//	int len = sz - 1;
//	reverse(str, str+n-1);
//	reverse(str + n, str + len-1);
//	reverse(str, str + len-1);
//}
//int main()
//{
//	char arr[] = "abc123";
//	int n = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	scanf("%d", &n);
//	Left_rotate(arr,n,sz);
//	printf("%s", arr);
//	return 0;
//}

//2.判断一个字符串是否为另外一个字符串旋转之后的字符串。
//例如：给定s1 = AABCD和s2 = BCDAA，返回1，给定s1 = abcd和s2 = ACBD，返回0.
//
//AABCD左旋一个字符得到ABCDA
//AABCD左旋两个字符得到BCDAA
//
//AABCD右旋一个字符得到DAABC
//思路1：每次将字符串左旋一个字符，然后判断是否与另一个相等，相等返回1；若左旋len次仍不相等，返回0
//思路2（优选）：将字符串给自己追加，再判断追加后的字符串中是否含有要判断的字符串


//思路1
//void reverse(char *left, char * right)
//{
//	int tmp = 0;
//	while (left < right)
//	{
//		tmp = *left;
//		*left = *right;
//		*right = tmp;
//		left++;
//		right--;
//	}
//}
//void Left_rotate(char * str, int n, int sz)
//{
//	int len = sz - 1;
//	reverse(str, str+n-1);
//	reverse(str + n, str + len-1);
//	reverse(str, str + len-1);
//}
//
//int Judge_rotate(char * arr1, char* arr2, int sz)
//{
//	int i = 0;
//	int len = sz - 1;
//	for (i = 1; i <= len; i++)
//	{
//		Left_rotate(arr1, 1, sz);
//		if (0 == strcmp(arr1, arr2))
//		{
//			return 1;
//		}
//	}
//	return 0;
//}




//思路2（优选）：将字符串给自己追加(strncat)，再判断追加后的字符串中是否含有要判断的字符串(strstr)
int left_move(char *arr1,char * arr2,int sz)
{
	int len1 = sizeof(arr1) / sizeof(arr1[0]);
	int len2 = sizeof(arr2) / sizeof(arr2[0]);
	if (len1 != len2)
		return 0;
	arr1 = strncat(arr1, arr1, sz);
	if (strstr(arr1, arr2) != NULL)
	{
		return 1;
	}
	else
		return 0;
}
int main()
{
	char arr1[] = "AABCD";
	char arr2[] = "BCDAA";
	int ret = 0;
	int sz = sizeof(arr1) / sizeof(arr1[0]);
	//思路1
	//ret = Judge_rotate(arr1, arr2, sz);
	//思路2
	ret = left_move(arr1, arr2, sz);
	if (ret == 1)
		printf("可以\n");
	else
		printf("不可以\n");
	return 0;
}