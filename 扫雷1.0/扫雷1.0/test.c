#define _CRT_SECURE_NO_WARNINGS 1
#include "game.h"
void menu()
{
	printf("****************************\n");
	printf("****      1.play        ****\n");
	printf("****      0.exit        ****\n");
	printf("****************************\n");

}
void game()
{
	char mine[ROWS][COLS] = { 0 };
	char show[ROWS][COLS] = { 0 };
	Initboard(mine, ROWS, COLS,'0');//���̳�ʼ��
	Initboard(show, ROWS, COLS,'*');
	//Displayboard(mine, ROW, COL);//�ɲ���ӡ
	Displayboard(show, ROW, COL);
	SetMine(mine, ROW, COL);//������
	Displayboard(mine, ROW, COL);
	FindMine(mine, show, ROW, COL);//����

}
void test()
{
	int input = 0;
	srand((unsigned int)time(NULL));
	do
	{
		menu();
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			game();
			break;
		case 0:
			printf("�˳���Ϸ\n");
			break;
		default:
			printf("ѡ�����\n");
			break;
		}
	} while (input);
}
int main()
{
	test();
	return 0;
}