#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<time.h>
#include<stdlib.h>
//void menu()
////��дĿ¼
//{	
//	printf("*************************\n");	
//	printf("*****1.paly***0.exit*****\n");	
//	printf("*************************\n");
//}
//void paly_game()
//{	
//	int rand_num = rand() % 100;
//	//����0--99֮��������	int tmp = 0;	
//	while (1)
//		//ѡ��1����ʼ��Ϸ
//	{
//		printf("��������Ҫ�µ����֣�<");	
//		scanf_s("%d", &tmp);
//		if (tmp > rand_num)	
//		{
//			printf("�´��ˣ�\n");
//		}
//		else if(tmp < rand_num)
//		{
//			printf("��С�ˣ�\n");	
//		}
//		else
//		{		
//			printf("��ϲ�㣬�¶��ˣ�");	
//		}
//	}
//}
//int main()
//{
//	int input = 0;
//	srand((unsigned int)time(NULL));//srand�������������������		
//	do
//	{
//		menu();		
//		printf("��ѡ��<\n");
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
//			printf("ѡ��Ĵ���\n");		
//		}
//	} while (input);
//	return 0;
//}
//
//ʹ��C���Ա�д����������������С������
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
	printf("��������������\n");
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
			printf("a,b ����С������Ϊ��%d \n", a);
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
		printf("a,b ����С������Ϊ ��%d\n", m);
	}
	return 0;
}
