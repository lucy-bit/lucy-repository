#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//char *GetMemory(void)
//{ 
//	char p[] = "hello world";
//	return p;
//}
//void Test(void) 
//{ 
//	char *str = NULL;  
//	str = GetMemory(); 
//	printf(str); 
//}
//
//int main()
//{
//	Test();
//	return 0;
//}

 int* test()

{

	int a = 10;

	return &a;

}



int main()

{

	int*p = test();

	//printf("hehe\n");
	printf("%d\n", *p);

	return 0;

}

