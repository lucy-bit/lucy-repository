#define _CRT_SECURE_NO_WARNINGS 1
#include<windows.h>
#include<stdio.h>
//int main()
//{
//	while (1)
//	{
//		printf("hehe");
//		Sleep(1000);
//	}
//	return 0;
//}  
//
//1.模拟实现strncpy
//2.模拟实现strncat
//3.模拟实现strncmp
#include<string.h>
int main()
{
	char arr1[10] = "abcdef";
	char arr2[20] = { 0 };
	char* ret = 0;
	ret = strncpy(arr2, arr1, 4);
	printf("%s\n", ret);
	return 0;
}


