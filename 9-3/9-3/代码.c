#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
////观察位段的开辟方式
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

////枚举
//enum Sex
//{
//	MALE,
//	FEMALE,
//	SECRATE
//};
////{}内放的是枚举类型的可能取值（枚举常量）
//int main()
//{
//	enum Sex s = 2;
//	return 0;
//}

////联合体union
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

////判断大小端存储方式
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
//		printf("小端存储\n");
//	}
//	else
//	{
//		printf("大端存储\n");
//	}
//	return 0;
//}