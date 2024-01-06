/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import static logica.Venta.createID;

/**
 *
 * @author jsbal
 */
public class Auto {
    private String id_auto;
    private static long idCounter = 0;
    private String color;
    private Double precio;
    private String marca;

    public Auto() {
        this.id_auto = createID();
    }
    public static synchronized String createID() {
        return String.valueOf(idCounter++);
    }

    public Auto(String id_auto, String color, Double precio, String marca) {
        this.id_auto = id_auto;
        this.color = color;
        this.precio = precio;
        this.marca = marca;
    }


    public String getId_auto() {
        return id_auto;
    }

    public void setId_auto(String id_auto) {
        this.id_auto = id_auto;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

   
    
}
