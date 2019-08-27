#define _CRT_SECURE_NO_WARNINGS 1
#include "game.h"
void Initboard(char board[ROWS][COLS], int rows, int cols, char set)
{
	memset(board, set, sizeof(set)*rows*cols);
}
void Displayboard(char board[ROWS][COLS], int row, int col)
{
	int i = 0;
	int j = 0;
	for (i = 0; i <= row; i++)
	{
		printf("%d " , i);
	}
	printf("\n");
	for (i = 0; i <= row; i++)
	{
		printf("--");
	}
	printf("\n");
	for (i = 1; i <= row; i++)
	{
		printf("%d|", i);
		for (j = 1; j <= col; j++)
		{
			printf("%c ", board[i][j]);
		}
		printf("\n");
	}
	printf("\n");
}
void SetMine(char mine[ROWS][COLS], int row, int col)
{
	int count = DEFAULT_COUNT;
	while (count)
	{
		int x = rand() % row + 1;
		int y = rand() % col + 1;
		if (mine[x][y] == '0')
		{
			mine[x][y] = '1';
			count--;
		}
	}
}
int GetMineCount(char mine[ROWS][COLS], int x, int y)
{
	//汇总一个坐标周围有几个雷
	int ret = 0;
	ret = mine[x - 1][y] +
		mine[x - 1][y - 1] +
		mine[x][y - 1] +
		mine[x + 1][y - 1] +
		mine[x + 1][y] +
		mine[x + 1][y + 1] +
		mine[x][y + 1] +
		mine[x - 1][y + 1] - 8 * '0';
	    return ret;
}

void Unfold(char mine[ROWS][COLS],char show[ROWS][COLS],int x,int y，int row, int col )
{
	int count = GetMineCount(mine, x, y);
	int offset_x = 0;
	int offset_y = 0;
	//判断坐标是否合法，框框上的就不展开了
	if (x >= 1 && x <=  && y >= 1 && y <= 9)
	{
		
	}

	
}
void FindMine(char mine[ROWS][COLS], char show[ROWS][COLS], int row, int col)
{
	int x = 0;
	int y = 0;
	int win = 0;
	while (win<row*col - DEFAULT_COUNT)
	{
		printf("请输入要排查的坐标:>");
		scanf("%d%d", &x, &y);
		if (x >= 1 && x <= row && y >= 1 && y <= col)
		{
			if (mine[x][y] == '1')
			{
				printf("很遗憾，你被炸死了\n");
				Displayboard(mine, row, col);
				break;
			}
			else
			{
				//是雷炸死了
				//不是雷，周围没有雷展开
				//不是雷，周围有雷不展开
				int count = GetMineCount(mine, x, y);
				Unfold(mine, show, x, y, row, col);
				//该坐标确定不是雷，从上一行对应列坐标开始逆时针判断
				//若是雷，访问下一个坐标，不管它
				//若不是雷(判断为0)，从对应坐标接着展开向周围判断,判断过后将其
				//最终周围一圈都是不为0的数字

				


				show[x][y] = count + '0';
				Displayboard(show, row, col);
				win++;
			}
		}
		else
		{
			printf("坐标非法，重新输入!\n");
		}
	}
	if (win == row*col - DEFAULT_COUNT)
	{
		printf("恭喜你，排雷成功\n");
		Displayboard(mine, row, col);
	}
}

