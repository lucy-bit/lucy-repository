#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
//1.ʵ��һ�����������������ַ����е�k���ַ���
//ABCD����һ���ַ��õ�BCDA
//ABCD���������ַ��õ�CDAB
//˼·����ת��abc123��������תabc������ת123����cba321������ת�����ַ�������123abc
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

//2.�ж�һ���ַ����Ƿ�Ϊ����һ���ַ�����ת֮����ַ�����
//���磺����s1 = AABCD��s2 = BCDAA������1������s1 = abcd��s2 = ACBD������0.
//
//AABCD����һ���ַ��õ�ABCDA
//AABCD���������ַ��õ�BCDAA
//
//AABCD����һ���ַ��õ�DAABC
//˼·1��ÿ�ν��ַ�������һ���ַ���Ȼ���ж��Ƿ�����һ����ȣ���ȷ���1��������len���Բ���ȣ�����0
//˼·2����ѡ�������ַ������Լ�׷�ӣ����ж�׷�Ӻ���ַ������Ƿ���Ҫ�жϵ��ַ���


//˼·1
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




//˼·2����ѡ�������ַ������Լ�׷��(strncat)�����ж�׷�Ӻ���ַ������Ƿ���Ҫ�жϵ��ַ���(strstr)
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
	//˼·1
	//ret = Judge_rotate(arr1, arr2, sz);
	//˼·2
	ret = left_move(arr1, arr2, sz);
	if (ret == 1)
		printf("����\n");
	else
		printf("������\n");
	return 0;
}