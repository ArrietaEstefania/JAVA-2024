/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmo_burbuja;

/**
 *
 * @author 54261
 */
public class Ord_intercambio {
    int aux;
    
    void intercambiar(int a[], int i, int j){
        aux=a[i];
        a[i]=a[j];
        a[j]=aux;
    }
    
    void ordIntercambio_opt(int a[]){
        int i,j;
        for (i = 0; i < a.length-1; i++) {
            for (j = i+1; j < a.length; j++) {
                if (a[i]>a[j]) {
                    intercambiar(a,i,j);
                }
            }
        }
    }
}
