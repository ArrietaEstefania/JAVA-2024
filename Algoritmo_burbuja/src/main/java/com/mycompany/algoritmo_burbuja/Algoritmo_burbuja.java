/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_burbuja;

import java.util.Scanner;

/**
 *
 * @author 54261
 */
public class Algoritmo_burbuja {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Ord_intercambio burbuja=new Ord_intercambio();
        int i,n;
        
        System.out.println("ingresar el numero de elementos");
        n=sc.nextInt();
        int a[]= new int[n];
        int b[]= new int[n];
        
        for (i= 0; i < n; i++) {
            a[i]=(int)(Math.random() * 2000 + 1);
        }
        
        System.arraycopy(a, 0, b, 0, n);
        
        System.out.println("lista original");
        for (i = 0; i < n; i++) {
            System.out.println("["+a[i]+"] ");
        }
        
        burbuja.ordIntercambio_opt(b);
        System.out.println("");
        System.out.println("lista ordenada");
        for (i = 0; i < n; i++) {
            System.out.println("["+b[i]+"] ");
        } 
    }
}
