package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Main {

    public static void main(String[] args) {
        SudokuBoard startBoard = new SudokuBoard();

        // Initialize board
        /*startBoard.setSquareValue(1,0,0,0,8);
        startBoard.setSquareValue(0,2,0,0,4);
        startBoard.setSquareValue(1,2,0,0,9);
        startBoard.setSquareValue(2,2,0,0,2);

        startBoard.setSquareValue(2,1,1,0,9);
        startBoard.setSquareValue(2,2,1,0,1);

        startBoard.setSquareValue(0,0,2,0,4);
        startBoard.setSquareValue(1,0,2,0,7);
        startBoard.setSquareValue(0,1,2,0,5);
        startBoard.setSquareValue(0,2,2,0,3);
        startBoard.setSquareValue(2,2,2,0,8);

        startBoard.setSquareValue(0,0,0,1,5);
        startBoard.setSquareValue(1,0,0,1,4);
        startBoard.setSquareValue(2,0,0,1,1);
        startBoard.setSquareValue(1,1,0,1,7);

        startBoard.setSquareValue(0,0,1,1,7);
        startBoard.setSquareValue(1,0,1,1,2);
        startBoard.setSquareValue(0,1,1,1,9);
        startBoard.setSquareValue(1,1,1,1,6);
        startBoard.setSquareValue(2,1,1,1,4);

        startBoard.setSquareValue(0,1,2,1,1);
        startBoard.setSquareValue(0,2,2,1,7);
        startBoard.setSquareValue(1,2,2,1,8);

        startBoard.setSquareValue(1,0,0,2,1);
        startBoard.setSquareValue(0,1,0,2,6);
        startBoard.setSquareValue(1,1,0,2,2);
        startBoard.setSquareValue(1,2,0,2,5);
        startBoard.setSquareValue(2,2,0,2,4);

        startBoard.setSquareValue(0,0,1,2,4);
        startBoard.setSquareValue(1,0,1,2,8);
        startBoard.setSquareValue(2,0,1,2,7);
        startBoard.setSquareValue(0,2,1,2,6);

        startBoard.setSquareValue(2,0,2,2,6);
        startBoard.setSquareValue(0,1,2,2,8);
        startBoard.setSquareValue(2,0,2,2,6);
        startBoard.setSquareValue(2,1,2,2,1);
        startBoard.setSquareValue(0,2,2,2,9);*/

        startBoard.setSquareValue(1,0,0,0,7);
        startBoard.setSquareValue(1,2,0,0,4);

        startBoard.setSquareValue(2,0,1,0,1);

        startBoard.setSquareValue(0,1,2,0,2);
        startBoard.setSquareValue(0,2,2,0,5);
        startBoard.setSquareValue(1,2,2,0,9);

        startBoard.setSquareValue(0,1,0,1,9);
        startBoard.setSquareValue(0,2,0,1,6);
        startBoard.setSquareValue(1,1,0,1,8);

        startBoard.setSquareValue(0,2,1,1,3);

        startBoard.setSquareValue(0,0,2,1,9);
        startBoard.setSquareValue(1,0,2,1,5);
        startBoard.setSquareValue(1,1,2,1,7);

        startBoard.setSquareValue(2,0,0,2,8);
        startBoard.setSquareValue(2,1,0,2,3);
        startBoard.setSquareValue(2,2,0,2,4);

        startBoard.setSquareValue(0,0,1,2,1);
        startBoard.setSquareValue(0,1,1,2,9);
        startBoard.setSquareValue(0,2,1,2,5);
        startBoard.setSquareValue(1,0,1,2,4);
        startBoard.setSquareValue(1,2,1,2,3);
        startBoard.setSquareValue(2,1,1,2,7);

        startBoard.setSquareValue(2,2,2,2,6);


        // Print Start Board
        startBoard.printBoard();

        // Initiate solving
        SudokuSolver solver = new SudokuSolver();
        Boolean solved = solver.SolveSudokuBoard(startBoard, 0);

    }
}
