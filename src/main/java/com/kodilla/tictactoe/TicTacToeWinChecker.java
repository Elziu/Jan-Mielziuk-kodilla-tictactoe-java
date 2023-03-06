package com.kodilla.tictactoe;

public class TicTacToeWinChecker extends ComputerMove{

    public static boolean checkDiagonalDownRightSmallBoard(char[][] board, char player){
        int size = board.length;
        for( int i = 0; i < size; i++) {
            if ( board[i][i] != player ) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkDiagonalUpRightSmallBoard(char[][] board, char player){
        int size = board.length;
        for( int i = 0; i < size; i++) {
            if ( board[i][size-i-1] != player ) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkColumSmallBoard(char[][] board, char player){

        int size = board.length;

        for( int colum = 0; colum < size; colum++) {
            boolean win = true;
            for( int row = 0; row < size; row++) {
                if ( board[row][colum] != player ) {
                    win = false;
                    break;
                }
            }
            if ( win ) { return true;}
        }

        return false;
    }

    public static boolean checkRowSmallBoard(char[][] board, char player){

        int size = board.length;

        for( int row = 0; row < size; row++) {
            boolean win = true;
            for( int colum = 0; colum < size; colum++) {
                if ( board[row][colum] != player ) {
                    win = false;
                    break;
                }
            }
            if ( win ) { return true;}
        }

        return false;
    }



    public static boolean checkDiagonalDownRightBigBoard(char[][] board, char player, int pointsRequired){
        int size = board.length;
        int playerMarkCount = 0;
        for (int k = 0; k <= 5; k++) {
            int i = k;
            int j = 0;

            while (i<=size-1) {
                if ( board[i][j] == player ) {
                    playerMarkCount++;
                } else if (playerMarkCount != pointsRequired ) {
                    playerMarkCount = 0;
                }
                i = i + 1 ;
                j = j + 1 ;
                if ( playerMarkCount == pointsRequired ) { return true;}
            }
        }
        for (int k = 1; k<=5; k++){
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
                if ( playerMarkCount == pointsRequired ) { return true;}
            }

        }

        return false;
    }




    public static boolean checkDiagonalUpRightBigBoard(char[][] board, char player, int pointsRequired) {
        int size = board.length;
        int playerMarkCount = 0;
        for (int k = 4; k <= size-1; k++) {
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
                if ( playerMarkCount == pointsRequired ) { return true;}
            }

        }
        for (int k = 1; k<=size-1; k++){
            int i = size-1;
            int j = k;
            while (j<=5){
                if ( board[i][j] == player ) {
                    playerMarkCount++;
                } else if (playerMarkCount != pointsRequired) {
                    playerMarkCount = 0;
                }
                i = i - 1 ;
                j = j + 1 ;
                if ( playerMarkCount == pointsRequired ) { return true;}
            }

        }
        return false;
    }

    public static boolean checkColumBigBoard(char[][] board, char player, int pointsRequired){

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

    public static boolean checkRowBigBoard(char[][] board, char player, int pointsRequired){

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
