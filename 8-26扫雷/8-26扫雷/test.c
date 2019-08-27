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
	char mine[ROWS][COLS] = { 0 };//����׵���Ϣ
	char show[ROWS][COLS] = { 0 };//�Ų�����׵���Ϣ
	InitBoard(mine, ROWS, COLS, '0');//'0'
	InitBoard(show, ROWS, COLS, '*');//'*'
	DispalyBoard(show, ROW, COL);
	SetMine(mine, ROW, COL);//������
	DispalyBoard(mine, ROW, COL);
	FindMine(mine, show, ROW, COL);//����

	int ret = 0;
	init_mine();//��ʼ��������̺����������
	set_mine();//����������̲���
	print_mine();//��ӡ��������̣��ɲ���ӡ��
	printf("\n");
	print_player();//��ӡ�������
	start = clock();
	safe_mine();//�����һ�α�ը��

	if (count_show_mine() == COUNT)//һ����Ӯ�����
	{
		print_mine();
		printf("���Ӯ��\n\n");
		return;
	}print_player();////��ӡ�������

	while (1)//ѭ��ɨ��
	{
		int ret = sweep_mine();//ɨ��,�ȵ��׷���1��û�вȵ��׷���0
		if (count_show_mine() == COUNT)//��������̵�'*'����Ϊ����ʱ��ɨ����ɣ���Ϸʤ��
		{
			print_mine();//��ӡ���������
			printf("���Ӯ��\n\n");
			finish = clock();//ȡ����ʱ��
			printf("��ʱ%d ��\n", (int)(finish - start) / CLOCKS_PER_SEC);
			break;
		}
		if (ret)//�ж��Ƿ�ȵ���
		{
			printf("����ը��\t");
			finish = clock();//ȡ����ʱ��
			printf("��ʱ%d ��\n", (int)(finish - start) / CLOCKS_PER_SEC);
			print_mine();//��ӡ���������鿴�׵ķֲ�
			break;
		}print_player();//��ӡ�������
	}
}


int main()
{
	srand((unsigned int)time(NULL));//���������������
	int input = 0;
	menu();//�˵�
	do
	{
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			game();
			break;
		case 0:
			printf("�˳���Ϸ\n");
			break;
		default:
			printf("���������������\n");
			break;
		}
	} while (input);
	return 0;
}