//#define _CRT_SECURE_NO_WARNINGS 1
//size_t My_strlen(const char* str){ assert(str);	
//size_t count = 0;	while (*str++)	{ ++count; }
//return count;
//}
//
//int main()
//{ 
//	char str[] = "qweryu vvvvvvvvvvvvv";	
//	printf("str:%d\n", My_strlen(str));
//	system("pause");
//	return 0; 
//}

#include<stdio.h>
#include<assert.h>
int my_strlen(const char *str)
{
	int count = 0;	
	assert(str!=NULL);
	while(*str!='\0')
	{	
		str++;		
		count++;
	}
	return count;
}
int main()
{	
	int ret = 0;
	char arr[10]="abcdefgh";
	ret = my_strlen(arr);	
	
	printf("%d\n",ret);
	return 0;
}

