package com.kodilla.tictactoe;
import java.util.Scanner;


public class TicTacToeCore {
    public static void main(String[] args) {

        System.out.println("Welcome in TicTacToe! \nChose a size of a board.");

        int size = new Scanner(System.in).nextInt();
        char currentPlayer = 'X';
        char[][] board = new char[size][size];
        boolean gameOn = true;
        int moveCounter = 0;

        while (gameOn && moveCounter<=size*size) {
            TicTacToeCore.printBoard(board);
            System.out.println();
            boolean moveChecker = moveRunner(board, currentPlayer);
            if (moveChecker) {

                moveCounter++;

                boolean winRow = checkRow(board, currentPlayer);
                boolean winColum = checkColum(board,currentPlayer);
                boolean winDiagonal1 = checkDiagonal1(board,currentPlayer);
                boolean winDiagonal2 = checkDiagonal2(board, currentPlayer);

                if (winRow || winColum || winDiagonal1 || winDiagonal2){
                    TicTacToeCore.printBoard(board);
                    System.out.println("Congratulations!! " + currentPlayer + " is the winner!");
                    gameOn = false;
                }

                if (currentPlayer == 'X') {
                    currentPlayer = 'O';
                } else {
                    currentPlayer = 'X';
                }
            }
        }
    }
    public static boolean moveRunner(char[][] board, char player){
        System.out.println(player + " your move.");
        System.out.println("Chose row index");

        int row = new Scanner(System.in).nextInt();

        System.out.println("Chose colum index");

        int colum = new Scanner(System.in).nextInt();

        boolean isEmpty = board[row][colum] == 0;

        if (isEmpty){

            board[row][colum] = player;
            return true;

        } else {
            System.out.println("Move is not avaiable.");
            return false;
        }


    }
    public static void printBoard(char[][] board) {

        int size = board.length;

        System.out.print("\t");
        for (int i = 0; i<size;i++){
            System.out.print(i+"\t");
        }
        System.out.println();

        for (int row = 0; row<board.length;row++){
            System.out.print(row + ":\t");
            for (int colum = 0; colum<board[row].length;colum++){
                System.out.print(board[row][colum] + "\t");
            }
            System.out.println();
        }

    }

    public static boolean checkDiagonal1 (char[][] board, char player){
        int size = board.length;
        for( int i = 0; i < size; i++) {
            if ( board[i][i] != player ) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkDiagonal2 (char[][] board, char player){
        int size = board.length;
        for( int i = 0; i < size; i++) {
            if ( board[i][size-i-1] != player ) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkColum (char[][] board, char player){

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

    public static boolean checkRow (char[][] board, char player){

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

}
