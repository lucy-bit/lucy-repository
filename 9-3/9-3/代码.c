#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
////�۲�λ�εĿ��ٷ�ʽ
//struct S
//{
//	char a : 3;
//	char b : 4;
//	char c : 5;
//	char d : 4;
//};
//int main()
//{
//	struct S s = { 0 };
//	s.a = 10;
//	s.b = 12;
//	s.c = 3;
//	s.d = 4;
//	return 0;
//}

////ö��
//enum Sex
//{
//	MALE,
//	FEMALE,
//	SECRATE
//};
////{}�ڷŵ���ö�����͵Ŀ���ȡֵ��ö�ٳ�����
//int main()
//{
//	enum Sex s = 2;
//	return 0;
//}

////������union
union U
{
	char c[5];
	char i;
};
int main()
{
	union U u;
	printf("%p\n", &u);
	printf("%p\n", &(u.c));
	printf("%p\n", &(u.i));
	printf("%d\n", sizeof(union U));

	return 0;
}

////�жϴ�С�˴洢��ʽ
//int Judge_binary()
//{
//	int a = 1;
//	return *(char*)&a;
//}
//int main()
//{
//	int ret = 0;
//	ret = Judge_binary();
//	if (ret == 1)
//	{
//		printf("С�˴洢\n");
//	}
//	else
//	{
//		printf("��˴洢\n");
//	}
//	return 0;
//}