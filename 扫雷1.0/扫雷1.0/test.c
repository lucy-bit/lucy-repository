#define _CRT_SECURE_NO_WARNINGS 1
#include "game.h"
void menu()
{
	printf("****************************");
	printf("****      1.play        ****");
	printf("****      0.exit        ****");
	printf("****************************");

}
void game()
{

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
			printf("ÍË³öÓÎÏ·\n");
			break;
		default:
			printf("Ñ¡Ôñ´íÎó\n");
			break;
		}
	} while (input);
}
int main()
{
	test();
	return 0;
}