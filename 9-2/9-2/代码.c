#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//#include<stddef.h>
//offsetof������һ�����������Ǻ궨��
#define offsetof(s,m)   (size_t)(&(((s*)0)->m))//��0ת��Ϊ�ṹ��ָ�룬m�ĵ�ַ������ƫ����
////�ṹ�����
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