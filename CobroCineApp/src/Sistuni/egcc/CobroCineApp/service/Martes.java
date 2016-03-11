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
public class Martes extends CineService{
    
    
    
    @Override
    public void setPrecio(){
        precio=6.5f;
    }
    
    @Override
    public void setPrecio(String tipo){
        
        if(tipo.equals("3d"))
            precio=11.5f;
        if(tipo.equals("4d"))
            precio=30;
    }
    
    
    
}
