#define ROW 5
#define COL 5
#include<stdio.h>
#include<time.h>
#include<stdlib.h>
#include<string.h>
void InitBoard(char board[ROW][COL], int row, int col);
void DisplayBoard(char board[ROW][COL], int row, int col);
void PlayerMove(char board[ROW][COL], int row, int col);
void ComputerMove(char board[ROW][COL], int row, int col);
char JudgeBoard(char board[ROW][COL], int row, int col);
