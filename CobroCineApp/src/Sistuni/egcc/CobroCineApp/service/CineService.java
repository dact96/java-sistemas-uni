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
public abstract class CineService {
    
    private int cantAdult;

    public int getCantAdult() {
        return cantAdult;
    }

    public void setCantAdult(int cantAdult) {
        this.cantAdult = cantAdult;
    }

    public int getCantNiñ() {
        return cantNiñ;
    }

    public void setCantNiñ(int cantNiñ) {
        this.cantNiñ = cantNiñ;
    }
    private int cantNiñ;
    protected float precio;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    
    
    public abstract void setPrecio();
    
    public abstract void setPrecio(String tipo);

    public float getPrecio() {
        return precio;
    }
    
       
    public float precioNiño(float prec){
        
        float precio2=prec-1.5f;
        
        return precio2;
        
    }
    public float calcularTotal(float precadult,float precniñ){
        
        float total=precadult*getCantAdult()+precniñ*getCantNiñ();
        
        return total;
    }
    
    
}
