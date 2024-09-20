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
public final class FormCreateSudoku extends javax.swing.JFrame {

    public static TableSudoku tableSudoku;
    private boolean stateCreate;
    private boolean stateSolve;

    public FormCreateSudoku() {

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
        tableSudoku.setLocation(75, 80);
        tableSudoku.setVisible(true);
        tableSudoku.createSudoku();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBottom = new javax.swing.JPanel();
        solvePanel = new javax.swing.JPanel();
        solveLabel = new javax.swing.JLabel();
        createPanel = new javax.swing.JPanel();
        createLabel = new javax.swing.JLabel();
        backPanel = new javax.swing.JPanel();
        backLabel = new javax.swing.JLabel();

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
        solvePanel.setBounds(210, 10, 150, 50);

        createPanel.setBackground(new java.awt.Color(255, 215, 0));
        createPanel.setToolTipText("");
        createPanel.setAutoscrolls(true);
        createPanel.setPreferredSize(new java.awt.Dimension(170, 70));
        createPanel.setVerifyInputWhenFocusTarget(false);

        createLabel.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        createLabel.setForeground(new java.awt.Color(255, 255, 255));
        createLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createLabel.setText("CREATE");
        createLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                createLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout createPanelLayout = new javax.swing.GroupLayout(createPanel);
        createPanel.setLayout(createPanelLayout);
        createPanelLayout.setHorizontalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(createLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        createPanelLayout.setVerticalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(createLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelBottom.add(createPanel);
        createPanel.setBounds(20, 10, 150, 50);

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
        backPanel.setBounds(400, 10, 150, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBottom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createLabelMousePressed
        if (stateCreate) {
            solveLabel.setVisible(false);
            stateCreate = false;

            tableSudoku.clearTxt();
            createLabel.setText("READY");
        } else {
            if (tableSudoku.createSudokuCustom()) {
                solveLabel.setVisible(true);
                stateCreate = true;
                createLabel.setText("CREATE");
            }
        }
    }//GEN-LAST:event_createLabelMousePressed

    private void backLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMousePressed
        FormMenu menuScreen = new FormMenu();
        menuScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backLabelMousePressed

    private void solveLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solveLabelMousePressed
        if (stateSolve) {
            solveLabel.setVisible(false);
            tableSudoku.solve();
            stateSolve = false;
        } else {
            solveLabel.setVisible(true);
            stateSolve = true;
        }
    }//GEN-LAST:event_solveLabelMousePressed


    private void createLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createLabelMouseEntered
        createPanel.setBackground(new Color(255, 236, 139));
    }//GEN-LAST:event_createLabelMouseEntered

    private void createLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createLabelMouseExited
        createPanel.setBackground(new Color(255, 215, 0));
    }//GEN-LAST:event_createLabelMouseExited

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
    private javax.swing.JLabel createLabel;
    private javax.swing.JPanel createPanel;
    private javax.swing.JPanel panelBottom;
    private javax.swing.JLabel solveLabel;
    private javax.swing.JPanel solvePanel;
    // End of variables declaration//GEN-END:variables
}
