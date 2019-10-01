#define _CRT_SECURE_NO_WARNINGS 1
//#include<stdio.h>
//
//int Check_end(int i)
//{
//	char* p = (char*)&i;
//	return *p;
//}
//int main()
//{
//	int ret = 0;
//	ret = Check_end(1);
//	if (1 == ret)
//	{
//		printf(" It is little-endian\n");
//	}
//	else
//	{
//		printf("It is big-endian\n");
//	}
//		return 0;
//}
//
//struct S 
//{ int data[1000];    int num; };
//struct S s = { { 1, 2, 3, 4 }, 1000 };
//void print1(struct S s) 
//{    printf("%d\n", s.num); }
//void print2(struct S* ps)
//{    printf("%d\n", ps->num); }
//int main()
//{
//	print1(s); 
//	print2(&s);
//	return 0; 
//} 
//#include <stdio.h> 
//void Swap1(int x, int y)
//{   
//	int tmp = 0; 
//	tmp = x;  
//	x = y;  
//	y = tmp;
//}
//void Swap2(int *px, int *py)
//{   
//	int tmp = 0;  
//	tmp = *px; 
//	*px = *py;
//
//	*py = tmp;
//}
//int main() 
//{
//	int num1 = 1; 
//	int num2 = 2; 
//	Swap1(num1, num2); 
//	printf("Swap1::num1 = %d num2 = %d\n", num1, num2); 
//	Swap2(&num1, &num2);  
//	printf("Swap2::num1 = %d num2 = %d\n", num1, num2); 
//	return 0; 
//} 