package com.kodilla.tictactoe;

public class TicTacToeWinChecker extends ComputerMove{

    public static boolean checkDiagonalDownRightBigBoard(char[][] board, char player, int pointsRequired){
        int size = board.length;
        int playerMarkCount = 0;
        for (int k = 0; k <= size-1; k++) {
            int i = k;
            int j = 0;
            while (i<=size-1) {
                if ( board[i][j] == player ) {
                    playerMarkCount++;
                } else if (playerMarkCount != pointsRequired) {
                    playerMarkCount = 0;
                }
                i = i + 1 ;
                j = j + 1 ;
            }
            if (playerMarkCount == pointsRequired){
                return true;
            }
        }
        for (int k = 1; k<=size-1; k++){
            int i = 0;
            int j = k;
            while (j<=size-1){
                if ( board[i][j] == player ) {
                    playerMarkCount++;
                } else if (playerMarkCount != pointsRequired) {
                    playerMarkCount = 0;
                }
                i = i + 1 ;
                j = j + 1 ;
            }
            if (playerMarkCount == pointsRequired){
                return true;
            }
        }

        return false;
    }




    public static boolean checkDiagonalUpRight(char[][] board, char player, int pointsRequired) {
        int size = board.length;
        int playerMarkCount = 0;
        for (int k = 0; k <= size-1; k++) {
            int i = k;
            int j = 0;
            while (i>=0) {
                if ( board[i][j] == player ) {
                    playerMarkCount++;
                } else if (playerMarkCount != pointsRequired) {
                    playerMarkCount = 0;
                }
                i = i - 1 ;
                j = j + 1 ;
            }
        }
        for (int k = 1; k<=size-1; k++){
            int i = size-1;
            int j = k;
            while (j<=size-1){
                if ( board[i][j] == player ) {
                    playerMarkCount++;
                } else if (playerMarkCount != pointsRequired) {
                    playerMarkCount = 0;
                }
                i = i - 1 ;
                j = j + 1 ;
            }
        }
        return playerMarkCount == pointsRequired;
    }

    public static boolean checkColum (char[][] board, char player, int pointsRequired){

        int size = board.length;
        int playerMarkCount = 0;

        for( int colum = 0; colum < size; colum++) {
            for( int row = 0; row < size; row++) {
                if ( board[row][colum] == player ) {
                    playerMarkCount++;
                } else if (playerMarkCount != pointsRequired) {
                    playerMarkCount = 0;
                }
            }
            if ( playerMarkCount == pointsRequired ) { return true;}
        }

        return false;
    }

    public static boolean checkRow (char[][] board, char player, int pointsRequired){

        int size = board.length;
        int playerMarkCount = 0;

        for( int row = 0; row < size; row++) {
            for( int colum = 0; colum < size; colum++) {
                if ( board[row][colum] == player ) {
                    playerMarkCount++;
                } else if (playerMarkCount != pointsRequired){
                    playerMarkCount = 0;
                }
            }
            if ( playerMarkCount == pointsRequired ) { return true;}
        }

        return false;
    }
}
