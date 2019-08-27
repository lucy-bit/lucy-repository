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
	//����һ��������Χ�м�����
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

void Unfold(char mine[ROWS][COLS],char show[ROWS][COLS],int x,int y��int row, int col )
{
	int count = GetMineCount(mine, x, y);
	int offset_x = 0;
	int offset_y = 0;
	//�ж������Ƿ�Ϸ�������ϵľͲ�չ����
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
		printf("������Ҫ�Ų������:>");
		scanf("%d%d", &x, &y);
		if (x >= 1 && x <= row && y >= 1 && y <= col)
		{
			if (mine[x][y] == '1')
			{
				printf("���ź����㱻ը����\n");
				Displayboard(mine, row, col);
				break;
			}
			else
			{
				//����ը����
				//�����ף���Χû����չ��
				//�����ף���Χ���ײ�չ��
				int count = GetMineCount(mine, x, y);
				Unfold(mine, show, x, y, row, col);
				//������ȷ�������ף�����һ�ж�Ӧ�����꿪ʼ��ʱ���ж�
				//�����ף�������һ�����꣬������
				//��������(�ж�Ϊ0)���Ӷ�Ӧ�������չ������Χ�ж�,�жϹ�����
				//������ΧһȦ���ǲ�Ϊ0������

				


				show[x][y] = count + '0';
				Displayboard(show, row, col);
				win++;
			}
		}
		else
		{
			printf("����Ƿ�����������!\n");
		}
	}
	if (win == row*col - DEFAULT_COUNT)
	{
		printf("��ϲ�㣬���׳ɹ�\n");
		Displayboard(mine, row, col);
	}
}

