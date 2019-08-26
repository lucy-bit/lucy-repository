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
	//∆Â≈Ã≥ı ºªØ
	Initboard(mine, ROWS, COLS,'0');
	Initboard(show, ROWS, COLS,'*');
	//¥Ú”°∆Â≈Ã
	Displayboard(show, ROW, COL);
	//¬Ò¿◊
	SetMine(mine, ROWS, COLS);


}
void test()
{
	int input = 0;
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
			printf("ÕÀ≥ˆ”Œœ∑\n");
			break;
		default:
			printf("—°‘Ò¥ÌŒÛ\n");
			break;
		}
	} while (input);
}
int main()
{
	test();
	return 0;
}