/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author Daniel Ríos
 */
public class Ejercicios_Semana2_PracticaEnClase {

    public Ejercicios_Semana2_PracticaEnClase() {
    }

    public void quiz2_A_primos() {

    }

    public void quiz2_B_piramide(int n) {

        for (int i = 1; i <= n; i++) {
            //controla los espacios vacios//
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }//endForInterno_A

            //controla los * de la piramide
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }//endForInterno_B
            System.out.println("");
        }//endMetodo

        System.out.println("");
        System.out.println("\n----------------------");
    }

    public void ejercicio_A() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("\n----------------------");
    }

    public void ejercicio_B(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n----------------------");
    }

    public void ejercicio_C(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n----------------------");
    }

    public void ejercicio_D() {
        int[] n = {7, 2, 9, 1, 5, 3, 8, 6, 4, 0};
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1 - i; j++) {
                if (n[j] > n[j + 1]) {
                    n[j] = n[j] + n[j + 1];
                    n[j + 1] = n[j] - n[j + 1];
                    n[j] = n[j] - n[j + 1];
                }
            }
        }
        System.out.println("Numeros ordenados:");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }

        System.out.println("\n----------------------");
    }

    public void ejercicio_E() {
        int[] n = new int[100];
        for (int i = 0; i < n.length; i++) {
            n[i] = 100 - i;
        }
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1 - i; j++) {
                if (n[j] < n[j + 1]) {
                    n[j] = n[j] + n[j + 1];
                    n[j + 1] = n[j] - n[j + 1];
                    n[j] = n[j] - n[j + 1];
                }
            }
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println("\n----------------------");
    }

    public void ejercicio_F() {
        String[][] tablero = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = " ";
            }
        }
        tablero[0][1] = "N";
        tablero[0][3] = "N";
        tablero[1][0] = "N";
        tablero[1][2] = "N";
        tablero[1][4] = "N";
        tablero[2][1] = "N";
        tablero[2][3] = "N";

        tablero[5][0] = "R";
        tablero[5][2] = "R";
        tablero[5][4] = "R";
        tablero[6][1] = "R";
        tablero[6][3] = "R";
        tablero[6][5] = "R";
        tablero[7][2] = "R";
        tablero[7][4] = "R";
        tablero[7][6] = "R";

        System.out.println("   1   2   3   4   5   6   7   8");
        char filaLetra = 'A';
        for (int i = 0; i < 8; i++) {
            System.out.print(filaLetra + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print(" " + tablero[i][j] + "  ");
            }
            System.out.println();
            filaLetra++;
        }
        System.out.println("\n----------------------");
    }
}
