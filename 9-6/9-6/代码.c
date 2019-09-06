#define _CRT_SECURE_NO_WARNINGS 1
//1.模拟实现strncpy
//2.模拟实现strncat
//3.模拟实现strncmp
#include<stdio.h>
#include<assert.h>
#include<string.h>
//char* my_strncpy(char* des, const char* src, size_t count)
//{
//	char* ret = des;
//	assert(des && src);
//	while (count)
//	{
//		*des++ = *src++;
//		count--;
//	}
//	return ret;
//}
//int main()
//{
//	char arr[30] = "cats are nice usually";
//	printf("%s\n", arr);
//	my_strncpy(arr, "dogs", 4);
//	my_strncpy(arr + 9, "mean", 4);
//	printf("%s\n", arr);
//	return 0;
//}
//char* my_strncat(char* des, const char* src, size_t count)
//{
//	assert(des && src);
//	char* ret = des;
//	while (*des++)
//	{
//		;
//	}
//	des--;
//	while (count)
//	{
//		*des++ = *src++;
//		count--;
//	}
//	return ret;
//}
//int main()
//{
//	char arr1[10] = "hello ";
//	char arr2[4] = "bit";
//	//strncat(arr1, arr2, 3);
//	my_strncat(arr1, arr2, 3);
//	printf("%s\n", arr1);
//
//	return 0;
//}

//int my_strncmp(char* str1, char* str2, size_t count)
//{
//	assert(str1 && str2);
//	while (count)
//	{
//		if (*str1 < *str2)
//		{
//			return -1;
//		}
//		if (*str2 > *str1)
//		{
//			return 1;
//		}
//		str1++;
//		str2++;
//		count--;
//	}
//	return 0;
//}
//int main()
//{
//	char arr1[10] = "abcdef";
//	char arr2[10] = "abcefg";
//	int ret = 0;
//	//ret = strncmp(arr1, arr2, 4);
//	ret = my_strncmp(arr1, arr2, 3);
//	if (ret > 0)
//	{
//		printf("arr1大\n");
//	}
//	else if (ret < 0)
//	{
//		printf("arr2大\n");
//	}
//	else
//	{
//		printf("一样大\n");
//	}
//	return 0;
//}

int main()
{
	int a = 10000;
	FILE* pf = fopen("test,txt", "wb");
	fwrite(&a, 4, 1, pf);
	fclose(pf);
	pf = NULL;
	return 0;
}