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
//		printf("С��\n");
//	else
//		printf("���\n");
//		return 0;
//}
//

//1.��д������
//unsigned int reverse_bit(unsigned int value);
//��������ķ���ֵvalue�Ķ�����λģʽ�����ҷ�ת���ֵ��
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

//2.��ʹ�ã�a + b�� / 2���ַ�ʽ������������ƽ��ֵ��
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

//3.���ʵ�֣�
//һ��������ֻ��һ�����ֳ�����һ�Ρ������������ֶ��ǳɶԳ��ֵġ�
//���ҳ�������֡���ʹ��λ���㣩

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



//4.��һ���ַ����������Ϊ:"student a am i",
//			���㽫��������ݸ�Ϊ"i am a student".
//			Ҫ��
//			����ʹ�ÿ⺯����
//			ֻ�ܿ������޸��ռ䣨�ռ�������ַ����ĳ����޹أ���
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
{//�Ƚ������ַ������ã�Ȼ��ӿ�ʼ�ҿո��ַ����ҵ��󽫴��±���Ϊstart���������¸��ո��ַ���������Ϊend�������������
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