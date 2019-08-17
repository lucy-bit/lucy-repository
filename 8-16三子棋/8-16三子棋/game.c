#define _CRT_SECURE_NO_WARNINGS 1
#include "game.h"
void InitBoard(char board[ROW][COL], int row, int col)
{
	int i = 0;
	int j = 0;
	for (i = 0; i < row; i++)
	{
		for (j = 0; j < col; j++)
		{
			board[i][j] = ' ';
		}
	}
}

void DisplayBoard(char board[ROW][COL], int row, int col)
{
	int i = 0;
	for (i = 0; i < row; i++)
	{
		int j = 0;
		for (j = 0; j < col; j++)
		{
			printf(" %c ",board[i][j]);
			if (j<col-1)
			printf("|");
		}
		printf("\n");
		if (i < row - 1)
		{
			for (j = 0; j < col; j++)
			{
				printf("---");
				if (j < col - 1)
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
		printf("�����\n");
		printf("������ѡ����±�:> ");
		scanf("%d%d", &x, &y);
		if (x <= row && y <= col)
		{
			if (board[x - 1][y - 1] == ' ')
			{
				board[x - 1][y - 1] = '*';
				break;
			}
			printf("�������ѱ�ռ�ã�����������\n");
		}
		else
		{
			printf("��ѡ�±겻�ڷ�Χ�ڣ�������ѡ��\n");
		}
	}
}

void ComputerMove(char board[ROW][COL], int row, int col)
{
	int x = 0;
	int y = 0;
	printf("������:\n");
	while (1)
	{
		
		x = rand() % row;
		y = rand() % col;
		if (board[x][y] == ' ')
		{
			board[x][y] = '#';
			break;
		}

	}
}


static int IsFull(char board[ROW][COL], int row, int col)
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
	//һ��һ��
	for (i = 0; i < row; i++)
	{
		for (j = 0; j < col-1; j++)
		{
			if (board[i][j] != board[i][j + 1])
			{
				break;
			}
			if (j == col - 2 && board[i][j] != ' ')
				return board[i][j];
			
		}
	}
	//һ��һ��
	for (j = 0; j < col; j++)
	{
		for (i = 0; i < row - 1; i++)
		{
			if (board[i][j] != board[i+1][j])
			{
				break;
			}
			if (i == row - 2 && board[i][j] != ' ')
				return board[i][j];
		}
	}
	//һ��һ��
	for (i = 0;i<row-1; i++)
	{
		if (board[i][i] != board[i + 1][i + 1])
			break;
		if (i == row - 2 && board[i][i] != ' ')
			return board[i][i];
	}
	//һƲһ��
	//                      (0,row-1)
	//         (1,row-1-i)
	//(row-1,0)
	for (i = 1;i<row; i++)
	{
		if (board[i-1][col - i] != board[i][col - i - 1])
			break;
		if (i == row -1 && board[i-1][col - i] !=' ')
			return board[i-1][col - i ];
	}
	if (IsFull(board, ROW, COL) == 1)
	{
		return 'P';
	}
	return 'C';
}

