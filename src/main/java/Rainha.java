package main.java;

public class Rainha {
    public static void main(String[] args) {
        long[][] matriz = new long[8][8];

        long soma = 0;
        long valor = 1;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = valor;
                soma += valor;
                valor = valor * 2;
                System.out.println(soma);
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matriz[i][j] + ", " );
            }
            System.out.println();
        }
    }
}
