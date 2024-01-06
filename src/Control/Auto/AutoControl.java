/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.Auto;

import controlador.DAO.DaoImplement;
import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;
import logica.Auto;

/**
 *
 * @author jsbal
 */
public class AutoControl extends DaoImplement<Auto> {
    private Auto auto = new Auto(); // Instancia de un objeto Auto

    private DynamicList<Auto> autos; // Lista dinámica de autos

    public AutoControl() {
        super(Auto.class); // Llamada al constructor de la clase padre con la clase Auto
    }

    // Método que permite guardar un auto en la lista
    public boolean guardar() {
        if (autos == null) {
            autos = new DynamicList<>(); // Crear la lista si aún no está inicializada
        }
        autos.add(getAuto()); // Agregar el auto actual a la lista

        return true;
    }

    // Verificar la posición disponible para guardar un auto
    public int posVerificar() throws EmptyException {
        int bandera = 0;
        for (int i = 0; i < autos.getLenght(); i++) {
            if (autos.getInfo(i) == null) {
                bandera = i;
                break;
            }
        }
        return bandera;
    }

    // Imprimir la lista de autos
    public void imprimir() throws EmptyException {
        for (int i = 0; i < autos.getLenght(); i++) {
            System.out.println(autos.getInfo(i));
        }
    }

    // Obtener el auto actual
    public Auto getAuto() {
        if (auto == null) {
            auto = new Auto(); // Crear un nuevo auto si aún no está inicializado
        }
        return auto;
    }

    // Establecer el auto actual
    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    // Obtener la lista de autos
    public DynamicList<Auto> getAutos() {
        return autos;
    }

    // Establecer la lista de autos
    public void setAutos(DynamicList<Auto> autos) {
        this.autos = autos;
    }
}


    