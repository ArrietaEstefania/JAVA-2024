/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseherenciausuario;

import java.util.Date;

/**
 *
 * @author Desarrollo Software
 */
public class Cliente extends Usuario {
    
    private int mesRegistro;
    private int anioRegistro;
    private int montoCompraTotal;

    public Cliente() {
    }

    public Cliente(int mesRegistro, int anioRegistro, int montoCompraTotal) {
        this.mesRegistro = mesRegistro;
        this.anioRegistro = anioRegistro;
        this.montoCompraTotal = montoCompraTotal;
    }

    public Cliente(int mesRegistro, int anioRegistro, int montoCompraTotal, String nombre, int dni) {
        super(nombre, dni);
        this.mesRegistro = mesRegistro;
        this.anioRegistro = anioRegistro;
        this.montoCompraTotal = montoCompraTotal;
    }

    public int getMesRegistro() {
        return mesRegistro;
    }

    public void setMesRegistro(int mesRegistro) {
        this.mesRegistro = mesRegistro;
    }

    public int getAnioRegistro() {
        return anioRegistro;
    }

    public void setAnioRegistro(int anioRegistro) {
        this.anioRegistro = anioRegistro;
    }

    public int getMontoCompraTotal() {
        return montoCompraTotal;
    }

    public void setMontoCompraTotal(int montoCompraTotal) {
        this.montoCompraTotal = montoCompraTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente{" + "mesRegistro=" + mesRegistro + ", anioRegistro=" + anioRegistro + ", montoCompraTotal=" + montoCompraTotal + '}';
    }

    

   
    
    
}
