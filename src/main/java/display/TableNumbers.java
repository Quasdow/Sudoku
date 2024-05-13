/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package display;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import screen.FormSudoku;

/**
 *
 * @author baduy
 */
public class TableNumbers extends JPanel {

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

    private TableSudoku tableSudoku;

    public TableNumbers() {
        initiateComponent();
        tableSudoku = FormSudoku.tableSudoku;
    }

    public void initiateComponent() {
        txtWidth = 45;
        txtHeight = 45;
        txtMargin = 3;
        txtFontSize = 30;

        panelBackground = Color.BLACK;

        txtBackground1 = Color.WHITE;
        txtForeground1 = Color.BLACK;
        txtBackground2 = Color.WHITE;
        txtForeground2 = Color.BLACK;
        txtBackground3 = Color.WHITE;
        txtForeground3 = Color.BLACK;
    }

    public void createTable() {
        this.setLayout(null);

        //Assign size
        this.setSize((txtWidth * 9) + (4 * txtMargin), txtHeight + (2 * txtMargin));
        this.setBackground(panelBackground);

        createFieldTxt();
    }

    public void createFieldTxt() {
        int x = txtMargin;
        int y = txtMargin;

        for (int i = 0; i < 9; i++) {
            JTextField txt = new JTextField();
            this.add(txt);

            txt.setBounds(x, y, txtWidth, txtHeight);
            txt.setBackground(txtBackground1);
            txt.setForeground(txtForeground1);

            txt.setCursor(new Cursor(Cursor.HAND_CURSOR));
            txt.setEditable(false);

            txt.setBorder(BorderFactory.createLineBorder(panelBackground, 1));
            txt.setFont(new Font("Cambria", Font.BOLD, txtFontSize));

            // Center align text
            txt.setHorizontalAlignment(JTextField.CENTER);

            //Assign numbers from 1 to 9
            txt.setText(String.valueOf(i + 1));

            //Add width after each txt is created at position
            x += txtWidth;
            if ((i + 1) % 3 == 0) {
                x += txtMargin;
            }
            generateEventsTxt(txt);
        }
    }

    public void generateEventsTxt(JTextField txt) {
        MouseListener event = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (tableSudoku.txtGenerate(tableSudoku.txtSelected)) {
                    return;
                }
                tableSudoku.txtSelected.setText(txt.getText());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                txt.setBackground(txtBackground2);
                txt.setForeground(txtForeground2);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                txt.setBackground(txtBackground1);
                txt.setForeground(txtForeground1);
            }
        };
        txt.addMouseListener(event);
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
