#define _CRT_SECURE_NO_WARNINGS 1
#define _CRT_SECURE_NO_WARNINGS 1
#include"game.h"
double  start, finish;

void menu()
{
	printf("*******************************\n");
	printf("*****1.play       0.exit*******\n");
	printf("*******************************\n");
}

void game()
{
	char mine[ROWS][COLS] = { 0 };//存放雷的信息
	char show[ROWS][COLS] = { 0 };//排查出的雷的信息
	InitBoard(mine, ROWS, COLS, '0');//'0'
	InitBoard(show, ROWS, COLS, '*');//'*'
	DispalyBoard(show, ROW, COL);
	SetMine(mine, ROW, COL);//布置雷
	DispalyBoard(mine, ROW, COL);
	FindMine(mine, show, ROW, COL);//排雷

	int ret = 0;
	init_mine();//初始化玩家棋盘和设计者棋盘
	set_mine();//给设计者棋盘布雷
	print_mine();//打印设计者棋盘（可不打印）
	printf("\n");
	print_player();//打印玩家棋盘
	start = clock();
	safe_mine();//避免第一次被炸死

	if (count_show_mine() == COUNT)//一步就赢的情况
	{
		print_mine();
		printf("玩家赢！\n\n");
		return;
	}print_player();////打印玩家棋盘

	while (1)//循环扫雷
	{
		int ret = sweep_mine();//扫雷,踩到雷返回1，没有踩到雷返回0
		if (count_show_mine() == COUNT)//若玩家棋盘的'*'个数为雷数时，扫雷完成，游戏胜利
		{
			print_mine();//打印设计者棋盘
			printf("玩家赢！\n\n");
			finish = clock();//取结束时间
			printf("用时%d 秒\n", (int)(finish - start) / CLOCKS_PER_SEC);
			break;
		}
		if (ret)//判断是否踩到雷
		{
			printf("被雷炸死\t");
			finish = clock();//取结束时间
			printf("用时%d 秒\n", (int)(finish - start) / CLOCKS_PER_SEC);
			print_mine();//打印设计者雷阵查看雷的分布
			break;
		}print_player();//打印玩家棋盘
	}
}


int main()
{
	srand((unsigned int)time(NULL));//产生随机数生成器
	int input = 0;
	menu();//菜单
	do
	{
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
			printf("输入错误，重新输入\n");
			break;
		}
	} while (input);
	return 0;
}