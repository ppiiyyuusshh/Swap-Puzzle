
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import puzzle.Puzzle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author piyus
 */
public class puzzledeginer extends javax.swing.JFrame {

    /**
     * Creates new form puzzledeginer
     */
    public puzzledeginer() {
        initComponents();
    }
        int solArray[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
        void shuffle(int[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            int randomIndexToSwap = rand.nextInt(a.length);
            int temp = a[randomIndexToSwap];
            a[randomIndexToSwap] = a[i];
            a[i] = temp;
        }
//JOptionPane.showMessageDialog(null, Arrays.toString(a));
        System.out.println(Arrays.toString(a));
    }
        int[] findZero(int[][] a) {
        int n[] = new int[2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == 0) {
                    n[0] = i;
                    n[1] = j;
                    return n;
                }

            }
        }
        return n;
    }
         int equalityCheck(int arr[][]) {
        int flag = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == solArray[i][j]) {
                    flag = flag + 1;
                } else {
                    break;
                }

            }
        }
        return flag;
    }

            void show(int arr[][]) {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println("");
        }
    }

 void gameOn(int arr[][]) {
        int flag;
        int arrow = 0;//999 for exit
        puzzledeginer p = new puzzledeginer();

        Scanner sc = new Scanner(System.in);
        int temp;
        do {
            int zero[] = p.findZero(arr);
            String check = zero[0] + "" + zero[1];

            switch (check) {
                case "00":

                    do {                       
                        System.out.println("enter");
                        arrow = sc.nextInt();
                        switch (arrow) {
                            case 2:
                                temp = arr[1][0];
                                arr[1][0] = arr[0][0];
                                arr[0][0] = temp;

                                break;

                            case 6:
                                temp = arr[0][1];
                                arr[0][1] = arr[0][0];
                                arr[0][0] = temp;
                                break;
                                case 999 : 
                                break;

                            default:   
                                JOptionPane.showMessageDialog(null, "please enter a valid direction or 999 to exit");
                              // System.out.println("please enter a valid direction or 999 to exit");
                                break;
                        }
                    } while (arrow != 2 && arrow != 6 && arrow!=999);
                    p.show(arr);
                    break;
                case "01":

                    do {
                        System.out.println("enter");
                        arrow = sc.nextInt();
                        switch (arrow) {
                            case 2:
                                temp = arr[1][1];
                                arr[1][1] = arr[0][1];
                                arr[0][1] = temp;

                                break;
                            case 4:
                                temp = arr[0][0];
                                arr[0][0] = arr[0][1];
                                arr[0][1] = temp;
                                break;

                            case 6:
                                temp = arr[0][2];
                                arr[0][2] = arr[0][1];
                                arr[0][1] = temp;
                                break;
                                
                                case 999 : 
                                break;

                            default:
                                 JOptionPane.showMessageDialog(null, "please enter a valid direction or 999 to exit");
                                //System.out.println("please enter a valid direction or 999 to exit");
                                break;
                        }
                    } while (arrow != 2 && arrow != 6 && arrow != 4 && arrow!=999);
                    p.show(arr);
                    break;
                case "02":

                    do {
                        System.out.println("enter");
                        arrow = sc.nextInt();
                        switch (arrow) {
                            case 2:
                                temp = arr[1][2];
                                arr[1][2] = arr[0][2];
                                arr[0][2] = temp;
                                break;
                            case 4:
                                temp = arr[0][1];
                                arr[0][1] = arr[0][2];
                                arr[0][2] = temp;
                                break;
                                
                                case 999 : 
                                break;

                            default:
                                 JOptionPane.showMessageDialog(null, "please enter a valid direction or 999 to exit");
                               // System.out.println("please enter a valid direction or 999 to exit");
                                break;
                        }
                    } while (arrow != 2 && arrow != 4 && arrow!=999);
                    p.show(arr);
                    break;

                case "10":

                    do {
                        System.out.println("enter");
                        arrow = sc.nextInt();
                        switch (arrow) {
                            case 2:
                                temp = arr[2][0];
                                arr[2][0] = arr[1][0];
                                arr[1][0] = temp;
                                break;

                            case 6:
                                temp = arr[1][1];
                                arr[1][1] = arr[1][0];
                                arr[1][0] = temp;
                                break;
                            case 8:
                                temp = arr[0][0];
                                arr[0][0] = arr[1][0];
                                arr[1][0] = temp;
                                break;
                                case 999 : 
                                break;
                            default:
                                 JOptionPane.showMessageDialog(null, "please enter a valid direction or 999 to exit");
                                //System.out.println("please enter a valid direction or 999 to exit");
                                break;
                        }
                    } while (arrow != 8 && arrow != 6 && arrow != 2 && arrow!=999);
                    p.show(arr);
                    break;
                case "11":
                    do {
                        System.out.println("enter");
                        arrow = sc.nextInt();
                        switch (arrow) {
                            case 2:
                                temp = arr[2][1];
                                arr[2][1] = arr[1][1];
                                arr[1][1] = temp;
                                break;
                            case 4:
                                temp = arr[1][0];
                                arr[1][0] = arr[1][1];
                                arr[1][1] = temp;
                                break;
                            case 6:
                                temp = arr[1][2];
                                arr[1][2] = arr[1][1];
                                arr[1][1] = temp;
                                break;
                            case 8:
                                temp = arr[0][1];
                                arr[0][1] = arr[1][1];
                                arr[1][1] = temp;
                                break;
                                
                                case 999 : 
                                break;
                            default:
                                 JOptionPane.showMessageDialog(null, "please enter a valid direction or 999 to exit");
                                //System.out.println("please enter a valid direction or 999 to exit");
                                break;
                        }
                    } while (arrow != 8 && arrow != 6 && arrow != 4 && arrow != 2 && arrow!=999);
                    p.show(arr);
                    break;
                case "12":
                    do {
                        System.out.println("enter");
                        arrow = sc.nextInt();
                        switch (arrow) {
                            case 2:
                                temp = arr[2][2];
                                arr[2][2] = arr[1][2];
                                arr[1][2] = temp;
                                break;
                            case 4:
                                temp = arr[1][1];
                                arr[1][1] = arr[1][2];
                                arr[1][2] = temp;
                                break;

                            case 8:
                                temp = arr[0][2];
                                arr[0][2] = arr[1][2];
                                arr[1][2] = temp;
                                break;
                            case 999 : 
                                break;
                            default:
                                 JOptionPane.showMessageDialog(null, "please enter a valid direction or 999 to exit");
                                //System.out.println("please enter a valid direction or 999 to exit");
                                break;
                        }
                    } while (arrow != 8 && arrow != 4 && arrow != 2 && arrow!=999);
                    p.show(arr);
                    break;

                case "20":
                    do {
                        System.out.println("enter");
                        arrow = sc.nextInt();
                        switch (arrow) {

                            case 6:
                                temp = arr[2][1];
                                arr[2][1] = arr[2][0];
                                arr[2][0] = temp;
                                break;
                            case 8:
                                temp = arr[1][0];
                                arr[1][0] = arr[2][0];
                                arr[2][0] = temp;
                                break;
                                
                                case 999 : 
                                break;
                            default:
                                 JOptionPane.showMessageDialog(null, "please enter a valid direction or 999 to exit");
                               // System.out.println("please enter a valid direction or 999 to exit");
                                break;
                        }
                    } while (arrow != 8 && arrow != 6 && arrow!=999);
                    p.show(arr);
                    break;
                case "21":
                    do {
                        System.out.println("enter");
                        arrow = sc.nextInt();
                        switch (arrow) {

                            case 4:
                                temp = arr[2][0];
                                arr[2][0] = arr[2][1];
                                arr[2][1] = temp;
                                break;
                            case 6:
                                temp = arr[2][2];
                                arr[2][2] = arr[2][1];
                                arr[2][1] = temp;
                                break;
                            case 8:
                                temp = arr[1][1];
                                arr[1][1] = arr[2][1];
                                arr[2][1] = temp;
                                break;
                                
                                case 999 : 
                                break;
                            default:
                                 JOptionPane.showMessageDialog(null, "please enter a valid direction or 999 to exit");
                               // System.out.println("please enter a valid direction or 999 to exit");
                                break;
                        }
                    } while (arrow != 8 && arrow != 6 && arrow != 4 && arrow!=999);
                    p.show(arr);
                    break;
                case "22":
                    do {
                        System.out.println("enter");
                        arrow = sc.nextInt();
                        switch (arrow) {
                            
                            case 4:
                                temp = arr[2][1];
                                arr[2][1] = arr[2][2];
                                arr[2][2] = temp;

                                break;
                            
                            case 8:
                                temp = arr[1][2];
                                arr[1][2] = arr[2][2];
                                arr[2][2] = temp;
                                break;
                                
                                case 999 : 
                                break;
                            default:
                                 JOptionPane.showMessageDialog(null, "please enter a valid direction or 999 to exit");
                                //System.out.println("please enter a valid direction or 999 to exit");
                                break;
                        }
                    } while (arrow != 8 && arrow != 4 && arrow!=999);
                    p.show(arr);
                    break;

            }

            flag = equalityCheck(arr);

        } while (flag != 9 && arrow != 999);
        if(flag==9){
            JOptionPane.showMessageDialog(null, "You won! Congratulations,Party kaha dera hai bhai??");
        //System.out.println("You won! Congratulations,Party kaha dera hai bhai??");
        }
        else{
            JOptionPane.showMessageDialog(null, "You lost! Fir bhi Party dede bhai??");
       // System.out.println("You lost! fir bhi party dede bhai");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        outputlable = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        leftBtn = new javax.swing.JButton();
        rightBtn = new javax.swing.JButton();
        downBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        Result = new javax.swing.JLabel();
        startBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("UP");

        leftBtn.setText("LEFT");
        leftBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftBtnActionPerformed(evt);
            }
        });

        rightBtn.setText("RIGHT");

        downBtn.setText("DOWN");

        exitBtn.setText("EXIT");

        startBtn.setText("START");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(leftBtn)
                                        .addGap(68, 68, 68)
                                        .addComponent(exitBtn))
                                    .addComponent(downBtn)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(startBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addGap(84, 84, 84)
                        .addComponent(rightBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(outputlable, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outputlable, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jButton1)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(startBtn)
                        .addGap(78, 78, 78)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leftBtn)
                    .addComponent(rightBtn)
                    .addComponent(exitBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(downBtn)
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leftBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftBtnActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
  int x[] = {1, 2, 3, 4, 5, 6, 7, 8,0};
        puzzledeginer p = new puzzledeginer();
        p.shuffle(x);
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = x[k];
                k++;
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]);
                outputlable.setText(" "+arr[i][j]);
            }
            System.out.println("");
            outputlable.setText("");
        }
         p.gameOn(arr);
        // TODO add your handling code here:
    }//GEN-LAST:event_startBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(puzzledeginer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(puzzledeginer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(puzzledeginer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(puzzledeginer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new puzzledeginer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Result;
    private javax.swing.JButton downBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton leftBtn;
    private javax.swing.JLabel outputlable;
    private javax.swing.JButton rightBtn;
    private javax.swing.JButton startBtn;
    // End of variables declaration//GEN-END:variables
}
