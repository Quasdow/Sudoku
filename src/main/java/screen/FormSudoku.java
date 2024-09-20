/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screen;

import display.TableNumbers;
import display.TableSudoku;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author baduy
 */
public final class FormSudoku extends javax.swing.JFrame {

    public static TableSudoku tableSudoku;
    private TableNumbers tableNumbers;
    private FormLevels formLevels;
    private boolean stateSolve;

    public FormSudoku() {

        initComponents();
        initiateComponent();

        setIconImage(new ImageIcon("src/main/java/images/icon.png").getImage());
        setTitle("Sudoku");
    }

    public void initiateComponent() {
        tableSudoku = new TableSudoku();
        tableSudoku.setTxtWidth(45);
        tableSudoku.setTxtHeight(45);
        tableSudoku.setTxtMargin(3);
        tableSudoku.setTxtFontSize(35);

        tableSudoku.setPanelBackground(new Color(25, 25, 112));

        tableSudoku.setTxtBackground1(Color.WHITE);
        tableSudoku.setTxtForeground1(new Color(65, 105, 225));
        tableSudoku.setTxtBackground2(new Color(220, 220, 220));
        tableSudoku.setTxtForeground2(Color.BLACK);
        tableSudoku.setTxtBackground3(new Color(99, 184, 255));
        tableSudoku.setTxtForeground3(Color.WHITE);

        tableSudoku.setTxtBackground4(new Color(250, 240, 230));
        tableSudoku.setTxtForeground4(Color.BLACK);

        panelBottom.add(tableSudoku);
        tableSudoku.setLocation(30, 80);
        tableSudoku.setVisible(true);
        tableSudoku.createSudoku();

        //Table numbers
        tableNumbers = new TableNumbers();
        tableNumbers.setTxtWidth(45);
        tableNumbers.setTxtHeight(45);
        tableNumbers.setTxtMargin(3);
        tableNumbers.setTxtFontSize(30);

        tableNumbers.setPanelBackground(new Color(25, 25, 112));
        tableNumbers.setTxtBackground1(new Color(224, 255, 255));
        tableNumbers.setTxtForeground1(new Color(25, 25, 112));
        tableNumbers.setTxtBackground2(new Color(25, 25, 112));
        tableNumbers.setTxtForeground2(Color.WHITE);

        panelBottom.add(tableNumbers);
        tableNumbers.createTable();
        tableNumbers.setLocation(30, 10);
        tableNumbers.setVisible(true);

        //tableSudoku.generateSudoku(4);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBottom = new javax.swing.JPanel();
        solvePanel = new javax.swing.JPanel();
        solveLabel = new javax.swing.JLabel();
        newGamePanel = new javax.swing.JPanel();
        newGameLabel = new javax.swing.JLabel();
        backPanel = new javax.swing.JPanel();
        backLabel = new javax.swing.JLabel();
        clearPanel = new javax.swing.JPanel();
        clearLabel = new javax.swing.JLabel();
        checkPanel = new javax.swing.JPanel();
        checkLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelBottom.setBackground(new java.awt.Color(248, 248, 255));
        panelBottom.setLayout(null);

        solvePanel.setBackground(new java.awt.Color(100, 149, 237));
        solvePanel.setToolTipText("");
        solvePanel.setAutoscrolls(true);
        solvePanel.setPreferredSize(new java.awt.Dimension(170, 70));
        solvePanel.setVerifyInputWhenFocusTarget(false);

        solveLabel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        solveLabel.setForeground(new java.awt.Color(255, 255, 255));
        solveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        solveLabel.setText("SOLVE");
        solveLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        solveLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                solveLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                solveLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                solveLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout solvePanelLayout = new javax.swing.GroupLayout(solvePanel);
        solvePanel.setLayout(solvePanelLayout);
        solvePanelLayout.setHorizontalGroup(
            solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solvePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(solveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        solvePanelLayout.setVerticalGroup(
            solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solvePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(solveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelBottom.add(solvePanel);
        solvePanel.setBounds(520, 350, 150, 50);

        newGamePanel.setBackground(new java.awt.Color(0, 0, 205));
        newGamePanel.setToolTipText("");
        newGamePanel.setAutoscrolls(true);
        newGamePanel.setPreferredSize(new java.awt.Dimension(170, 70));
        newGamePanel.setVerifyInputWhenFocusTarget(false);

        newGameLabel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        newGameLabel.setForeground(new java.awt.Color(255, 255, 255));
        newGameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newGameLabel.setText("NEW GAME");
        newGameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newGameLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newGameLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newGameLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newGameLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout newGamePanelLayout = new javax.swing.GroupLayout(newGamePanel);
        newGamePanel.setLayout(newGamePanelLayout);
        newGamePanelLayout.setHorizontalGroup(
            newGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newGamePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(newGameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        newGamePanelLayout.setVerticalGroup(
            newGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newGamePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(newGameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelBottom.add(newGamePanel);
        newGamePanel.setBounds(520, 110, 150, 50);

        backPanel.setBackground(new java.awt.Color(255, 48, 48));
        backPanel.setToolTipText("");
        backPanel.setAutoscrolls(true);
        backPanel.setPreferredSize(new java.awt.Dimension(170, 70));
        backPanel.setVerifyInputWhenFocusTarget(false);

        backLabel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        backLabel.setForeground(new java.awt.Color(255, 255, 255));
        backLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backLabel.setText(" BACK");
        backLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelBottom.add(backPanel);
        backPanel.setBounds(520, 430, 150, 50);

        clearPanel.setBackground(new java.awt.Color(100, 149, 237));
        clearPanel.setToolTipText("");
        clearPanel.setAutoscrolls(true);
        clearPanel.setPreferredSize(new java.awt.Dimension(170, 70));
        clearPanel.setVerifyInputWhenFocusTarget(false);

        clearLabel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        clearLabel.setForeground(new java.awt.Color(255, 255, 255));
        clearLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearLabel.setText("CLEAR");
        clearLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout clearPanelLayout = new javax.swing.GroupLayout(clearPanel);
        clearPanel.setLayout(clearPanelLayout);
        clearPanelLayout.setHorizontalGroup(
            clearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clearPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        clearPanelLayout.setVerticalGroup(
            clearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clearPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelBottom.add(clearPanel);
        clearPanel.setBounds(520, 190, 150, 50);

        checkPanel.setBackground(new java.awt.Color(100, 149, 237));
        checkPanel.setToolTipText("");
        checkPanel.setAutoscrolls(true);
        checkPanel.setPreferredSize(new java.awt.Dimension(170, 70));
        checkPanel.setVerifyInputWhenFocusTarget(false);

        checkLabel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        checkLabel.setForeground(new java.awt.Color(255, 255, 255));
        checkLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkLabel.setText("CHECK");
        checkLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                checkLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout checkPanelLayout = new javax.swing.GroupLayout(checkPanel);
        checkPanel.setLayout(checkPanelLayout);
        checkPanelLayout.setHorizontalGroup(
            checkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(checkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        checkPanelLayout.setVerticalGroup(
            checkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(checkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelBottom.add(checkPanel);
        checkPanel.setBounds(520, 270, 150, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newGameLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameLabelMousePressed

        //Check if form is different from number
        //That is, it is already created
        if (formLevels != null) {
            formLevels.setVisible(true);
        } else {
            //That is not, we create it
            formLevels = new FormLevels(tableSudoku);
            formLevels.setVisible(true);
        }

        clearLabel.setVisible(true);
        checkLabel.setVisible(true);
        solveLabel.setVisible(true);
    }//GEN-LAST:event_newGameLabelMousePressed

    private void clearLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearLabelMousePressed
        tableSudoku.clear();
    }//GEN-LAST:event_clearLabelMousePressed

    private void backLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMousePressed
        FormMenu menuScreen = new FormMenu();
        menuScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backLabelMousePressed

    private void checkLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkLabelMousePressed
        tableSudoku.check();
    }//GEN-LAST:event_checkLabelMousePressed

    private void solveLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solveLabelMousePressed

        if (stateSolve) {
            clearLabel.setVisible(false);
            checkLabel.setVisible(false);
            solveLabel.setVisible(false);
            tableSudoku.solve();
            stateSolve = false;
        } else {
            clearLabel.setVisible(true);
            checkLabel.setVisible(true);
            solveLabel.setVisible(true);
            stateSolve = true;
        }
    }//GEN-LAST:event_solveLabelMousePressed


    private void newGameLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameLabelMouseEntered
        newGamePanel.setBackground(new Color(65, 105, 225));
    }//GEN-LAST:event_newGameLabelMouseEntered

    private void newGameLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameLabelMouseExited
        newGamePanel.setBackground(new Color(0, 0, 205));
    }//GEN-LAST:event_newGameLabelMouseExited

    private void clearLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearLabelMouseEntered
        clearPanel.setBackground(new Color(135, 206, 235));
    }//GEN-LAST:event_clearLabelMouseEntered

    private void clearLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearLabelMouseExited
        clearPanel.setBackground(new Color(100, 149, 237));
    }//GEN-LAST:event_clearLabelMouseExited

    private void checkLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkLabelMouseEntered
        checkPanel.setBackground(new Color(135, 206, 235));
    }//GEN-LAST:event_checkLabelMouseEntered

    private void checkLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkLabelMouseExited
        checkPanel.setBackground(new Color(100, 149, 237));
    }//GEN-LAST:event_checkLabelMouseExited

    private void solveLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solveLabelMouseEntered
        solvePanel.setBackground(new Color(135, 206, 235));
    }//GEN-LAST:event_solveLabelMouseEntered

    private void solveLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solveLabelMouseExited
        solvePanel.setBackground(new Color(100, 149, 237));
    }//GEN-LAST:event_solveLabelMouseExited

    private void backLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseEntered
        backPanel.setBackground(new Color(255, 106, 106));
    }//GEN-LAST:event_backLabelMouseEntered

    private void backLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseExited
        backPanel.setBackground(new Color(255, 48, 48));
    }//GEN-LAST:event_backLabelMouseExited

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JPanel backPanel;
    private javax.swing.JLabel checkLabel;
    private javax.swing.JPanel checkPanel;
    private javax.swing.JLabel clearLabel;
    private javax.swing.JPanel clearPanel;
    private javax.swing.JLabel newGameLabel;
    private javax.swing.JPanel newGamePanel;
    private javax.swing.JPanel panelBottom;
    private javax.swing.JLabel solveLabel;
    private javax.swing.JPanel solvePanel;
    // End of variables declaration//GEN-END:variables
}
