/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;

/**
 *
 * @author baduy
 */
public final class Sudoku {

    private int sudoku[][];

    //Create 9x9 matrix
    public Sudoku() {
        sudoku = new int[9][9];
        clearSudoku();
    }

    public void clearSudoku() {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {

                //Place all positons in 0
                sudoku[i][j] = 0;
            }
        }
    }

    public void generateSudoku(int level) {
        clearSudoku();

        Random random = new Random();

        //FIRST QUARDANT
        //Create all forums to go through rows and columns
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = random.nextInt(9) + 1;

                //Verify if number we want enter is valid to place in quardant
                if (validateQuadrant(i, j, num)) {
                    sudoku[i][j] = num;
                } //If number is already in one of positions of quardant
                else {

                    //Subtract 1 from variable j so that it does not return
                    j--;
                }
            }
        }

        //FOR CENTRAL QUARDANT
        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                int num = random.nextInt(9) + 1;

                if (validateQuadrant(i, j, num)) {
                    sudoku[i][j] = num;
                } else {
                    j--;
                }
            }
        }

        //FOR LAST QUARDANT
        for (int i = 6; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
                int num = random.nextInt(9) + 1;

                if (validateQuadrant(i, j, num)) {
                    sudoku[i][j] = num;
                } else {
                    j--;
                }
            }
        }
        solveSudoku();
        //Remove numbers so that users can enter them
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {

                //Store position of column in which we find
                int sto = j;
                int ran;

                switch (level) {
                    case 1: // Easy
                        ran = random.nextInt(level + 1);
                        break;
                    case 2: // Medium
                        ran = random.nextInt(level + 2);
                        break;
                    case 3: // Hard
                        ran = random.nextInt(level + 3);
                        break;
                    case 4: // Nightmare
                        ran = random.nextInt(level + 5);
                        break;
                    default: // Default to Easy
                        ran = random.nextInt(2) + 1;
                        break;
                }
                j += ran;
                for (int k = sto; k < j && k < sudoku.length; k++) {
                    sudoku[i][k] = 0;
                }
            }
        }
    }

    public boolean solveSudoku() {
        //Go through rows and columns
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {

                //Verify if position is equal to 0
                if (sudoku[i][j] == 0) {

                    //Try numbers between 1 and 9
                    for (int value = 1; value <= 9; value++) {

                        //Verify row, column and quadrant
                        if (validateRow(i, value) && validateColumn(j, value) && validateQuadrant(i, j, value)) {
                            sudoku[i][j] = value;

                            //Backtracking
                            if (solveSudoku()) {
                                return true;
                            }
                            sudoku[i][j] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    //Verify which quadrant value are in
    public boolean validateQuadrant(int i, int j, int value) {
        int posI = subCurrentQuadrant(i);
        int posJ = subCurrentQuadrant(j);

        for (int k = posI - 3; k < posI; k++) {
            for (int l = posJ - 3; l < posJ; l++) {
                if (sudoku[k][l] == value) {
                    return false;
                }
            }
        }
        return true;
    }

    //Return an integer called current quadrant of value
    public int subCurrentQuadrant(int pos) {
        if (pos <= 2) {
            return 3;
        } else if (pos <= 5) {
            return 6;
        } else {
            return 9;
        }
    }

    //Verify if value which is going through a row is already or not
    public boolean validateRow(int i, int value) {
        for (int j = 0; j < sudoku[i].length; j++) {
            if (sudoku[i][j] == value) {
                return false;
            }
        }
        return true;
    }

    //Verify if value which is going through a column is already or not
    public boolean validateColumn(int j, int value) {
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[i][j] == value) {
                return false;
            }
        }
        return true;
    }

    public boolean checkSudoku() {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                int assist = sudoku[i][j];
                sudoku[i][j] = 0;

                if (!validateRow(i, assist) || !validateColumn(j, assist) || !validateQuadrant(i, j, assist)) {
                    sudoku[i][j] = assist;
                    return false;
                }
                sudoku[i][j] = assist;
            }
        }
        return true;
    }

    public int[][] getSudoku() {
        return sudoku;
    }

    public void setSudoku(int[][] sudoku) {
        this.sudoku = sudoku;
    }
}
