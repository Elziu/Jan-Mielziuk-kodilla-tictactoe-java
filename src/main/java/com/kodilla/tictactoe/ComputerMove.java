package com.kodilla.tictactoe;

import java.util.Random;

public class ComputerMove {

    public static int computerMove(int size) {
        Random random = new Random();

        if (size == 3) {
            return random.nextInt(3);
        } else {
            return random.nextInt(10);

        }
    }


}
