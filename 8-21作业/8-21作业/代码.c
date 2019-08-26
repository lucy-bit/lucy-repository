#define _CRT_SECURE_NO_WARNINGS 
#include<stdio.h>
#include<assert.h>
#include<stdlib.h>
//int Judge_char(int i)
//{
//	return *(char *)&i;
//}
//int main()
//{
//	int i = 1;
//	int ret = Judge_char(i);
//	if (1 == ret)
//		printf("小端\n");
//	else
//		printf("大端\n");
//		return 0;
//}
//

//1.编写函数：
//unsigned int reverse_bit(unsigned int value);
//这个函数的返回值value的二进制位模式从左到右翻转后的值。
//unsigned int reverse_bit(unsigned int value);
//{
//	//0001
//
//}
//int main()
//{
//	unsigned int n = 0;
//	scanf("%d", &n);
//	reversr_bit(n);
//	return 0;
//}

//2.不使用（a + b） / 2这种方式，求两个数的平均值。
//double average(int a, int b)
//{
//	return 1.0*(a + (b-a) / 2.0);
//}
//int main()
//{
//	int a = 0;
//	int b = 0;
//	scanf("%d%d", &a, &b);
//	printf("%lf", average(a, b));
 
//	return 0;
//}

//3.编程实现：
//一组数据中只有一个数字出现了一次。其他所有数字都是成对出现的。
//请找出这个数字。（使用位运算）

//int main()
//{
//	int arr[9] = { 1, 2, 3, 4, 5, 1, 2, 3, 4 };
//	int i = 0;
//	int result = 0;
//	for (i = 0; i < 9; i++)
//	{
//		result ^= arr[i];
//	}
//	
//	printf("%d\n", result);
//	return 0;
//}



//4.有一个字符数组的内容为:"student a am i",
//			请你将数组的内容改为"i am a student".
//			要求：
//			不能使用库函数。
//			只能开辟有限个空间（空间个数和字符串的长度无关）。
int my_strlen(const char * str)
{
	assert(str != NULL);
	int count = 0;
	while (*str++)
	{
		count++;
	}
	return count;
}

void reverse_string(char* start, char* end)
{
	while (start<end)
	{
		char tmp = *start;
		*start = *end;
		*end = tmp;
		start++;
		end--;
	}
}


void reverse(char * arr, char* len)
{//先将整个字符串逆置，然后从开始找空格字符，找到后将此下标设为start，接着找下个空格字符，将其设为end，逆置这个单词
	reverse_string(arr, len);//haha hehe
	while (*end)
	{
		start = end;
		while (*end != ' ' && *end != '\0')
		{
			end++;
		}
		reverse(start, end);
		if (*end != '\0')
			end--;
	}
}

int main()
{
	char arr[] = "student a am i";
	int sz = my_strlen(arr);
	char * len =arr + sz - 1;
	reverse(arr, len);
	printf("%s\n", arr);
	return 0;
}