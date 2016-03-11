/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistuni.egcc.CobroCineApp.service;

/**
 *
 * @author Diego
 */
public class LunesMiercoles extends CineService{
    
    
    
    @Override
    public void setPrecio(){
        precio=7.5f;
    }
    
    @Override
    public void setPrecio(String tipo){
        
        if(tipo.equals("3d"))
            precio=13;
        if(tipo.equals("4d"))
            precio=30;
    }
    
    
}
