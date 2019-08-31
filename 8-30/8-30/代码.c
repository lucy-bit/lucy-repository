#define _CRT_SECURE_NO_WARNINGS 1
//1.实现strcpy
//2.实现strcat
//3.实现strstr
//4.实现strchr
//5.实现strcmp
//6.实现memcpy
//7.实现memmove
#include<stdio.h>
#include<assert.h>
#include<string.h>

//int main()
//{
//	char arr[10] = "********";
//	printf("%s\n",strncpy(arr, "hello ", 6));
//	return 0;
//}
//int my_strcmp(const char* arr1, const char* arr2)
//{
//	//思路：从第一个字符向后判断，如果相等并且不是\0，判断下一个字符；若遇到不相等的情况，返回*arr1 - *arr2
//	assert(arr1 && arr2);
//	while (*arr1 == *arr2)
//	{
//		if (*arr1 == '\0')
//			return 0;
//		arr1++;
//		arr2++;
//	}
//	//返回的是两个ascll码值之差
//	return *arr1 - *arr2;
//
//}
//int main()
//{
//	char arr1[10] = "abcdef";
//	char arr2[10] = "A";
//	int ret = 0;
//	ret = my_strcmp(arr1,arr2);
//	printf("%d\n", ret);
//	//ret = strcmp(arr1, arr2);
//	if (ret > 0)
//		printf("arr1大\n");
//	else if (ret < 0)
//		printf("arr2大\n");
//	else
//		printf("一样大\n");
//	return 0;
//}


//
//int my_strchr(char * str, char ch)
//{
//	while ((!(*str++ == ch)) && (*str!='\0'))
//	{
//		;
//	}
//	if (*str == '\0')
//		return 0;
//	return 1;
//}
//int main()
//{
//	char str[] = "abcdef";
//	int ch = my_strchr(str, 'o');
//	if (ch == 0)
//		printf("找不到\n");
//	else
//		printf("找到了\n");
//	return 0;
//}


//my_strstr(第一次写的)
//const char* my_strstr(const char* des, const char* search)
//
//{
//	//定义两个变量，待找到第一个字符相等时，向后找直到找到\0，然后如果不相等就返回初始寻找位置的下一位继续找
//    const char* p = des;
//	const char* s = NULL;
//	const char* search2 = search;
//	assert(des&&search);
//	while (1)
//	{
//		while (!(*p == *search2))
//		{
//			p++;
//		}
//		s = p;
//		while (*s == *search2 && *search2 != '\0' && *s != '\0')
//		{
//			s++;
//			search2++;
//		}
//		if (*search2 == '\0')
//		{
//			return p;
//		}
//		if (*s == '\0')
//		{
//			return NULL;
//		}
//		search2 = search;
//		p++;
//	}
//}
//char* my_strstr(const char* s1, const char* s2)
//{
//	assert(s1&&s2);
//	const char* start = s1;//start记录从开始向后递增的位置
//	const char* p2 = s2;
//	const char* p1 = start;//用p1和p2进行比较
//	while (1)
//	{
//		p1 = start;
//		p2 = s2;
//		while (*p1 == *p2 && *p1 && *p2)
//		{
//			p2++;
//			p1++;
//		}
//		if (*p2 == '\0')
//			return (char*)start;
//		if (*p1 == '\0')
//			return NULL;
//		start++;
//	}
//}
//
//int main()
//{
//	char str[] = "This is a simple string";
//	char* ret = my_strstr(str, "simple");
//	if (ret != NULL)
//		printf("%s\n",ret);
//	else
//		printf("该字符串中不存在\n");
//	return 0;
//}


//char* my_strcat(const char* sourse, char* des)
//{
//	assert(sourse&&des);
//	char* ret = des;
//	while (*des++)
//	{
//		;
//	}
//	des--;
//	while (*des++ = *sourse++)
//	{
//		;
//	}
//	return ret;
//}
//int main()
//{
//	char arr1[20] = "hello ";
//	char arr2[] = "bit";
//	printf("%s\n", my_strcat(arr2, arr1));
//	return 0;
//}
//char *my_strcpy(const char* arr1, char* arr2)
//{
//	assert(arr1 && arr2);
//	char* ret = arr2;
//	while (*arr2++ = *arr1++)
//	{
//		;
//	}
//	return ret;
//}
//int main()
//{
//	char arr1[] = "abcdef";
//	char arr2[20] = { 0 };//[]内必须写上内容，确保arr2足够大，不会栈溢出
//	printf("%s", my_strcpy(arr1,arr2));
//	return 0;
//}