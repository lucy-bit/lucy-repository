#define _CRT_SECURE_NO_WARNINGS 1
#include "game.h"
void InitBoard(char board[ROW][COL], int row, int col)
{
	memset(board, ' ', row*col*sizeof(board[0][0]));
}

void DisplayBoard(char board[ROW][COL], int row, int col)
{
	/* 
	   |   |
	---|---|---
	   |   |   
	---|---|---
	   |   |
	*/
	int i = 0;
	int j = 0;
	for (i = 0; i < row; i++)
	{
		for (j = 0; j < col; j++)
		{
			printf(" %c ", board[i][j]);
			if (j != col - 1)
				printf("|");
		}
		printf("\n");
		if (i != row - 1)
		{
			for (j = 0; j < col; j++)
			{
				printf("---");
				if (j != col - 1)
					printf("|");
			}
			printf("\n");
		}

	}
}

void PlayerMove(char board[ROW][COL], int row, int col)
{

	int x = 0;
	int y = 0;
	while (1)
	{
		printf("玩家走\n");
		printf("请输入选择的坐标:> ");
		scanf("%d%d", &x, &y);
		if (x <= row && y <= col)
		{
			if (board[x - 1][y - 1] == ' ')
			{
				board[x - 1][y - 1] = '*';
				break;
			}
			printf("该坐标已被占用，请重新输入\n");
		}
		else
		printf("坐标非法，请重新选择\n");
	}
}

static int Isfull(char board[ROW][COL], int row, int col)
{
	int i = 0;
	int j = 0;
	for (i = 0; i < row; i++)
	{
		for (j = 0; j < col; j++)
		{
			if (board[i][j] == ' ')
				return 0;
		}
	}
	return 1;
}

char JudgeBoard(char board[ROW][COL], int row, int col)
{
	int i = 0;
	int j = 0;
	//一行一致
	for (i = 0; i < row; i++)
	{
		for (j = 0; j < col - 1; j++)
		{
			if (board[i][j] != board[i][j + 1])
			{
				break;
			}
			if (j == col-2 && board[i][j] != ' ')
				return board[i][j];
				
		}
	}
	//一列一致
	for (j = 0; j < col; j++)
	{
		for (i = 0; i < row - 1; i++)
		{
			if (board[i][j] != board[i + 1][j])
			{
				break;
			}
			if (i == row - 2 && board[i][j] != ' ')
				return board[i][j];
		}
	}
	//一/一致
	for (i = row-1;i>0; i--)
	{
		if (board[i][col - i - 1] != board[i - 1][col - i])
		{
			break;
		}
		if (i == 1 && board[i][col - i - 1]!=' ')
			return board[i][col - i - 1];
	}
	//一\一致
	for (i = 0; i < row - 1; i++)
	{
		if (board[i][i] != board[i + 1][i + 1])
		{
			break;
		}
		if (i == row - 2 && board[i][i]!=' ')
			return board[i][i];
	}
	
	//平局
	if (Isfull(board, ROW, COL) == 1)
		return 'P';
	return 'C';
}

void ComputerMove(char board[ROW][COL], int row, int col)
{

	int x = 0;
	int y = 0;
	printf("电脑玩\n");
	while (1)
	{
		x = rand() % row;
		 y = rand() % col;
			if (board[x ][y ] == ' ')
			{
				board[x][y] = '#';
				break;
			}
	}
}