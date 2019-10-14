#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<math.h>
//
////十进制转化为二进制
//void Switch1(int num)
//{
//	int i = 0;
//	int shang = num;
//	int yushu = 0;
//	int sum = 0;
//	while (shang)
//	{
//		sum += (shang % 2) * pow(10, i);
//		shang /= 2;
//		i++;
//	}
//	printf("%d", sum);
//}

//十进制转换为十六进制
void Switch2(int num)
{
	char arr[] = {'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	int i = 0;
	int shang = num;
	int yushu = 0;
	int ret[] = 0;
	while (shang)
	{
		i = shang % 16;
		if (i > 9)
		{

		}
		shang /= 16;
		i++;
	}
}
int main()
{
	int num = 0;
	scanf("%d", &num);
	Switch1(num);
	Switch2(num);
	return 0;
}