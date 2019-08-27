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
	Initboard(mine, ROWS, COLS,'0');//棋盘初始化
	Initboard(show, ROWS, COLS,'*');
	//Displayboard(mine, ROW, COL);//可不打印
	Displayboard(show, ROW, COL);
	SetMine(mine, ROW, COL);//布置雷
	Displayboard(mine, ROW, COL);
	FindMine(mine, show, ROW, COL);//排雷

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
			printf("退出游戏\n");
			break;
		default:
			printf("选择错误\n");
			break;
		}
	} while (input);
}
int main()
{
	test();
	return 0;
}