#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<assert.h>

	/*1.һ��������ֻ�����������ǳ���һ�Σ�
		�����������ֶ����������Ρ�
		�ҳ����������֣����ʵ�֡�*/
	//char arr[20] = "1,2,3,4,5,1,2,3,4,6";



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
char * my_strcat(char * des,const char * src)
{
	char * ret = des;
	assert(des && src);
	while (*des++)
	{
		;
	}
	
	while (*des++ = *src++)
	{
		;
	}
	return ret;
}
int main()
{
	char arr1[20] = "abcdef";//[]�ڵ����ֱ�����д��ʹ��Ŀ������Ŀռ��㹻��
	char arr2[] = "123";
	printf("%s\n", my_strcat(arr1, arr2));
	return 0;
}