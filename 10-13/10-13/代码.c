#define _CRT_SECURE_NO_WARNINGS 1
1����̨��
��Ŀ������
һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
˼·������
һֻ������̨��������ѡ��Ҫô��һ����Ҫô�����������Կ����оٳ����¼��������
̨�׼���      	����
1             		1
2             		2
3             		3
4             		5
5             		8
��            		��

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






