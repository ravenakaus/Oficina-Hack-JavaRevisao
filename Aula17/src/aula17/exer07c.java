/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17;

import java.util.Scanner;

/**
 *
 * @author Ravs
 */
public class exer07c {
    public static void main(String[] args) {
        /* Faça um programa que crie um vetor A com 15 elementos, um vetor B
        de mesmo tamanho e faça as seguintes operações:
        B[i] = A[i] * A[i];
        */

        Scanner scan = new Scanner(System.in);
        int[] A = new int[15];
        int[] B = new int[A.length];
        

        for (int i=0; i<A.length; i++) {
           System.out.println("Indique o valor da posição " + i +": ");
           A[i] = scan.nextInt();

           B[i] = (A[i]) * A[i];
        }
        
        System.out.print("Array A = ");
        for (int i=0; i<A.length; i++) {
           System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.print("Array B = ");
        for (int i=0; i<B.length; i++) {
           System.out.print(B[i] + " ");
        }
        
        scan.close();
    }
}
