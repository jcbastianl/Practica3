/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.Vendedor;

import controlador.DAO.DaoImplement;
import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;
import logica.Vendedor;


/**
 *
 * @author jsbal
 */
public class VendedorControladora extends DaoImplement<Vendedor> {
    private Vendedor vendedor = new Vendedor(); // Instancia de un objeto Vendedor

    private DynamicList<Vendedor> vendedores; // Lista dinámica de vendedores

    public VendedorControladora() {
        super(Vendedor.class); // Llamada al constructor de la clase padre con la clase Vendedor
    }

    // Método que permite guardar un vendedor en la lista
    public boolean guardar() {
        if (vendedores == null) {
            vendedores = new DynamicList<>(); // Crear la lista si aún no está inicializada
        }
        vendedores.add(getVendedor()); // Agregar el auto actual a la lista

        return true;
    }

    // Verificar la posición disponible para guardar un vendedor
    public int posVerificar() throws EmptyException {
        int bandera = 0;
        for (int i = 0; i < vendedores.getLenght(); i++) {
            if (vendedores.getInfo(i) == null) {
                bandera = i;
                break;
            }
        }
        return bandera;
    }

    // Imprimir la lista de vendedores
    public void imprimir() throws EmptyException {
        for (int i = 0; i < vendedores.getLenght(); i++) {
            System.out.println(vendedores.getInfo(i));
        }
    }

    // Obtener el vendedor actual
    public Vendedor getVendedor() {
        if (vendedor == null) {
            vendedor = new Vendedor(); // Crear un nuevo vendedor si aún no está inicializado
        }
        return vendedor;
    }

    // Establecer el vendedor actual
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    // Obtener la lista de vendedores
    public DynamicList<Vendedor> getVendedores() {
        return vendedores;
    }

    // Establecer la lista de vendedores
    public void setVendedores(DynamicList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }
}


