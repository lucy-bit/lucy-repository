#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<time.h>
#include<stdlib.h>
//void menu()
////编写目录
//{	
//	printf("*************************\n");	
//	printf("*****1.paly***0.exit*****\n");	
//	printf("*************************\n");
//}
//void paly_game()
//{	
//	int rand_num = rand() % 100;
//	//产生0--99之间的随机数	int tmp = 0;	
//	while (1)
//		//选择“1”开始游戏
//	{
//		printf("请输入你要猜的数字：<");	
//		scanf_s("%d", &tmp);
//		if (tmp > rand_num)	
//		{
//			printf("猜大了！\n");
//		}
//		else if(tmp < rand_num)
//		{
//			printf("猜小了！\n");	
//		}
//		else
//		{		
//			printf("恭喜你，猜对了！");	
//		}
//	}
//}
//int main()
//{
//	int input = 0;
//	srand((unsigned int)time(NULL));//srand函数设置随机数产生器		
//	do
//	{
//		menu();		
//		printf("请选择：<\n");
//		scanf_s("%d", &input);	
//		switch (input)
//		{	
//			case 1:		
//			paly_game();		
//			break;	
//			
//			case 0:	
//			exit(0);	
//			break;	
//			
//			default:		
//			printf("选择的错误！\n");		
//		}
//	} while (input);
//	return 0;
//}
//
//使用C语言编写程序，求两个数的最小公倍数
//
//
//
//#include<stdio.h>  
//
//
//
//void swap(int* a, int* b)
//
//{
//
//	int tmp = 0;
//
//	if (*a < *b)
//
//	{
//
//		tmp = *a;
//
//		*a = *b;
//
//		*b = tmp;
//
//	}
//
//}



int main()
{
	int a = 0;
	int b = 0;
	int r = 1;
	int m = 0;
	printf("请输入两个数：\n");
	scanf("%d %d", &a, &b);
	m = a*b;
	if (a < b)
	{
		swap(&a, &b);
	}
	if (a % b == 0 && b != 0)
	{
		if (a == b)
		{
			printf("a,b 的最小公倍数为：%d \n", a);
		}
		return 1;
	}
	else
	{
		while (a % b != 0 && b != 0)
		{
			r = a%b;
			a = b;
			b = r;
		}
		m = m / r;
		printf("a,b 的最小公倍数为 ：%d\n", m);
	}
	return 0;
}
