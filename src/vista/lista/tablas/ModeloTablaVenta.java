/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.lista.tablas;

import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;
import javax.swing.table.AbstractTableModel;
import logica.Venta;

/**
 *
 * @author jsbal
 */
public class ModeloTablaVenta extends AbstractTableModel {
    private DynamicList<Venta> ventas;

    @Override
    public int getRowCount() {
        return ventas.getLenght();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            Venta venta = ventas.getInfo(rowIndex);
            switch (columnIndex) {
                case 0:
                    return (venta != null) ? venta.getId_venta(): "";
                case 1:
                    return (venta != null) ? venta.getFechaVenta() : "";
                case 2:
                    return (venta != null) ? venta.getVendedor().getNombre() + " " + venta.getVendedor().getApellido() : "";
                case 3:
                    return (venta != null) ? venta.getAuto().getMarca() + " "  : "";
                case 4:
                    return (venta != null) ? venta.getMonto() : "";
                default:
                    return null;
            }
        } catch (EmptyException ex) {
            return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "FECHA";
            case 2:
                return "VENDEDOR";
            case 3:
                return "AUTO";
            case 4:
                return "MONTO";
            default:
                return null;
        }
    }

    public DynamicList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(DynamicList<Venta> ventas) {
        this.ventas = ventas;
    }
}