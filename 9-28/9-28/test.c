#define _CRT_SECURE_NO_WARNINGS 1


JDK->Java Development Kit Java�������߰�
JRE->Java runtime Environment Java���л���
JVM->Java Viture machine Java�����
���˽�������ã�������������������
�������ߵĹ�ϵ��

windows + r ��  ��cmd���
windows + e �� ���ļ���Դ����������

dir��ʾ�ļ����µ�����

javac Test.java(�ļ���)->���б�������.class�ļ����������ֽ����ļ���
java Test(�ļ���)->����

Java���������ԣ�
һ�α��룬�������� ����Ϊ���е�Java����������ܵ�JVM�ϣ�JVM���е�JDK�ϣ�����ֻҪ����ϵͳ�ϰ�װ��JDK����������
��ƽ̨




��ŵ������ϵ
���岿����ɣ������豸������豸�������������������ڴ洢��
�����豸�����̵�
����豸����Ļ��
��������ִ������
�������������߼�
�ڴ洢����

��洢��������(E�̣�F�̣�D����Щ) ��U�̣�����

����һ����hello world�� ��������豸���� �ڴ洢�� ���� ����豸 ����ʾ����
I / O��������豸

���һ������δ��ʼ��������Ҳ����ͨ����c�����п��Ա��룬����ŵ������ֵ
*************************************************************************************************************
//��ע��
/*

*/��ע��
1. public->������
2. class->�����ࡣ�ṹ��ĸ���汾����
��߸�����������
��һ��.java�ļ����棬ֻ����һ��public���ε���
����һ��Ҫ���ļ���һ��
3. class{ ���壨���� ������ }
4. main����->�ֽ�main����
5. public static  ���������⣺Ϊʲômain������static�����Σ���
6. static�� ��̬�ġ� Java����static�����÷ǳ���
7. String[] args : ��������->�ַ�������
c : int arr[10];       Java: int[] arr = ...
	c������û���ַ������ͣ�Java�е��ַ���������String
	8. main�����Ĳ���������ʲô��
	9.System.out.println("Hello Java20!");
("Hello Java20!")  �� �ַ���(Java�е��ַ���û��\0��
	System.out.println->�൱��c�е�printf();
println(10)����� �� ����
print(10) : ֻ���
printf("%d\n", 10)
10. javac - encoding UTF - 8(��Сд)�ļ���.java



Windows(GBK���б���)
Linux(UTF8���б���)
���� ���� ��Ҫһһ��Ӧ

����ڴ����������������ĵĶ������ڱ����ʱ���������
javac - encoding UTF - 8(��Сд����)Test.java    ��ָ�����ı�����ʽ��UTF - 8


ascii�����255��ֵ������ǰ128��
Unicode������󣬰���ascii���
һ�����������ֽ�

ֻ��char���޷��ŵģ����������з��ŵ�����
Java��charռ2���ֽ�(���Դ�ӡ����)��û�и�����ֻ��ʾ�ַ� ��Χ��0 - 65535
Java��û��ascii����ĸ���
�����з��ŵģ�û���޷��ŵ�

byte->�ֽ����� �Ա����c�������char����
��Χ�� - 128 ����127��������ֳ��������Χ�����ܱ��룬�ᱨ������ȫ�ԣ�
Byte.MAX_VALUE

������short��
//2���ֽ�  16λ  15 ��-2^15 �� 2^15-1)

****************************************************************************
Java���е��������ͣ��������ͣ���8�֣��������⣩
int 4
long 8
double 8
float 4
char 2
byte 1
short 2
boolean   Java�淶��û�й涨��ȷ�Ĵ�С(c������û�У�c++���У�
ע�⣺String���ǻ������ͣ�������������
c���ԣ���0Ϊ��  0Ϊ��
Java��boolean��ʾ��ͼ�
boolean bool = true / false(ֻ�ܶ���Ϊ����)

*****************************************************************************
String ��������
String str = "\"Java 20"\";
\ת���ַ�
�ַ���ƴ�ӣ�ֱ���� +

int a = 10;
("a = " + a)   ���a = 10               ֻҪ ��������ַ������Ϳ�������׷��
String str1 =

��ע���в���Ƕ�׿�ע��

c����const char a = 10���峣��
Java����final���峣��  final int a = 10   ����ֵ���ܱ��޸ġ����ǿ����ڶ����ʱ�򲻸���ʼֵ�����ǵ�����һ�������µ�ֵ�󣬾Ͳ��ܽ��ж��θ�ֵ��
��final�����εı�����Ϊ������ֻ�ܸ�ֵһ�β��ܽ��ж��θ�ֵ

final int a;
a = 10;//����





��Java�У������͸�С���ͱ���ǿ������ת��
С�ĸ���ģ���ʽ��ת��
int a = 10;
double b = 20.0;
a = (int)b;//ǿת
b = a;//����ת��


char boolean ������������
boolean���Ͳ����Ժ���������֮��ת��
int a = 10;
boolean = true;
a = b;
b = a;//������


����ת�����������ͺ�С���ͣ�������Ϊ�ϴ�����ͽ�������
int a = 10;
double b = 99l;
int c = (int)(a + b);//����ö����double


1. ��ͬ���͵����ݻ������, ��ΧС�Ļ������ɷ�Χ���.
2. ���� short, byte ���ֱ� 4 ���ֽ�С������, ���������� 4 ���ֽڵ� int, ������.
byte a = 10;
byte b = 20;
byte c = (byte)(a + b);



��Ȼshort��char���������ֽڣ�������Ϊ��Χ��ͬ�����Բ���ת��
short s = 10;
char c = s;//�ᱨ��

char c2 = 9;
short s2 = (short)c2;//����



���ɻ���ת��������ǿת











