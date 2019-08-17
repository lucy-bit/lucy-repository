#define _CRT_SECURE_NO_WARNINGS 1
#include"game.h"
void menu()
{
		printf("*************************************\n");
		printf("******          1.play         ******\n");
		printf("******          0.exit         ******\n");
		printf("*************************************\n");
}

void game()
{
	char board[ROW][COL] = { 0 };
	char ret = 0;
	InitBoard(board, ROW, COL);//初始话棋盘
	DisplayBoard(board, ROW, COL);//打印棋盘
	while (1)
	{
		PlayerMove(board, ROW, COL);//玩家走
		DisplayBoard(board, ROW, COL);//打印棋盘
		JudgeBoard(board, ROW, COL);
		ret = JudgeBoard(board, ROW, COL);
		if (ret != 'C')
		{
			break;
		}
		ComputerMove(board, ROW, COL);//电脑走
		DisplayBoard(board, ROW, COL);//打印棋盘
		JudgeBoard(board, ROW, COL);
		ret = JudgeBoard(board, ROW, COL);
		if (ret != 'C')
		{
			break;
		}
	}

	if (ret == 'P')
	{
		printf("平局\n");
	}
	else if (ret == '#')
		printf("电脑赢\n");
	else if (ret == '*')
		printf("玩家赢\n");

}
void test()
{
	int input = 0;
	srand((unsigned)time(NULL));

	do
	{
		menu();
		printf("请选择：>");
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
	//srand((unsigned)time(NULL));
	test();
	return 0;
}