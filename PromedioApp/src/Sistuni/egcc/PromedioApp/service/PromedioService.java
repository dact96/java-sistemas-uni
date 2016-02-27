/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistuni.egcc.PromedioApp.service;

/**
 *
 * @author Diego
 */

public class PromedioService {
    
    /**
     * Estos metodos hallan el promedio de 4 notas excepto la menor de las 4
     * @param nota1 es la primera nota
     * @param nota2 es la segunda nota
     * @param nota3 es la tercera nota
     * @param nota4 es la cuarta nota
     * @return retorna el promedio pedido
     */
    
    public float CalcularMenor(float nota1,float nota2,float nota3,float nota4){
        float menor=nota1;
        if(nota2<menor)
            menor=nota2;
        if(nota3<menor)
            menor=nota3;
        if(nota4<menor)
            menor=nota4;
        return menor;
    }
    
    public float CalcularPromedio(float nota1,float nota2,float nota3,float nota4){
        float prom;
        prom=(nota1+nota2+nota3+nota4-CalcularMenor(nota1, nota2, nota3, nota4))/3;
        return prom;
    }
    
}
