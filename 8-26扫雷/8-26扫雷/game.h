//#ifndef __GAME_H__
//#define __GAME__H__

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>

#define row 12
#define col 12
#define COUNT 10//�������׵�����
extern char show_mine[row][col];//չʾ����
extern char real_mine[row][col];//��������

void init_mine();//��ʼ�����麯��
void set_mine();//���׺���
int count_mine();//ͳ����Χ�׵ĸ���
void print_player();//��ӡ�������
void print_mine();//��ӡ��������� 
int  sweep_mine();//ɨ�׺���
void safe_mine();//�����һ�α���ը���ĺ���
void open_mine(int x, int y);//չ������
int count_show_mine(); ///�ж��������ʣ��δ֪����ĸ���
