/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import controlador.TDA.listas.DynamicList;
import java.util.List;

/**
 *
 * @author jsbal
 */
public class Vendedor {
    private Integer id_vendedor;
    private String nombre;
    private String apellido;
    private String ruc;
    private String direccion;
    private String telefono;
    private String correo;
    private DynamicList<Venta> ventas;

    public Vendedor() {
    }

    public Vendedor(Integer id_vendedor, String nombre, String apellido, String ruc, String direccion, String telefono, String correo, List<Venta> ventas) {
        this.id_vendedor = id_vendedor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ruc = ruc;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.ventas = (DynamicList<Venta>) ventas;
    }

    public Integer getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(Integer id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Venta> getVentas() {
        return (List<Venta>) ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = (DynamicList<Venta>) ventas;
    }

    
    

    
}
