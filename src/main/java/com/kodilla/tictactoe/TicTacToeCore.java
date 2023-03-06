package com.kodilla.tictactoe;
import java.util.Scanner;


public class TicTacToeCore extends TicTacToeWinChecker{

    Scanner input = new Scanner(System.in);




    public boolean playerMove(char[][] board, char player) {
        System.out.println(player + " your move.");
        System.out.println("Chose row index");

        int row = input.nextInt();

        System.out.println("Chose colum index");

        int colum = input.nextInt();

        boolean isEmpty = board[row][colum] == 0;

        if (isEmpty) {

            board[row][colum] = player;
            return true;

        } else {
            System.out.println("Move is not avaiable.");
            return false;
        }


    }

    public boolean computerMove(char[][] board, char player, int size){

        System.out.println("Computer move.");

        boolean isEmpty = false;
        while (!isEmpty) {
            int row = computerMove(size);
            int colum = computerMove(size);
            boolean checker = board[row][colum] == 0;
            if (checker){
                board[row][colum] = player;
                isEmpty =true;
            }
        }
        return isEmpty;
    }

    public static void printBoard(char[][] board) {

        int size = board.length;

        System.out.print("\t");
        for (int i = 0; i < size; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        for (int row = 0; row < board.length; row++) {
            System.out.print(row + ":\t");
            for (int colum = 0; colum < board[row].length; colum++) {
                System.out.print(board[row][colum] + "\t");
            }
            System.out.println();
        }

    }


}

