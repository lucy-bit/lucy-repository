#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int compare(int a, int b)
{
	return (a) > (b) ? (a) : (b);
}
int main()
{
	int a = 10;
	int b = 20;
	int max = compare(a++, b++);
	printf("%d %d %d", max,a, b);
	return 0;
}