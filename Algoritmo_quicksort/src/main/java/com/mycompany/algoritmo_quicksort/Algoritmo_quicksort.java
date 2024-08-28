/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_quicksort;

import java.util.Scanner;

/**
 *
 * @author 54261
 */
public class Algoritmo_quicksort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Quicksort quicksort=new Quicksort();
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
            System.out.print("["+a[i]+"] ");
        }
        
        quicksort.quicksort(a);
        
        System.out.println("");
        System.out.println("lista ordenada");
        for (i = 0; i < a.length; i++) {
            System.out.print("["+a[i]+"] ");
        } 
    }
}
