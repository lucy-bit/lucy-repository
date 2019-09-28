#define MAX 1000
#define NAME_MAX 15
#define SEX_MAX 5
#define TELE_MAX 20
#define ADD_MAX 15
#define CAPACITY 3

#include<assert.h>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<errno.h>
typedef struct PeoInfor
{
	char name[NAME_MAX];
	char sex[SEX_MAX];
	int age;
	char tele[TELE_MAX];
	char addr[ADD_MAX];
}PeoInfor;

typedef struct Contact
{
	//����ṹ�����������¼��ѧ������Ϣ
	//����ṹ�����������ѧ������Ϣ
	PeoInfor*  date;
	//�������ͱ�����¼����˶��ٸ�ѧ������Ϣ
	int sz;
	//�������������㴴����̬�ڴ�ռ�
	int capacity;
}Contact;

enum
{
	Exit,
	Add,
	Delete,
	Modify,
	Search,
	Show
};

void AddContact(Contact *pcon);
void Init(Contact *pcon);
void DeleteContact(Contact *pcon);
void ModifyContact(Contact *pcon);
void ShowContact(Contact *pcon);

