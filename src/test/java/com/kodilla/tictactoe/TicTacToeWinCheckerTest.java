package com.kodilla.tictactoe;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class TicTacToeWinCheckerTest {

    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }

    @Nested
    @DisplayName("Tests for small board.")
    class smallBoardTests {
        @DisplayName(
                "Win in a row."
        )
        @Test
        public void testCheckRowSmallBoard() {

            //Given
            boolean rowWin = true;
            char player = 'O';
            char[][] board = {
                    {'O', 'X', 'X'},
                    {'O', 'O', 'O'},
                    {'X', ' ', ' '}
            };

            //When
            boolean isWin = TicTacToeWinChecker.checkRowSmallBoard(board, player);

            //Then
            Assertions.assertEquals(rowWin, isWin);
        }

        @DisplayName(
                "Win in a colum."
        )
        @Test
        public void testCheckColumSmallBoard() {

            //Given
            boolean rowWin = true;
            char player = 'O';
            char[][] board = {
                    {'O', 'X', 'X'},
                    {'O', 'X', 'O'},
                    {'O', ' ', ' '}
            };

            //When
            boolean isWin = TicTacToeWinChecker.checkColumSmallBoard(board, player);

            //Then
            Assertions.assertEquals(rowWin, isWin);
        }

        @DisplayName(
                "Win in a diagonal down right."
        )
        @Test
        public void testCheckDiagonalDownRightSmallBoard() {

            //Given
            boolean rowWin = true;
            char player = 'O';
            char[][] board = {
                    {'O', 'X', 'X'},
                    {'O', 'O', 'O'},
                    {'X', 'X', 'O'}
            };

            //When
            boolean isWin = TicTacToeWinChecker.checkDiagonalDownRightSmallBoard(board, player);

            //Then
            Assertions.assertEquals(rowWin, isWin);
        }

        @DisplayName(
                "Win in a diagonal up right."
        )
        @Test
        public void testCheckDiagonalUpRightSmallBoard() {

            //Given
            boolean rowWin = true;
            char player = 'O';
            char[][] board = {
                    {'X', 'X', 'O'},
                    {'O', 'O', 'X'},
                    {'O', ' ', ' '}
            };

            //When
            boolean isWin = TicTacToeWinChecker.checkDiagonalUpRightSmallBoard(board, player);

            //Then
            Assertions.assertEquals(rowWin, isWin);
        }
    }

    @Nested
    @DisplayName("Tests for big board.")
    class  bigBoardTests {

        @DisplayName(
                "Win in a row."
        )
        @Test
        public void testCheckRowBigBoard() {

            //Given
            int pointsRequired = 5;
            boolean rowWin = true;
            char player = 'X';
            char[][] board = {
                    {'X', 'O', ' ', 'X', 'X', 'X', 'X', 'X', ' ', ' '},
                    {'X', 'O', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {'O', ' ', 'O', ' ', 'O', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', 'O', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
            };

            //When
            boolean isWin = TicTacToeWinChecker.checkRowBigBoard(board, player, pointsRequired);

            //Then
            Assertions.assertEquals(rowWin, isWin);
        }
        @DisplayName(
                "Win in a colum."
        )
        @Test
        public void testCheckColumBigBoard() {

            //Given
            int pointsRequired = 5;
            boolean rowWin = true;
            char player = 'X';
            char[][] board = {
                    {'X', 'O', ' ', 'X', 'X', 'O', 'X', 'X', ' ', ' '},
                    {'X', 'O', ' ', ' ', 'O', ' ', ' ', ' ', ' ', ' '},
                    {'O', 'O', 'O', 'O', 'X', ' ', ' ', ' ', ' ', ' '},
                    {'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {'X', 'O', 'O', ' ', ' ', 'O', ' ', ' ', ' ', ' '},
                    {'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
            };

            //When
            boolean isWin = TicTacToeWinChecker.checkColumBigBoard(board, player, pointsRequired);

            //Then
            Assertions.assertEquals(rowWin, isWin);
        }
        @DisplayName(
                "Win in a diagonal down right."
        )
        @Test
        public void testCheckDiagonalDownRightBigBoard() {

            //Given
            int pointsRequired = 5;
            boolean rowWin = true;
            char player = 'X';
            char[][] board = {
                    {'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {'O', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {'O', ' ', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {'O', ' ', ' ', 'X', ' ', ' ', ' ', ' ', ' ', ' '},
                    {'O', ' ', ' ', ' ', 'X', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
            };

            //When
            boolean isWin = TicTacToeWinChecker.checkDiagonalDownRightBigBoard(board, player, pointsRequired);

            //Then
            Assertions.assertEquals(rowWin, isWin);
        }
        @DisplayName(
                "Win in a diagonal up right."
        )
        @Test
        public void testCheckDiagonalUpRightBigBoard() {

            //Given
            int pointsRequired = 5;
            boolean rowWin = true;
            char player = 'X';
            char[][] board = {
                    {'X', 'O', ' ', 'X', 'X', 'X', 'O', 'X', ' ', ' '},
                    {'X', 'O', ' ', ' ', 'X', 'O', 'O', ' ', ' ', ' '},
                    {'O', ' ', 'X', 'X', 'O', ' ', 'O', ' ', ' ', ' '},
                    {' ', ' ', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', 'X', ' ', ' ', ' ', 'O', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
            };

            //When
            boolean isWin = TicTacToeWinChecker.checkDiagonalUpRightBigBoard(board, player, pointsRequired);

            //Then
            Assertions.assertEquals(rowWin, isWin);
        }

    }
}