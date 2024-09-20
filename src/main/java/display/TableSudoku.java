/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package display;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Sudoku;

/**
 *
 * @author baduy
 */
public class TableSudoku extends JPanel {

    private JTextField[][] listTxt;

    private int txtWidth;
    private int txtHeight;
    private int txtMargin;
    private int txtFontSize;

    private Color panelBackground;

    private Color txtBackground1;
    private Color txtForeground1;
    private Color txtBackground2;
    private Color txtForeground2;
    private Color txtBackground3;
    private Color txtForeground3;

    private Color txtBackground4;
    private Color txtForeground4;

    private Sudoku sudoku;

    private ArrayList<JTextField> listTxtAssist;
    private ArrayList<JTextField> listTxtGenerate;
    public JTextField txtSelected;

    private TableSudoku tableSudoku;

    public TableSudoku() {
        initiateComponent();

    }

    public void initiateComponent() {
        listTxt = new JTextField[9][9];
        txtWidth = 45;
        txtHeight = 45;
        txtMargin = 3;
        txtFontSize = 35;

        panelBackground = Color.BLACK;

        txtBackground1 = Color.WHITE;
        txtForeground1 = Color.BLACK;
        txtBackground2 = Color.WHITE;
        txtForeground2 = Color.BLACK;
        txtBackground3 = Color.WHITE;
        txtForeground3 = Color.BLACK;
        txtBackground3 = Color.BLUE;
        txtForeground3 = Color.BLACK;

        sudoku = new Sudoku();
        listTxtAssist = new ArrayList<>();
        listTxtGenerate = new ArrayList<>();
        txtSelected = new JTextField();
    }

    public void generateSudoku(int level) {
        clearTxt();

        sudoku.generateSudoku(level);
        int[][] sudokuGenerate = sudoku.getSudoku();

        //Go through rows and columns
        for (int i = 0; i < listTxt.length; i++) {
            for (int j = 0; j < listTxt[0].length; j++) {

                //Verify if sudoku generated in that position different from 0
                if (sudokuGenerate[i][j] != 0) {

                    //Add value that contains sudoku generated also in that position
                    listTxt[i][j].setText(String.valueOf(sudokuGenerate[i][j]));

                    listTxt[i][j].setBackground(txtBackground4);
                    listTxt[i][j].setForeground(txtForeground4);

                    listTxtGenerate.add(listTxt[i][j]);
                }
            }
        }
    }

    public void clearTxt() {
        for (int i = 0; i < listTxt.length; i++) {
            for (int j = 0; j < listTxt[0].length; j++) {
                listTxt[i][j].setText("");

                //After clear, we return txt to initial color
                listTxt[i][j].setBackground(txtBackground1);
                listTxt[i][j].setForeground(txtForeground1);

                listTxt[i][j].setBorder(BorderFactory.createLineBorder(panelBackground, 1));
            }
        }
        listTxtGenerate.clear();
    }

    public void createSudoku() {
        this.setLayout(null);
        this.setSize(txtWidth * 9 + (txtMargin * 5), txtHeight * 9 + (txtMargin * 5));
        this.setBackground(panelBackground);
        createFieldTxt();
    }

    //Create 81 txt
    public void createFieldTxt() {
        int x = txtMargin;
        int y = txtMargin;

        for (int i = 0; i < listTxt.length; i++) {
            for (int j = 0; j < listTxt[0].length; j++) {
                JTextField txt = new JTextField();
                this.add(txt);

                txt.setBounds(x, y, txtWidth, txtHeight);
                txt.setBackground(txtBackground1);
                txt.setForeground(txtForeground1);

                txt.setFont(new Font("Cambria", Font.BOLD, txtFontSize));
                txt.setHorizontalAlignment(JTextField.CENTER);

                //Set wait cursor
                txt.setEditable(false);
                txt.setCursor(new Cursor(Cursor.HAND_CURSOR));

                //Set thickness of border for each txt is 1
                txt.setBorder(BorderFactory.createLineBorder(panelBackground, 1));

                txt.setVisible(true);
                x += txtWidth;

                //Set thickness of column border for each 3 txts
                if ((j + 1) % 3 == 0) {
                    x += txtMargin;
                }
                listTxt[i][j] = txt;

                generateEvents(txt);
            }
            x = txtMargin;
            y += txtHeight;

            //Set thickness of row border for each 3 txts
            if ((i + 1) % 3 == 0) {
                y += txtMargin;
            }
        }
    }

    public void generateEvents(JTextField txt) {
        MouseListener event = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                pressed(txt);
                txtSelected = txt;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };

        KeyListener eventKey = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {

                //Check if txt for which we want to enter a number is part of generated txts
                if (txtGenerate(txt)) {
                    return;
                } else {
                    //Place txt empty
                    if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE || e.getKeyChar() == KeyEvent.VK_DELETE) {
                        txt.setText("");
                    }
                }

                //Verify if character of key is a number from 1 to 9
                if (e.getKeyChar() >= 49 && e.getKeyChar() <= 57) {
                    txt.setText(String.valueOf(e.getKeyChar()));
                } else if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE || e.getKeyChar() == KeyEvent.VK_DELETE) {

                } else {
                    JOptionPane.showMessageDialog(null, "Please enter one digit number from 1 to 9!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        };

        txt.addKeyListener(eventKey);
        txt.addMouseListener(event);
    }

    public void pressed(JTextField txt) {

        //Return txt to their initial color before executing        
        //Go through list of the assistant txt
        for (JTextField jTxt : listTxtAssist) {
            jTxt.setBackground(txtBackground1);
            jTxt.setForeground(txtForeground1);
            jTxt.setBorder(BorderFactory.createLineBorder(panelBackground, 1));
        }
        //Eliminate all elements to add the new txt that change color
        listTxtAssist.clear();

        for (JTextField jTxt : listTxtGenerate) {
            jTxt.setBackground(txtBackground4);
            jTxt.setForeground(txtForeground4);
        }

        //Go through the list
        for (int i = 0; i < listTxt.length; i++) {
            for (int j = 0; j < listTxt[0].length; j++) {

                //Verify if position in which we are is equal to txt that we pass
                if (listTxt[i][j] == txt) {

                    //Change color of rows, columns                  
                    //Go through all txt of column in which we are
                    for (int k = 0; k < listTxt.length; k++) {
                        listTxt[k][j].setBackground(txtBackground2);
                        //listTxt[k][j].setForeground(txtForeground2);                        

                        listTxtAssist.add(listTxt[k][j]);
                    }

                    //Go through all txt of row in which we are
                    for (int k = 0; k < listTxt[0].length; k++) {
                        listTxt[i][k].setBackground(txtBackground2);
                        //listTxt[i][k].setForeground(txtForeground2);

                        listTxtAssist.add(listTxt[i][k]);
                    }

                    //Create 2 variables obtain the last position of quadarnt in which we are plus one
                    int posI = sudoku.subCurrentQuadrant(i);
                    int posJ = sudoku.subCurrentQuadrant(j);

                    //Go through quadrant
                    //Columns go from position minus three until variable k is less than position
                    for (int k = posI - 3; k < posI; k++) {
                        for (int l = posJ - 3; l < posJ; l++) {
                            listTxt[k][l].setBackground(txtBackground2);
                            //listTxt[k][l].setForeground(txtForeground2);

                            listTxtAssist.add(listTxt[k][l]);
                        }
                    }

                    //Change color for each box
                    listTxt[i][j].setBackground(txtBackground3);
                    listTxt[i][j].setForeground(txtForeground3);
                    listTxt[i][j].setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));

                    //Return since we already found object no longer
                    return;
                }
            }
        }
    }

    //CLEAR BUTTON
    public void clear() {
        for (int i = 0; i < listTxt.length; i++) {
            for (int j = 0; j < listTxt[0].length; j++) {
                boolean b = false;

                //Go through list of generate txts
                for (JTextField txt : listTxtGenerate) {

                    //Check if txt we are in is part of generated txts
                    if (listTxt[i][j] == txt) {
                        b = true;
                        break;
                    }
                }
                if (!b) {
                    listTxt[i][j].setText("");
                }
            }
        }
    }

    //CREATE BUTTON
    public boolean createSudokuCustom() {
        sudoku.clearSudoku();
        for (int i = 0; i < listTxt.length; i++) {
            for (int j = 0; j < listTxt[0].length; j++) {

                //Verify if txt is empty or not, if not add number to sudoku matrix
                if (!(listTxt[i][j].getText().isEmpty())) {
                    int num = Integer.valueOf(listTxt[i][j].getText());

                    //Verify if number is already in rows, columns and quadrants
                    if (sudoku.validateRow(i, num) && sudoku.validateColumn(j, num) && sudoku.validateQuadrant(i, j, num)) {
                        sudoku.getSudoku()[i][j] = num;
                        listTxt[i][j].setBackground(txtBackground4);
                        listTxt[i][j].setForeground(txtForeground4);
                        listTxt[i][j].setBorder(BorderFactory.createLineBorder(panelBackground, 1));
                        listTxtGenerate.add(listTxt[i][j]);
                    } else {
                        listTxtGenerate.clear();
                        JOptionPane.showMessageDialog(null, "Incorrect Sudoku!", "ERROR", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
                } else {
                    listTxt[i][j].setBackground(txtBackground1);
                    listTxt[i][j].setForeground(txtForeground1);
                    listTxt[i][j].setBorder(BorderFactory.createLineBorder(panelBackground, 1));
                }
            }
        }
        return true;
    }

    //CHECK BUTTON
    public void check() {

        //Create 9x9 matrix
        int sud[][] = new int[9][9];
        for (int i = 0; i < listTxt.length; i++) {
            for (int j = 0; j < listTxt[0].length; j++) {

                //Verify if there is any txt that is empty
                if (listTxt[i][j].getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Incompleted Sudoku!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    sud[i][j] = Integer.parseInt(listTxt[i][j].getText());
                }
            }
        }
        sudoku.setSudoku(sud);
        if (sudoku.checkSudoku()) {
            JOptionPane.showMessageDialog(null, "Correct Sudoku!", "Sudoku", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Sudoku!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    //SOLVE BUTTON
    public void solve() {
        sudoku.clearSudoku();
        for (int i = 0; i < listTxt.length; i++) {
            for (int j = 0; j < listTxt[0].length; j++) {

                //Go jthrough list of generated txt
                for (JTextField txt : listTxtGenerate) {

                    //Verify if txt that we are going through is part of list of generated txt
                    if (txt == listTxt[i][j]) {
                        sudoku.getSudoku()[i][j] = Integer.parseInt(txt.getText());
                    }
                }
            }
        }

        if (sudoku.solveSudoku()) {
            for (int i = 0; i < listTxt.length; i++) {
                for (int j = 0; j < listTxt[0].length; j++) {
                    listTxt[i][j].setText(String.valueOf(sudoku.getSudoku()[i][j]));
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Incorrected Sudoku!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean txtGenerate(JTextField txt) {
        for (JTextField jTxt : listTxtGenerate) {

            //Check if txt that we pass a parameter is in list
            if (txt == jTxt) {
                return true;
            }
        }
        return false;
    }

    public Color getTxtBackground4() {
        return txtBackground4;
    }

    public void setTxtBackground4(Color txtBackground4) {
        this.txtBackground4 = txtBackground4;
    }

    public Color getTxtForeground4() {
        return txtForeground4;
    }

    public void setTxtForeground4(Color txtForeground4) {
        this.txtForeground4 = txtForeground4;
    }

    public JTextField[][] getListTxt() {
        return listTxt;
    }

    public void setListTxt(JTextField[][] listTxt) {
        this.listTxt = listTxt;
    }

    public int getTxtWidth() {
        return txtWidth;
    }

    public void setTxtWidth(int txtWidth) {
        this.txtWidth = txtWidth;
    }

    public int getTxtHeight() {
        return txtHeight;
    }

    public void setTxtHeight(int txtHeight) {
        this.txtHeight = txtHeight;
    }

    public int getTxtMargin() {
        return txtMargin;
    }

    public void setTxtMargin(int txtMargin) {
        this.txtMargin = txtMargin;
    }

    public int getTxtFontSize() {
        return txtFontSize;
    }

    public void setTxtFontSize(int txtFontSize) {
        this.txtFontSize = txtFontSize;
    }

    public Color getPanelBackground() {
        return panelBackground;
    }

    public void setPanelBackground(Color panelBackground) {
        this.panelBackground = panelBackground;
    }

    public Color getTxtBackground1() {
        return txtBackground1;
    }

    public void setTxtBackground1(Color txtBackground1) {
        this.txtBackground1 = txtBackground1;
    }

    public Color getTxtForeground1() {
        return txtForeground1;
    }

    public void setTxtForeground1(Color txtForeground1) {
        this.txtForeground1 = txtForeground1;
    }

    public Color getTxtBackground2() {
        return txtBackground2;
    }

    public void setTxtBackground2(Color txtBackground2) {
        this.txtBackground2 = txtBackground2;
    }

    public Color getTxtForeground2() {
        return txtForeground2;
    }

    public void setTxtForeground2(Color txtForeground2) {
        this.txtForeground2 = txtForeground2;
    }

    public Color getTxtBackground3() {
        return txtBackground3;
    }

    public void setTxtBackground3(Color txtBackground3) {
        this.txtBackground3 = txtBackground3;
    }

    public Color getTxtForeground3() {
        return txtForeground3;
    }

    public void setTxtForeground3(Color txtForeground3) {
        this.txtForeground3 = txtForeground3;
    }

}
