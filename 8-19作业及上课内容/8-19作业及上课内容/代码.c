#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<assert.h>
//int Fib(int n)
//{
//	if (n <= 2)
//	{
//		return 1;
//	}
//	else
//	return Fib(n - 1) + Fib(n - 2);
//}
//int main()
//{
//	//1.�ݹ�ͷǵݹ�ֱ�ʵ�����n��쳲���������
//	//1 1 2 3 5 8 13 21
//	//1 2 3 4 5 6  7  8
//	
//
//	//�ݹ�
//	int n = 0;
//	scanf("%d", &n);
//	printf("%d",Fib(n));
//	return 0;
//}
//int Fib(int n)
//{
//	//1 1 2 3 5 8 13 21
//	//1 2 3 4 5 6  7  8
//	int a = 1;
//	int b = 1;
//	int c = 0;
//	if (n <= 2)
//		return 1;
//	else
//	{
//		while (n > 2)
//		{
//			c = a + b;
//			a = b;
//			b = c;
//			n--;
//		}
//
//		return c;
//	}
//}
////�ǵݹ�
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	printf("%d",Fib(n));
//	return 0;
//}



////2.��дһ������ʵ��n^k��ʹ�õݹ�ʵ��
//double my_power(int n, int k)
//{
//	if (k == 0)
//		return 1.0;
//	else if (k > 0)
//	{
//		if (k >= 1)
//			return n*my_power(n, k - 1);
//		else
//			return 1.0;
//	}
//	else
//		return 1.0/ my_power(n, -k);
//}
//int main()
//{
//	int n = 0;
//	int k = 0;
//	printf("������n��k:> ");
//	scanf("%d%d", &n, &k);
//	printf("%lf\n", my_power(n, k));
//	return 0;
//}

//3. дһ���ݹ麯��DigitSum(n)������һ���Ǹ����������������������֮�ͣ�
//���磬����DigitSum(1729)����Ӧ�÷���1 + 7 + 2 + 9�����ĺ���19
//int DigitSum(int n)
//{
//	int sum = 0;
//	if (n / 10 != 0)
//		sum = DigitSum(n / 10) + n % 10;
//	else
//		return n % 10;
//	return sum;
//}
//int main()
//{
//	unsigned int n = 0;
//	scanf("%d", &n);
//	printf("%d\n", DigitSum(n));
//	return 0;
//}
//

//4. ��дһ������ reverse_string(char * string)���ݹ�ʵ�֣�
//ʵ�֣��������ַ����е��ַ��������С�
//Ҫ�󣺲���ʹ��C�������е��ַ�������������
//int my_strlen(const char *str)
//{
//	assert(str != NULL);
//	int count = 0 ;
//	while (*str++)
//	{
//		count++;
//	}
//	return count;
//}
//void reverse_string(char *str)
//{
//	int len = my_strlen(str);
//	char tmp = *str;
//	int sz = 0;
//	*str = *(len + str - 1);//�Ƚ�a��f�������ٽ�֮��Ĳ���Ҳ���������ǽ�f�ŵ���ʼλ�ú�Ҫ�Ƚ�ĩβ��Ϊ\0��������������м��ַ����ĳ���
//	*(len + str - 1) = '\0';
//	sz = my_strlen(str + 1);
//	if (sz>=2)
//	reverse_string(str + 1);//ע�⣺�����str+1������++str����str++�滻����Ϊ++�ǲ���������ʹstr��ֵ�����ı䣬Ӱ���������
//	*(len + str - 1) = tmp;
//}
//int main()
//{
//	char arr[] = "abcdef";
//	reverse_string(arr);
//	printf("%s\n", arr);
//	return 0;
//}


//5.�ݹ�ͷǵݹ�ֱ�ʵ��strlen
////�ݹ�
//int my_strlen(char *str)
//{
//	if (*str != '\0')
//	return my_strlen(++str) + 1;
//	return 0;
//}
//�ǵݹ�
//int my_strlen(char *str)
//{
//	int count = 0;
//	while(*str != '\0')
//	{
//		count++;
//		str++;
//	}
//	return count;
//}
//int main()
//{
//	char arr[] = "abc";
//	printf("%d\n", my_strlen(arr));
//
//	return 0;
//}
//
//6.�ݹ�ͷǵݹ�ֱ�ʵ����n�Ľ׳�
//int Fac(int n)
//{
//	int sum = 1;
//	while (n != 0)
//	{
//		sum *= n;
//		n--;
//	}
//	
//	return sum;
//}
//int Fac(int n)
//{
//	int sum = 1;
//	if (n != 0)
//	sum = Fac(n - 1)*n;
//
//	return sum;
//}
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	printf("%d", Fac(n));
//	return 0;

//}
//7.�ݹ鷽ʽʵ�ִ�ӡһ��������ÿһλ
//void print(int n)
//{
//	if (n / 10 != 0)
//	{
//		print(n / 10);
//	}
//		printf("%d ", n % 10);
//
//}
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	print(n);
//	return 0;
//}

//1.
//дһ���������ز����������� 1 �ĸ���
//���磺 15 0000 1111 4 �� 1
//����ԭ�ͣ�
//int count_one_bits(unsigned int value)
//{
//	// ����1��λ�� 
//}
//int count_one_bits(unsigned int n)
//{
//	int i = 0;
//	int count = 0;
//	for (i = 0; i < 32; i++)
//	{
//		if ((n >> i) & 1 == 1)
//		{
//			count++;
//		}
//	}
//	return count;
//}
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	printf("%d",count_one_bits(n));
//	return 0;
//}

//2.��ȡһ�������������������е�ż��λ������λ��
//�ֱ�������������С�
//void Output_Binary(int n)
//{
//	//00000101  0000 1010
//	//5 10
//	//even ż��0011 0000
//	//odd ����0000  0011
//	int i = 0;
//	printf("��ӡ����λ:\n");
//	for (i = 31; i > 0; i-=2)
//	{
//		if (((n >> i)&1) == 1)
//		{
//			printf("1");
//		}
//		else
//			printf("0");
//	}
//	printf("\n");
//	printf("��ӡż��λ:\n");
//	for (i = 30; i >= 0; i -= 2)
//	{
//		if (((n >> i)&1 )== 1)
//		{
//			printf("1");
//		}
//		else
//			printf("0");
//	}
//}
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	Output_Binary(n);
//	return 0;
//}

//
////3. ���һ��������ÿһλ��
//void Output(int n)
//{
//	if (n/10 != 0)
//	Output(n / 10);
//	printf("%d ", n % 10);
//
//}
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	Output(n);
//	return 0;
//}

//4.���ʵ�֣�
//����int��32λ������m��n�Ķ����Ʊ���У��ж��ٸ�λ(bit)��ͬ��
//�������� :
//1999 2299
//������� : 7
//int binary_different(unsigned int i, unsigned int j)
//{
//	int count = 0;
//	int tmp = 0;
//	int n = 0;
//	tmp = i^j;
//	for (n = 0; n < 32; n++)
//	{
//		if (1 == ((tmp >> n) & 1))
//			count++;
//	}
//	return count;
//	
//}
//int main()
//{
//	int i = 0;
//	int j = 0;
//	scanf("%d%d", &i, &j);
//	printf("%d\n",binary_different(i,j));
//	return 0;
//}