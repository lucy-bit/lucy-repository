#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
int main()
{
//	//1.����Ļ���������
	//int i = 0;
	//int j = 0;
	//int line = 0;
	//printf("����������: ");
	//scanf("%d", &line);
	//for (i = 0; i < line; i++)
	//{
	//	//��ӡ�ո�
	//	for (j = 0; j < line - i-1; j++)
	//	{
	//		printf(" ");
	//	}
	//	for (j = 0; j < 2 * i + 1; j++)
	//	{
	//		printf("*");
	//	}
	//	printf("\n");

	//}
	//for (i = 0; i < line - 1; i++)
	//{
	//	for (j = 0; j < i + 1; j++)
	//	{
	//		printf(" ");
	//	}
	//	for (j = 0; j < (line -1- i) * 2 - 1; j++)
	//	{
	//		printf("*");
	//	}

	//	printf("\n");
	//}




	int line = 0;
	int n = 0;
	int i = 0;
	scanf("%d", &n);

	for (line = 0; line <= n; line++)
	{
		//��ӡ�ո�
		for (i = n-line; i > 0; i--)
		{
			printf(" ");
		}
		//��ӡ*
		for (i = 1; i <= (2 * line - 1); i++)
		{
			printf("*");
		}
		printf("\n");
	}
	for (line = n-1; line > 0; line--)
	{
		//��ӡ�ո�
		for (i = 1; i <= n-line; i++)
		{
			printf(" ");
		}
		//��ӡ*
		for (i = 1; i <= (2 * line - 1); i++)
		{
			printf("*");
		}
		printf("\n");
	}



	system("pause");
	return 0;
}





//2.���0��999֮������С�ˮ�ɻ������������
//��ˮ�ɻ�������ָһ����λ�������λ���ֵ�������ȷ�õ��ڸ��������磻153��1��5��3 ? ����153��һ����ˮ�ɻ�������

/*
�������У�ˮ�ɻ�����Narcissistic number��Ҳ��Ϊ������������������ķ˹׳����ķ˹��������Armstrong number������ָһNλ�����������֮N�η��͵��ڸ�����
����153��370��371��407������λ����ˮ�ɻ������������֮�����͵��ڸ�����
153 = 1^3 + 5^3 + 3^3��
370 = 3^3 + 7^3 + 0^3��
371 = 3^3 + 7^3 + 1^3��
407 = 4^3 + 0^3 + 7^3��
*/
//#include<math.h>
//int main()
//{
//	int i = 0; 
//
//	int tmp = 0;
//	for (i = 1; i <= 1000000; i++)
//	{
//		//����λ��
//		//123
//		int count = 0;
//		int sum = 0;
//		tmp = i;
//		while (tmp)
//		{
//			tmp /= 10;
//			count++;
//		}
//		tmp = i;
//		while (tmp)
//		{
//			sum += pow(tmp%10, count);
//			tmp /= 10;
//		}
//		if (sum == i)
//		{
//			printf("%d ", i);
//		}
//	}
//	system("pause");
//	return 0;
//}






/*3.
��Sn = a + aa + aaa + aaaa + aaaaa��ǰ5��֮�ͣ�����a��һ�����֣�
���磺2 + 22 + 222 + 2222 + 22222*/
//����24690
//#include<math.h>
//int main()
//{
//	int a = 0;
//	int i = 0;
//	int sum = 0;
//	int n = 0;
//	int tmp = 0;
//	printf("������һ������:> ");
//	scanf("%d", &a);
//	/*for (i = 0; i < 5; i++)
//	{
//		n += pow(10, i)*a;
//		sum += n;
//	}*/
//	//����
//	for (i = 0; i < 5; i++)
//	{
//		tmp = tmp * 10 + a;
//		sum += tmp;
//	}
//
//
//
//	printf("sum == %d\n", sum);
//	system("pause");
//	return 0;
//}