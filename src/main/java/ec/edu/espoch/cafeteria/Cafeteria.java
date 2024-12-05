/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.cafeteria;

import ec.edu.espoch.cafeteria.Cliente.Clientes;
import ec.edu.espoch.cafeteria.Producto.Productos;

/**
 *
 * @author PHD. Ribaldo Nantip
 */
public class Cafeteria {

    public static void main(String[] args) {

        Productos objProducto = new Productos();

        objProducto.setPrimerProducto("Cafe Expreso");
        objProducto.setPrecioProducto(3.50);
        objProducto.setSegundoProducto("Sandwich");
        objProducto.setPrecioProducto2(3.00);
        objProducto.imprimir();
        
        objProducto.detallesProducto1();
        objProducto.detallesProducto2();
        
        Clientes objCliente = new Clientes ();
        
        objCliente.setNombreCliente("Ribaldo Lenin Nantip Barre");
        

    }
}
