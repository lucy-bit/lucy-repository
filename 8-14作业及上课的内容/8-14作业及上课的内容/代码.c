#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
//1.完成猜数字游戏。
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
//		printf("请输入你要猜的数字：");
//		scanf("%d", &guess);
//		if (guess > randam_num)
//			printf("猜大了\n");
//		else if (guess < randam_num)
//			printf("猜小了\n");
//		else
//		{
//			printf("猜对了\n");
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
//			printf("请选择：");
//			scanf("%d", &input);
//			switch (input)
//			{
//			case 1:
//				game();
//				break;
//			case 0:
//				break;
//			default:
//				printf("选择错误，请重新输入！\n");
//					break;
//			}
//		} while (input);
//	return 0;
//}


//2.写代码可以在整型有序数组中查找想要的数字，
//找到了返回下标，找不到返回 - 1.（折半查找）
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
//	printf("请输入想要查找的数字:> ");
//	scanf("%d", &k);
//	ret = binary_search(arr,k,sz);
//	if (-1 == ret)
//	{
//		printf("找不到\n");
//	}
//	else
//	{
//		printf("找到啦，下标为%d\n", ret);
//	}
//	system("pause");
//	return 0;
//}


//3.编写代码模拟三次密码输入的场景。
//最多能输入三次密码，密码正确，提示“登录成功”, 密码错误，
//可以重新输入，最多输入三次。三次均错，则提示退出程序。

//int main()
//{
//	int i = 0;
//	char mima[20] = { "123456" };
//	char password[20] = { 0 };
//	for (i = 0; i < 3; i++)
//	{
//		printf("请输入密码:> ");
//		scanf("%s", password);
//		if (strcmp(password, mima) == 0)
//		{
//			printf("密码正确\n");
//			break;
//		}
//		else
//		{
//			printf("密码不正确，请重新输入\n");
//		}
//	}
//	if (i == 3)
//	{
//		printf("密码不正确，失去机会\n");
//	}
//	system("pause");
//	return 0;
//}

//
//4.编写一个程序，可以一直接收键盘字符，
//如果是小写字符就输出对应的大写字符，
//如果接收的是大写字符，就输出对应的小写字符，
//如果是数字不输出。

int main()
{
	int ch = 0;
	printf("请输入一个字符:> ");
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
			printf("是数字，不输出\n");
		else
			putchar(ch);
	}
	
	system("pause");
	return 0;
}
