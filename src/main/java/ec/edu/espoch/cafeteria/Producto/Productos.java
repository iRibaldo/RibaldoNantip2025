/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.cafeteria.Producto;

import ec.edu.espoch.cafeteria.Producto.CategoriaProducto.CategoriaProductos;

public class Productos {

    private String primerProducto;
    private String segundoProducto;
    private double precioProducto1;
    private double precioProducto2;
    private CategoriaProductos catgoriaPoducto;

    public Productos() {
    }

    public Productos(String primerProducto, String segundoProducto, double precioProducto1, double precioProducto2, CategoriaProductos catgoriaPoducto) {
        this.primerProducto = primerProducto;
        this.segundoProducto = segundoProducto;
        this.precioProducto1 = precioProducto1;
        this.precioProducto2 = precioProducto2;
        this.catgoriaPoducto = catgoriaPoducto;
    }

    public String getPrimerProducto() {
        return primerProducto;
    }

    public void setPrimerProducto(String primerProducto) {
        this.primerProducto = primerProducto;
    }

    public String getSegundoProducto() {
        return segundoProducto;
    }

    public void setSegundoProducto(String segundoProducto) {
        this.segundoProducto = segundoProducto;
    }

    public double getPrecioProducto() {
        return precioProducto1;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto1 = precioProducto;
    }

    public double getPrecioProducto2() {
        return precioProducto2;
    }

    public void setPrecioProducto2(double precioProducto2) {
        this.precioProducto2 = precioProducto2;
    }

    public CategoriaProductos getCatgoriaPoducto() {
        return catgoriaPoducto;
    }

    public void setCatgoriaPoducto(CategoriaProductos catgoriaPoducto) {
        this.catgoriaPoducto = catgoriaPoducto;
    }

    public void imprimir() {

        System.out.println(" El primer producto el es: " + primerProducto + " y pertemece a la categoria " + CategoriaProductos.BEBIDA);
        System.out.println( primerProducto  +  precioProducto1);
        System.out.println(" El segundo producto el es: " + segundoProducto + " y pertemece a la categoria " + CategoriaProductos.ALIMENTO);
        System.out.println( segundoProducto+"$"  +  precioProducto2+"$");
    }
    
    public double detallesProducto1(){
        
        return (precioProducto1*0.15);
    }
    
        public double detallesProducto2(){
        
        return (precioProducto2*0.15);
        }
    
    

}
