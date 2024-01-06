/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Auto;

import controlador.DAO.DaoImplement;
import controlador.TDA.listas.DynamicList;
import logica.Auto;

/**
 *
 * @author jsbal
 */
public class AutoControl extends DaoImplement<Auto>  {
    private DynamicList<Auto> autos;
    private Auto auto;

    public AutoControl() {
        super(Auto.class);
    }

    public DynamicList<Auto> getAutos() {
        autos = all();
        return autos;
    }

    public void setCasa(DynamicList<Auto> autos) {
        this.autos = autos;
    }

    
    public Auto getAuto() {
        if (auto == null) {
            auto = new Auto();
        }
        return auto;
    }
        
    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    
    public Boolean persist(){
        
        
        return persist(auto);
    }
     
}
