#define _CRT_SECURE_NO_WARNINGS 1
#include "contact.h"
//��װͨѶ¼�ṹ��(ʹ���Ժ󴫲δ�����ṹ�����)�����Ҽǵó�ʼ���ṹ�壨��дһ����ʼ���������봫��ַ��
//ɾ���������ж�ͨѶ¼�Ƿ�Ϊ�գ�sz == 0��
//��Ϊ��������������Ҫ���Һ�������������дһ�����Һ���
//ɾ��������ɾ��������һ���ǽ�ɾ�����Ԫ����ǰ�������һ���滻
void menu()
{
	printf("***********************************\n");
	printf("****     1.Add     2.Delete    ****\n");
	printf("****     3.Modify  4.Search    ****\n");
	printf("****     5.Show    0.Exit      ****\n");
	printf("***********************************\n");
}
int main()
{
	int input = 0;
	Contact con;
	Init(&con);
	do
	{
		menu();
		scanf("%d", &input);
		switch (input)
		{
		case Add:
			AddContact(&con);
			break;
		case Delete:
			DeleteContact(&con);
			break;
		case Modify:
			ModifyContact(&con);
			break;
		case Search:
			break;
		case Show:
			ShowContact(&con);
			break;
		case Exit:
			printf("�˳���Ϸ\n");
			break;
		default:
			printf("ѡ���������������\n");
			break;
		}
	} while (input);
	return 0;
}