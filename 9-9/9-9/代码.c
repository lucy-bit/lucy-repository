#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	//转义字符的使用
	printf("\"");
	//\t是水平制表符，转义字符
	printf("c:test\60\test_9_9\test.c");
	return 0;
}

int main() {
	FILE * pFile;  long size;
	pFile = fopen("myfile.txt", "rb");  if (pFile == NULL) perror("Error opening file");  else  {
		fseek(pFile, 0, SEEK_END);   // non-portable    size=ftell (pFile);    fclose (pFile);    printf ("Size of myfile.txt: %ld bytes.\n",size);  }  return 0; 
	}