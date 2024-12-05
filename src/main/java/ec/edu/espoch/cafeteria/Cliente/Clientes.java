/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.cafeteria.Cliente;

/**
 *
 * @author SO-LAB1-PC14
 */
public class Clientes {
    
    private String nombreCliente;

    public Clientes() {
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    public void presentar (){
        
        System.out.println("Se ha ingresado el cliente: " + nombreCliente);
        

}
    
    
}
