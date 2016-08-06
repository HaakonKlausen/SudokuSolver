package com.company;


/**
 * Created by haakon on 31.07.2016.
 * Class to solve a SudokuBoard object
 */

public class SudokuSolver {

    // Recursive function to solve a board
    public boolean SolveSudokuBoard(SudokuBoard p_SudokuBoard, int p_recursiveLevel) {

        SudokuBoard sudokuBoard = new SudokuBoard();

        // Check if board is full
        if (p_SudokuBoard.isSolved()) {
            System.out.println("Solution Found!");
            p_SudokuBoard.printBoard();
            return true;
        }

        // Find first open square
        for (int zx=0; zx<3; zx++) {
            for (int x=0; x<3; x++) {
                for (int zy=0;zy<3;zy++) {
                    for (int y=0; y<3; y++) {
                        if (p_SudokuBoard.isEmptySquare(x, y, zx, zy)) {

                            // We have an empty square, loop through values and try to solve for the legal ones

                            boolean solutionFoundThisSquare = false;

                            for (int squareValue=1; squareValue<10; squareValue++) {
                                if (p_SudokuBoard.isLegalValue(x, y, zx, zy, squareValue)) {

                                    // Make a copy of the board, set the legal value found and call for a solution
                                    sudokuBoard = new SudokuBoard(p_SudokuBoard);
                                    sudokuBoard.setSquareValue(x, y, zx, zy, squareValue);

                                    if (SolveSudokuBoard(sudokuBoard, p_recursiveLevel + 1)) {
                                        return true;
                                    };
                                }
                            }

                            // There is no solution for this square, cut the branch
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }
}
