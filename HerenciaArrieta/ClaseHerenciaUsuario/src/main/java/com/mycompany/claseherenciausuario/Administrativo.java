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
public class Administrativo extends Usuario  {
    private int codigoEmpleado;
    private int anioIngreso;

    public Administrativo(int codigoEmpleado, int anioIngreso) {
        this.codigoEmpleado = codigoEmpleado;
        this.anioIngreso = anioIngreso;
    }

    public Administrativo(int codigoEmpleado, int anioIngreso, String nombre, int dni) {
        super(nombre, dni);
        this.codigoEmpleado = codigoEmpleado;
        this.anioIngreso = anioIngreso;
    }

    public Administrativo() {
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
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
        return "Administrativo{" + "codigoEmpleado=" + codigoEmpleado + ", anioIngreso=" + anioIngreso + '}';
    }

    
}
