/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.claseherenciausuario;
import java.util.Date;


/**import java.util.Date;

 *
 * @author Desarrollo Software
 */
public class ClaseHerenciaUsuario {

    public static void main(String[] args) {
        
        Cliente c1=new Cliente(02, 2022, 1500, "Roman", 40404040);
        System.out.println("cliente "+ c1.getNombre()+", fecha de registro mm/aaaa "+c1.getMesRegistro()+"/"+c1.getAnioRegistro()+ ", monto total de compra = "+ c1.getMontoCompraTotal());
        
        c1.setMontoCompraTotal(2500);
        System.out.println("monto total de compra modificado");
        System.out.println("cliente "+ c1.getNombre()+", fecha de registro mm/aaaa "+c1.getMesRegistro()+"/"+c1.getAnioRegistro()+ ", monto total de compra = "+ c1.getMontoCompraTotal());
        
        Administrativo a1= new Administrativo(505, 2022, "Fernando", 40456511);
        System.out.println("Administrativo numero uno llamado " + a1.getNombre()+ " Codigo de empleado:  "+ a1.getCodigoEmpleado()+"/ año de ingreso:" + a1.getAnioIngreso());
        System.out.println("modificaremos el codigo de empleado de Fernando");
        a1.setCodigoEmpleado(506);
        System.out.println("Administrativo numero uno llamado " + a1.getNombre()+ " Codigo de empleado:  "+ a1.getCodigoEmpleado()+"/ año de ingreso:" + a1.getAnioIngreso());
        

    }
}
