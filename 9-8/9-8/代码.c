#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<errno.h>
#include<string.h>
int main()
{
	FILE* pf = fopen("test.txt", "w");
	if (pf == NULL)
	{
		printf("%s\n", strerror(errno));
		return 0;
	}
	//写文件
	fputc('b', pf);
	fputc('i', pf);
	fputc('t', pf);
	//关闭文件
	fclose(pf);
	pf = NULL;
	return 0;
}