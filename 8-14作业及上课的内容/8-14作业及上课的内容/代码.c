#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
//1.��ɲ�������Ϸ��
//void menu()
//{
//	printf("*************************\n");
//	printf("****      1.play     ****\n"); 
//	printf("****      0.exit     ****\n");
//	printf("*************************\n");
//}
//void game()
//{
//	int randam_num = rand()%100+1;
//	int guess = 0;
//	while (1)
//	{
//		printf("��������Ҫ�µ����֣�");
//		scanf("%d", &guess);
//		if (guess > randam_num)
//			printf("�´���\n");
//		else if (guess < randam_num)
//			printf("��С��\n");
//		else
//		{
//			printf("�¶���\n");
//			break;
//		}
//	}
//}
//int main()
//{
//		int input = 0;
//		srand((unsigned int)time(NULL));

//		do
//		{
//			menu();
//			printf("��ѡ��");
//			scanf("%d", &input);
//			switch (input)
//			{
//			case 1:
//				game();
//				break;
//			case 0:
//				break;
//			default:
//				printf("ѡ��������������룡\n");
//					break;
//			}
//		} while (input);
//	return 0;
//}


//2.д����������������������в�����Ҫ�����֣�
//�ҵ��˷����±꣬�Ҳ������� - 1.���۰���ң�
//int binary_search(int *arr, int k, int sz)
//{
//	int left = 0;
//	int right = sz - 1;
//	int mid = 0;
//	while (left <= right)
//	{
//		mid = left + (right - left) / 2;
//		if (arr[mid] < k)
//		{
//			left = mid + 1;
//		}
//		else if (arr[mid] > k)
//		{
//			right = mid - 1;
//		}
//		else
//			return mid;
//	}
//	return -1;
//}
//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int k = 0;
//	int ret = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	printf("��������Ҫ���ҵ�����:> ");
//	scanf("%d", &k);
//	ret = binary_search(arr,k,sz);
//	if (-1 == ret)
//	{
//		printf("�Ҳ���\n");
//	}
//	else
//	{
//		printf("�ҵ������±�Ϊ%d\n", ret);
//	}
//	system("pause");
//	return 0;
//}


//3.��д����ģ��������������ĳ�����
//����������������룬������ȷ����ʾ����¼�ɹ���, �������
//�����������룬����������Ρ����ξ�������ʾ�˳�����

//int main()
//{
//	int i = 0;
//	char mima[20] = { "123456" };
//	char password[20] = { 0 };
//	for (i = 0; i < 3; i++)
//	{
//		printf("����������:> ");
//		scanf("%s", password);
//		if (strcmp(password, mima) == 0)
//		{
//			printf("������ȷ\n");
//			break;
//		}
//		else
//		{
//			printf("���벻��ȷ������������\n");
//		}
//	}
//	if (i == 3)
//	{
//		printf("���벻��ȷ��ʧȥ����\n");
//	}
//	system("pause");
//	return 0;
//}

//
//4.��дһ�����򣬿���һֱ���ռ����ַ���
//�����Сд�ַ��������Ӧ�Ĵ�д�ַ���
//������յ��Ǵ�д�ַ����������Ӧ��Сд�ַ���
//��������ֲ������

int main()
{
	int ch = 0;
	printf("������һ���ַ�:> ");
	while ((ch = getchar()) != EOF)
	{
		if ('a' <= ch && ch <= 'z')
		{
			putchar(ch - 32);
		}
		else if ('A' <= ch && ch <= 'Z')
		{
			putchar(ch + 32);
		}
		else if ('0' <= ch && ch <= '9')
			printf("�����֣������\n");
		else
			putchar(ch);
	}
	
	system("pause");
	return 0;
}
