#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//#include<stddef.h>
//offsetof并不是一个函数，而是宏定义
#define offsetof(s,m)   (size_t)(&(((s*)0)->m))//将0转换为结构体指针，m的地址即它的偏移量
////结构体对齐
//#pragma pack(2)
//struct A
//{
//	char a;
//	int b;
//	char c;
//};
//#pragma pack()
//
struct B
{
	char d;
	char e;
	int f;
};
//int main()
//{
//	printf("%d\n", sizeof(struct A));
//	printf("%d\n", sizeof(struct B));
//	return 0;
//}

int main()
{
	printf("%d", offsetof(struct B, d));
	printf("%d", offsetof(struct B, e));
	printf("%d", offsetof(struct B, f));
	return 0;
}