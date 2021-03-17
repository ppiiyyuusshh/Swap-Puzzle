package puzzle;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Puzzle {

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

    void gameOn(int arr[][]) {
        int flag;
        int arrow = 0;//999 for exit
        Puzzle p = new Puzzle();

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

    void show(int arr[][]) {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println("");
        }
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

    public static void main(String args[]) {
        int x[] = {1, 2, 3, 4, 5, 6, 7, 8,0};
        Puzzle p = new Puzzle();
       //p.shuffle(x);
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
            }
            System.out.println("");
        }

        p.gameOn(arr);
    }
}
