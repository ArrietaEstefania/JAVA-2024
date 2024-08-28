/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmo_quicksort;

/**
 *
 * @author 54261
 */
public class Quicksort {
    
    int aux;
    
    void intercambiar(int a[], int i, int j){
        aux=a[i];
        a[i]=a[j];
        a[j]=aux;
    }
    
    void quicksort(int a[]){
        quicksort(a,0,a.length-1); 
    }
    
    void quicksort(int a[], int primero, int ultimo){
        int i=primero;
        int j=ultimo;
        int central=(primero + ultimo)/2;
        double pivote=a[central];
        
        do {
            while(a[i]<pivote)i++;
            while(a[j]>pivote)j--;
            if (i<=j){
                intercambiar(a,i,j);
                i++;j--;
            }
            
        } while (i<=j);
        
        if (primero<j) {
            quicksort(a,primero,j);
        }
        if (ultimo>i) {
            quicksort(a,i,ultimo);
        }
        
    }
}
