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
	//д�ļ�
	fputc('b', pf);
	fputc('i', pf);
	fputc('t', pf);
	//�ر��ļ�
	fclose(pf);
	pf = NULL;
	return 0;
}