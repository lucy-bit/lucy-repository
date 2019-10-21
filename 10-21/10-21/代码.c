#define _CRT_SECURE_NO_WARNINGS 1

#include<stdio.h>
#include<stdlib.h>
//c语言下的汉诺塔
void move(char pos1, char pos2)
{
	printf("%c -> %c\n", pos1, pos2);
}


//将pos1上的通过pos2 移动到 pos3上面去
void Hanoi(int n, char pos1, char pos2,char pos3)
{
	if (n == 1)
	{
		move(pos1, pos3);
	}
	else
	{
		Hanoi(n - 1, pos1, pos3, pos2);
		move(pos1,pos3);
		Hanoi(n - 1, pos2, pos1, pos3);
	}
}
int main()
{
	int n = 0;
	scanf("%d", &n);
	Hanoi(n, 'A', 'B', 'C');
}
