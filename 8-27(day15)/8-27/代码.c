#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<assert.h>

	/*1.һ��������ֻ�����������ǳ���һ�Σ�
		�����������ֶ����������Ρ�
		�ҳ����������֣����ʵ�֡�*/
//˼·������������λ�����һ��ȷ��������λΪ1��λ����Ȼ�󰴴˷��飬ʹ��5��6һ���ᱻ������������ٽ��������ְ�λ�����һ�����õ��ľ���5��6
void Find_two_dif(int* p1, int* p2,int sz,int arr[])
{
	int i = 0;
	int tmp = 0;
	int pos = 0;
	//����������������λ�����һ��
	for (i = 0; i < sz; i++)
	{
		tmp ^= arr[i];
	}
	//�ҳ���λ�������������һλΪ1
	for (i = 0; i < sz; i++)
	{
		if (1 == ((tmp>>i)&1))
		{
			pos = i;
			break;
		}
	}
	//����
	for (i = 0; i < sz; i++)
	{
		if (((arr[i]>>pos)&1) == 1)
		{
			*p1 ^= arr[i];
		}
		/*else
		{
			*p2 ^= arr[i];
		}*/
		//����
	}
	*p2 = tmp^*p1;
}
int main()
{
	int arr[20] = {1,2,3,4,5,1,2,3,4,6};
	int num1 = 0;
	int num2 = 0;
	int sz = sizeof(arr) / sizeof(arr[0]);
	Find_two_dif(&num1, &num2,sz,arr);
	printf("%d %d", num1, num2);
	return 0;
}


		/*2.����ˮ��1ƿ��ˮ1Ԫ��2����ƿ���Ի�һƿ��ˮ��
		��20Ԫ�����Զ�����ˮ��
		���ʵ�֡�*/
		//int n = 0;
		//int empty = 0;
		//int money = 0;
		//int total = 0;
		//scanf("%d", &money);
		//total = money;
		//empty = money;
		//while (empty > 1)
		//{
		//	total += empty / 2;
		//	empty = empty / 2 + empty % 2;
		//}
		////�����й��ɿɿ�����total������2*money-1
		////total = 2*money - 1;
		//printf("total = %d", total);
		




		/*3.ģ��ʵ��strcpy*/
//
//	char * my_strcpy(const char *arr1, char *arr2)
//	{
//		char* ret = arr2;
//		assert(arr1 && arr2);
//		while (*arr2++ = *arr1++)
//		{
//			;
//		}
//		return ret;
//	}
//int main()
//{
//
//	char arr1[20] = "abcdef";
//	char arr2[20] = { 0 };
//	printf("%s",my_strcpy(arr1,arr2));
//	return 0;
//}





/*4.ģ��ʵ��strcat*/
//char * my_strcat(char * des,const char * src)
//{
//	char * ret = des;
//	assert(des && src);
//	while (*des++)
//	{
//		;
//	}
//	
//	while (*des++ = *src++)
//	{
//		;
//	}
//	return ret;
//}
//int main()
//{
//	char arr1[20] = "abcdef";//[]�ڵ����ֱ�����д��ʹ��Ŀ������Ŀռ��㹻��
//	char arr2[] = "123";
//	printf("%s\n", my_strcat(arr1, arr2));
//	return 0;
//}