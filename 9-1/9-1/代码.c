#define _CRT_SECURE_NO_WARNINGS 1
#include<string.h>
#include<stdio.h>
#include<errno.h>
#include<assert.h>
//
//void* my_memcpy(void* des, const void* src, size_t sz)
//{
//	void * ret = des;
//	assert(des && src);
//	while (sz--)
//	{
//		*(char*)des = *(char*)src;
//		++(char*)des;//��Ϊ++�����ȼ�Ҫ���ڣ�����Ҳ����д��((char*)des)++
//		++(char*)src;
//	}
//	return ret;
//}
//int main()
//{
////	/*char str[] = "nan@123.hebei";
////	char* ret = NULL;
////	char tmp[20] = { 0 };
////	char* sep = "@.";
////	for (ret = strtok(str, sep); ret != NULL; ret = strtok(NULL, sep))
////	{
////		printf("%s\n", ret);
////	}*/
////
////
////	//FILE* pf = fopen("test.txt", "r");
////	//if (pf != NULL)
////	//{
////	//	printf("%s\n", strerror(errno));
////	//	return 0;
////	//}
////	////���ļ�
////	////�ر��ļ�
////	//fclose(pf);
////	//pf = NULL;
////
////
////
//	int arr1[10] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//	int arr2[10] = { 0 };
//	int i = 0;
//	memcpy(arr2, arr1, 40);
////	my_memcpy(arr2, arr1, 20);
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ", arr2[i]);
//	}
//	return 0;
//}

//
//void* my_memmove(void* dest, const void* src, size_t count)
//{
//	void* ret = dest;
//	assert(dest && src);
//	//���������
//	//��Ŀ��ռ���Դ�ռ�֮ǰ����ǰ���󿽱�����Ŀ��ռ���Դ�ռ�֮�󣬴Ӻ���ǰ����
//	if (dest < src)
//	{
//		//��ǰ����
//		while (count--)
//		{
//			*((char*)dest) = *(char*)src;
//			++(char*)dest;
//			++(char*)src;
//		}
//	}
//	else
//	{
//		//�Ӻ���ǰ
//		while (count--)
//		{
//			*((char*)dest + count) = *((char*)src + count);
//		}
//	}
//	return ret;
//}
//int main()
//{
//	int arr1[10] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//	int arr2[10] = { 0 };
//	int i = 0;
//	//memmove(arr1+2, arr1, 20);
//	//arr1+2��&arr1[2]��Ч����ͬ
//
//	//ʵ��my_memmove
//	my_memmove(arr1 + 2, arr1, 20);
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ", arr1[i]);
//	}
//	return 0;
//}



int main()
{
	char arr[] = "abcdef";
	char arr1[10] = { 0 };
	int i = 0;
	memcpy(arr1, arr+5, 10);
	for (i = 0; i < 10; i++)
	{
		printf("%s ", arr[i]);
	}
	return 0;
}
