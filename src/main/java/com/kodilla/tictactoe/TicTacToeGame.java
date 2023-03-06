package com.kodilla.tictactoe;

public class TicTacToeGame extends TicTacToeCore{

    public TicTacToeGame() {

        System.out.println("Welcome in TicTacToe!");
        System.out.println("Choose '1' to play vs other player locally.");
        System.out.println("Choose '2' to play against computer.");

        int gameMode = input.nextInt();

        if (gameMode == 1) {

            System.out.println("Choose 3 to play 3x3 board.(3 in row required to win a game.\nChoose 10 to play 10x10 board.(5 in row required to win a game");
            int size = input.nextInt();
            int pointsRequiredToWin;

            if (size == 3){
                pointsRequiredToWin = 3;
            } else {
                pointsRequiredToWin = 5;
            }


            char currentPlayer = 'X';
            char[][] board = new char[size][size];
            boolean gameOn = true;
            int moveCounter = 0;
            int boardSize = size * size;

            while (gameOn && moveCounter <= boardSize) {
                TicTacToeCore.printBoard(board);
                System.out.println();
                boolean moveChecker = playerMove(board, currentPlayer);
                if (moveChecker) {

                    moveCounter++;

                    boolean winRow = false;
                    boolean winColum = false;
                    boolean winDiagonalDownRight = false;
                    boolean winDiagonalUpRight = false;

                    if (size == 10) {

                         winRow = TicTacToeWinChecker.checkRowBigBoard(board, currentPlayer, pointsRequiredToWin);
                         winColum = TicTacToeWinChecker.checkColumBigBoard(board, currentPlayer, pointsRequiredToWin);
                         winDiagonalDownRight = TicTacToeWinChecker.checkDiagonalDownRightBigBoard(board, currentPlayer, pointsRequiredToWin);
                         winDiagonalUpRight = TicTacToeWinChecker.checkDiagonalUpRightBigBoard(board, currentPlayer, pointsRequiredToWin);

                    } else {

                         winRow = checkRowSmallBoard(board, currentPlayer);
                         winColum = checkColumSmallBoard(board,currentPlayer);
                         winDiagonalDownRight = checkDiagonalDownRightSmallBoard(board,currentPlayer);
                         winDiagonalUpRight = checkDiagonalUpRightSmallBoard(board, currentPlayer);


                    }



                    if (winRow || winColum || winDiagonalDownRight || winDiagonalUpRight) {
                        TicTacToeCore.printBoard(board);
                        System.out.println("Congratulations!! " + currentPlayer + " is the winner!");
                        gameOn = false;
                    } else if (moveCounter == boardSize) {

                        System.out.println("It is a draw!");
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
        if (gameMode == 2) {

            System.out.println("Choose 3 to play 3x3 board.(3 in row required to win a game.\nChoose 10 to play 10x10 board.(5 in row required to win a game");
            int size = input.nextInt();
            int pointsRequiredToWin;

            if (size == 3){
                pointsRequiredToWin = 3;
            } else {
                pointsRequiredToWin = 5;
            }

            char currentPlayer = 'X';
            char[][] board = new char[size][size];
            boolean gameOn = true;
            int moveCounter = 0;
            int boardSize = size * size;

            while (gameOn && moveCounter <= boardSize) {
                TicTacToeCore.printBoard(board);
                System.out.println();
                if (currentPlayer == 'X'){
                    boolean moveChecker = playerMove(board, currentPlayer);
                    if (moveChecker) {

                        moveCounter++;

                        boolean winRow = false;
                        boolean winColum = false;
                        boolean winDiagonalDownRight = false;
                        boolean winDiagonalUpRight = false;

                        if (size == 10) {

                            winRow = TicTacToeWinChecker.checkRowBigBoard(board, currentPlayer, pointsRequiredToWin);
                            winColum = TicTacToeWinChecker.checkColumBigBoard(board, currentPlayer, pointsRequiredToWin);
                            winDiagonalDownRight = TicTacToeWinChecker.checkDiagonalDownRightBigBoard(board, currentPlayer, pointsRequiredToWin);
                            winDiagonalUpRight = TicTacToeWinChecker.checkDiagonalUpRightBigBoard(board, currentPlayer, pointsRequiredToWin);

                        } else {

                            winRow = checkRowSmallBoard(board, currentPlayer);
                            winColum = checkColumSmallBoard(board,currentPlayer);
                            winDiagonalDownRight = checkDiagonalDownRightSmallBoard(board,currentPlayer);
                            winDiagonalUpRight = checkDiagonalUpRightSmallBoard(board, currentPlayer);


                        }

                        if (winRow || winColum || winDiagonalDownRight || winDiagonalUpRight) {
                            TicTacToeCore.printBoard(board);
                            System.out.println("Congratulations!! " + currentPlayer + " is the winner!");
                            gameOn = false;
                        } else if (moveCounter == boardSize) {

                            System.out.println("It is a draw!");
                            gameOn = false;

                        }

                        if (currentPlayer == 'X') {
                            currentPlayer = 'O';

                        } else {
                            currentPlayer = 'X';
                        }
                    }
                } else if (currentPlayer == 'O') {
                    boolean moveChecker = computerMove(board, currentPlayer, size);
                    if (moveChecker) {

                        moveCounter++;

                        boolean winRow = false;
                        boolean winColum = false;
                        boolean winDiagonalDownRight = false;
                        boolean winDiagonalUpRight = false;

                        if (size == 10) {

                            winRow = TicTacToeWinChecker.checkRowBigBoard(board, currentPlayer, pointsRequiredToWin);
                            winColum = TicTacToeWinChecker.checkColumBigBoard(board, currentPlayer, pointsRequiredToWin);
                            winDiagonalDownRight = TicTacToeWinChecker.checkDiagonalDownRightBigBoard(board, currentPlayer, pointsRequiredToWin);
                            winDiagonalUpRight = TicTacToeWinChecker.checkDiagonalUpRightBigBoard(board, currentPlayer, pointsRequiredToWin);

                        } else {

                            winRow = checkRowSmallBoard(board, currentPlayer);
                            winColum = checkColumSmallBoard(board,currentPlayer);
                            winDiagonalDownRight = checkDiagonalDownRightSmallBoard(board,currentPlayer);
                            winDiagonalUpRight = checkDiagonalUpRightSmallBoard(board, currentPlayer);


                        }

                        if (winRow || winColum || winDiagonalDownRight || winDiagonalUpRight) {
                            TicTacToeCore.printBoard(board);
                            System.out.println("Congratulations!! " + currentPlayer + " is the winner!");
                            gameOn = false;
                        } else if (moveCounter == boardSize) {

                            System.out.println("It is a draw!");
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

        }
    }
}
