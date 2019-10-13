#define _CRT_SECURE_NO_WARNINGS 1
1、跳台阶
题目描述：
一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
思路分析：
一只青蛙跳台阶有两种选择，要么跳一级，要么跳两级，所以可以列举出以下几种情况：
台阶级数      	跳法
1             		1
2             		2
3             		3
4             		5
5             		8
…            		…

#include <iostream>  
using namespace std;

int JumpStep(int n)
{
	if (n <= 0)
		return 0;
	if (n == 1)
		return 0;
	if (n == 2)
		return 1;
	if (n == 3)return 2;
	return JumpStep(n - 1) + JumpStep(n - 2);
}
int main()
{
	int num = 0;
	int n; 
	int * data = (int *)malloc(sizeof(int)*n);
	scanf("%d", &n);
	getchar();
	for (int i = 0; i<n; i++)
	{
		scanf("%d", &data[num++]);
	}
	for (int j = 0; j<n; j++)
	{
		cout << JumpStep(data[j]) << endl; 
	}
	return 0;
}






