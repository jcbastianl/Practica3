/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;

/**
 *
 * @author jsbal
 */
public class Venta {
    private String id_venta;
    private Auto auto;
    private Vendedor vendedor;
    private static long idCounter = 0;
    private Date fechaVenta;
    private double Monto;

    
    public Venta() {
        this.id_venta = createID();
    }
    
    public static synchronized String createID() {
        return String.valueOf(idCounter++);
    }

    public Venta(String id, Auto auto, Vendedor vendedor, Date fechaVenta, double Monto) {
        this.id_venta = id;
        this.auto = auto;
        this.vendedor = vendedor;
        this.fechaVenta = fechaVenta;
        this.Monto = Monto;
    }

    public String getId_venta() {
        return id_venta;
    }

    public void setId(String id) {
        this.id_venta = id;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public static long getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(long idCounter) {
        Venta.idCounter = idCounter;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }
   

   

   
    
}
