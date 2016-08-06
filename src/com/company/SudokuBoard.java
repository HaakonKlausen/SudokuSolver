package com.company;

/**
 * Created by haakon on 31.07.2016.
 * Class to represent a Sudoku board
 */

public class SudokuBoard {
    private int[] [] [] [] squares;
    private static  int emptyValue = 0;

    // Blank constructor
    public SudokuBoard() {
        squares = new int[3][3][3] [3];
        for (int x=0;x<3;x++) {
            for (int y=0;y<3;y++) {
                for (int zx=0;zx<3;zx++) {
                    for (int zy=0;zy<3;zy++) {
                        squares[x][y][zx][zy] = emptyValue;
                    }
                }
            }
        }
    }

    // Copy a board into a new object
    public SudokuBoard(SudokuBoard p_SudokuBoard) {
        squares = new int[3][3][3][3];
        for (int x=0;x<3;x++) {
            for (int y=0;y<3;y++) {
                for (int zx=0;zx<3;zx++) {
                    for (int zy=0;zy<3;zy++) {
                        squares[x][y][zx][zy] = p_SudokuBoard.getSquareValue(x, y, zx, zy);
                    }
                }
            }
        }
    };

    public int getSquareValue(int p_x, int p_y, int p_zx, int p_zy) {
        int squareValue = 0;
        squareValue = squares[p_x] [p_y] [p_zx] [p_zy];
        return squareValue;
    };

    public boolean isEmptySquare(int p_x, int p_y, int p_zx, int p_zy) {
        if(getSquareValue(p_x, p_y, p_zx, p_zy) == emptyValue) {
            return true;
        }
        else {
            return false;
        }
    }

    public void setSquareValue(int p_x, int p_y, int p_zx, int p_zy, int p_value) {
        squares[p_x][p_y][p_zx][p_zy] = p_value;
    };


    // Returns true if value is valid to insert on the board at the given location
    public boolean isLegalValue(int p_x, int p_y, int p_zx, int p_zy, int p_value) {
        //System.out.print("DEBUG: isLegalValue: "+ p_zx + "." + p_x + " - " + p_zy + "." + p_y + ": " + p_value + " - ");
        // Check if value is empty
        if(getSquareValue(p_x, p_y, p_zx, p_zy) != emptyValue) {
            //System.out.println("Not empty");
            return false;
        };

        // Check if value is used in any square in the same z
        for(int x=0;x<3;x++) {
            for(int y=0;y<3;y++) {
                if(getSquareValue(x, y, p_zx, p_zy) == p_value) {
                    //System.out.println("Used in same z");
                    return false;
                }
            }
        };

        // Check if value is used in any cell in the same column, in the same column of Z
        for (int y=0;y<3;y++) {
            for(int zy=0;zy<3;zy++) {
                if(getSquareValue(p_x, y, p_zx, zy) == p_value) {
                    //System.out.println("Used in same column");
                    return false;
                }
            }
        }

        // Check if value is used in any cell in the same row, in the same row as of z
        for (int x=0;x<3;x++) {
            for (int zx=0;zx<3;zx++) {
                if (getSquareValue(x, p_y, zx, p_zy) == p_value) {
                    //System.out.println("Used in same row");
                    return false;
                }
            }
        }

        return true;
    }

    // Print the whole board
    public void printBoard() {
        for (int zy=0; zy<3; zy++) {
            for (int y=0; y<3; y++ ) {
                for (int zx=0; zx<3; zx++) {
                    for (int x=0; x<3; x++) {
                        System.out.print("|");
                        if (isEmptySquare(x, y, zx, zy)) {
                            System.out.print (" ");
                        }
                        else {
                            System.out.print(getSquareValue(x, y, zx, zy));
                        }
                    }
                }
                System.out.println("|");
            }
        }
        System.out.println("");
    }

    public boolean isSolved() {
        int filledSquares = 0;

        for (int zy=0; zy<3; zy++) {
            for (int y=0; y<3; y++ ) {
                for (int zx=0; zx<3; zx++) {
                    for (int x=0; x<3; x++) {
                        if (!isEmptySquare(x, y, zx, zy)) {
                            filledSquares++;
                        }
                    }
                }
            }
        }
        if (filledSquares == (9 * 9)) {
            return true;
        } else {
            return false;
        }
    }

}
