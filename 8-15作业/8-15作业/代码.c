#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//int main()
//{
//	/*1.ʵ��һ����������ӡ�˷��ھ����ھ���������������Լ�ָ����
//		����9�����9 * 9�ھ�������12�����12 * 12�ĳ˷��ھ���
//	*/
//	//1*1=1
//	//2*1=2 2*2=4 
//	//3*1=3 3*2=6 3*3=9
//	int n = 0;
//	int i = 0;
//	int j = 0;
//	printf("�������ӡ����:> ");
//	scanf("%d", &n);
//	for (i = 1; i <= n; i++)
//	{
//		for (j = 1; j <= i; j++)
//		{
//			printf("%d*%d=%-2d ", j, i, i*j);
//		}
//		printf("\n");
//	}
//	return 0;
//}

//2.ʹ�ú���ʵ���������Ľ���
//void change(int* a, int* b)
//{
//	int tmp = 0;
//	tmp = *a;
//	*a = *b;
//	*b = tmp;
//}
//int main()
//{
//	int num1 = 0;
//	int num2 = 0;
//	printf("������������:> ");
//	scanf("%d%d", &num1, &num2);
//	change(&num1, &num2);
//	printf("num1 = %d, num2 = %d\n", num1, num2);
//	return 0;
//}

//
////3.ʵ��һ�������ж�year�ǲ������ꡣ
//int Judge(int y)
//{
//	if ((y%4==0 && y%100!=0) || (y%400==0))
//		return 1;
//	return 0;
//}
//int main()
//{
//	int year = 0;
//	printf("���������:>");
//	scanf("%d", &year);
//	if (1 == Judge(year))
//	{
//		printf("������\n");
//	}
//	else
//	{
//		printf("��������\n");
//	}
//
//	return 0;
//}

//4.
//����һ�����飬
//ʵ�ֺ���init������ʼ�����顢
//ʵ��empty����������顢
//ʵ��reverse���������������Ԫ�ص����á�
//Ҫ���Լ���ƺ����Ĳ���������ֵ��
void init(int * arr,int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		arr[i] = i;
	}
}

void empty(int * arr, int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		arr[i] = 0;
	}
}

void reverse(int * arr, int sz)
{
	int arr1[] = { 0 };
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		arr1[i] = arr[i];
	}
	for (i = 0; i < sz; i++)
	{
		arr[i] = arr1[sz - i];
	}
}
int main()
{
	int i = 0;
	int arr[5];
	int sz = sizeof(arr) / sizeof(arr[0]);

	init(arr,sz);
	for (i = 0; i < sz; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");

	reverse(arr, sz);
	for (i = 0; i < sz; i++)
	{
		printf("%d ", arr[i]);
		printf("\n");
	}

	empty(arr,sz);
	for (i = 0; i < sz; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");

	return 0;
}