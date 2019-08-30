#define _CRT_SECURE_NO_WARNINGS 1
#include "contact.h"
//分装通讯录结构体(使得以后传参传这个结构体就行)，并且记得初始化结构体（再写一个初始函数，必须传地址）
//删除函数先判断通讯录是否为空（sz == 0）
//因为有三个函数都需要查找函数，所以另外写一个查找函数
//删除有两种删除方法，一个是将删除后的元素提前，或最后一个替换
void menu()
{
	printf("***********************************\n");
	printf("****     1.Add     2.Delete    ****\n");
	printf("****     3.Modify  4.Search    ****\n");
	printf("****     5.Show    0.Exit      ****\n");
	printf("***********************************\n");
}
int main()
{
	int input = 0;
	Contact con;
	Init(&con);
	do
	{
		menu();
		scanf("%d", &input);
		switch (input)
		{
		case Add:
			AddContact(&con);
			break;
		case Delete:
			DeleteContact(&con);
			break;
		case Modify:
			ModifyContact(&con);
			break;
		case Search:
			break;
		case Show:
			ShowContact(&con);
			break;
		case Exit:
			printf("退出游戏\n");
			break;
		default:
			printf("选择错误，请重新输入\n");
			break;
		}
	} while (input);
	return 0;
}