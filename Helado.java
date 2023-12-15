/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AaMaquinaDeHelados;

/**
 *
 * @author dev
 */
public class Helado {
    private String tipo;
    private String sabor;
    private double precio;
    private int cantidad;

    public Helado(String sabor, String tipo, double precio) {
        this.tipo = tipo;
        this.sabor = sabor;
        this.precio = precio;
        this.cantidad = 5;
    }

    public String getTipo() {
        return tipo;
    }

    public String getSabor() {
        return sabor;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void restarHelado(){
        this.cantidad = this.cantidad - 1;
    }
}
