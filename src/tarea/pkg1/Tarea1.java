
package tarea.pkg1;

import java.util.Scanner;

public class Tarea1 {

    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = (int) (Math.random() * 50 + 1);
        int numero2 = (int) (Math.random() * 50 + 1);
        int numero3 = (int) (Math.random() * 50 + 1);
        int[][] matriz = new int[3][3];
        int suma = 0;//Almacena la suma de todas las diagonales
        int suma2 = 0;
        for (int a = 0; a < 3; a++) {// filas
            for (int b = 0; b < 3; b++) {// columnas
                matriz[0][b] = numero;
                matriz[1][b] = numero2;
                matriz[2][2] = numero3;

                if (a == b) {////diagonal izquierda
                    suma += matriz[a][b];
                }
                if (a == b - 1) {//diagonal derecha
                    suma2 += matriz[a][b];

                }
                System.out.print(matriz[a][b] + " ");//Imprime la matriz

            }
            System.out.println(" ");

        }
        System.out.print("La suma de las diagonales es:" + suma + " ");//imprime la diagonal izquierda
        System.out.println(" ");
        System.out.print("La suma de las diagonales es:" + suma2 + " ");//imprime la diagonal derecha
    }//Fin del metodo main

}
