#define _CRT_SECURE_NO_WARNINGS 1
int main()
{
	int a = 10;
	int b = 0;
	b = a += a *= a -= a/3;
	printf("%d",b);
	return 0;
}