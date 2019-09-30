#define _CRT_SECURE_NO_WARNINGS 

//设计一个小程序来判断当前机器的字节序：
//int Judge_char(int i)
//{
//	return *(char *)&i;
//}
//int main()
//{
//	int i = 1;
//	int ret = Judge_char(i);
//	if (1 == ret)
//		printf("小端\n");
//	else
//		printf("大端\n");
//	return 0;
//}

//0000 0000 0000 0001
//1111 1111 1111 1110

//利用联合体来判断大小端
//int main()
//{
//	union
//	{
//		char c;
//		int i;
//	}u;
//	u.i = 1;
//	if (1 == u.c)
//		printf("小端\n");
//	else
//		printf("大端\n");
//	return 0;
//}


//#include <stdio.h>
//int main()
//{
//	char str1[] = "hello bit.";
//	char str2[] = "hello bit.";
//	char *str3 = "hello bit.";
//	char *str4 = "hello bit.";
//	if (str1 == str2)
//		printf("str1 and str2 are same\n"); 
//	else     
//		printf("str1 and str2 are not same\n");    
//	if (str3 == str4)   
//		printf("str3 and str4 are same\n");
//	else     
//		printf("str3 and str4 are not same\n"); 
//	return 0;
//}

#include <stdio.h> 
int main()
{   
	int arr[10] = { 0 };
	printf("arr = %p\n", arr);
	printf("&arr= %p\n", &arr);
	printf("arr+1 = %p\n", arr + 1);
	printf("&arr+1= %p\n", &arr + 1); 
	return 0;
}