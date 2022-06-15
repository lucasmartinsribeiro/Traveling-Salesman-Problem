/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.caixeiroviajante;

/**
 *
 * @author lucas
 */
public class CaixeiroViajante {

    public static void main(String[] args) {
        Grafo mapa = new Grafo(); 
        
        Gulosa gulosa = new Gulosa(mapa.bucharest);
        gulosa.busca(mapa.arad);
    }
    
}
