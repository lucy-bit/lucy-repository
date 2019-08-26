#include<stdio.h>
#include<string.h>
#define ROWS 11
#define COLS 11
#define ROW 9
#define COL 9
void Initboard(char board[ROWS][COLS], int rows, int cols, char set);
void Displayboard(char board[ROWS][COLS], int row, int col);
void SetMine(char board[ROWS][COLS], int rows, int cols);