/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistuni.egcc.CobroCineApp.controller;

import Sistuni.egcc.CobroCineApp.service.DomingoFer;
import Sistuni.egcc.CobroCineApp.service.Jueves;
import Sistuni.egcc.CobroCineApp.service.LunesMiercoles;
import Sistuni.egcc.CobroCineApp.service.Martes;
import Sistuni.egcc.CobroCineApp.service.ViernesSabado;



/**
 *
 * @author Diego
 */
public class CineController {

    
   
    public CineController() {
        
        
    }
    //Polimorfismo por dias
    
    //Lunes y Miercoles
    public float precioNiño(float precioadult, LunesMiercoles serv) {
        float precioniño;
        precioniño=serv.precioNiño(precioadult);
        return precioniño;
    }

    public float calcularTotal(float precioadult, float precioniño, LunesMiercoles serv) {
        float total=serv.calcularTotal(precioadult, precioniño);
        return total;
    }
    
    
    //Martes
    public float precioNiño(float precioadult, Martes serv) {
        float precioniño;
        precioniño=serv.precioNiño(precioadult);
        return precioniño;
    }

    public float calcularTotal(float precioadult, float precioniño, Martes serv) {
        float total=serv.calcularTotal(precioadult, precioniño);
        return total;
    }
    
    
    //Jueves
    public float precioNiño(float precioadult, Jueves serv) {
        float precioniño;
        precioniño=serv.precioNiño(precioadult);
        return precioniño;
    }

    public float calcularTotal(float precioadult, float precioniño, Jueves serv) {
        float total=serv.calcularTotal(precioadult, precioniño);
        return total;
    }
    
    
    //Viernes y Sabados
    public float precioNiño(float precioadult, ViernesSabado serv) {
        float precioniño;
        precioniño=serv.precioNiño(precioadult);
        return precioniño;
    }

    public float calcularTotal(float precioadult, float precioniño, ViernesSabado serv) {
        float total=serv.calcularTotal(precioadult, precioniño);
        return total;
    }
    
    
    //Domingos y Feriados
    public float precioNiño(float precioadult, DomingoFer serv) {
        float precioniño;
        precioniño=serv.precioNiño(precioadult);
        return precioniño;
    }

    public float calcularTotal(float precioadult, float precioniño, DomingoFer serv) {
        float total=serv.calcularTotal(precioadult, precioniño);
        return total;
    }
    

   
    
    
    
    
    
    
}
