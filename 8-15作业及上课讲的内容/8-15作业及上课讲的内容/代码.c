#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//ì³²¨ÄÇÆõÊýÁÐ
//1 1 2 3 5 8 13 21
//·ÇµÝ¹éËã·¨
//int Fib(int n)
//{
//	int result = 1;
//	int former = 1;
//	int later = 1;
//	while (n > 2)
//	{
//		n--;
//		result = former + later;
//		former = later;
//		later = result;
//	}
//	return result;
//}


//µÝ¹é
int Fib(int n)
{
	int i = 0;
	int result = 0;
	if (n <= 1)
	{
		return 1;
	}
	else
	{
		for (i = 0; i < n; i++)
		{
			result = Fib(i - 1) + Fib(i - 2);
		}
	}
}
//int main()
//{
//	int ret = 0;
//	int n = 0;
//	scanf("%d", &n);
//	ret = Fib(n);
//	printf("%d", ret);
//	return 0;
//}

int main()
{

	return 0;
}


