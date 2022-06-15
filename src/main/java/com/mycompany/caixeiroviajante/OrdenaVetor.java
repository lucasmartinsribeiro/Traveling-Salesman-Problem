/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caixeiroviajante;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class OrdenaVetor {
    private ArrayList<Adjacentes> adjacentes = new ArrayList<>();

    public OrdenaVetor(ArrayList<Adjacentes> adjacentes) {
        this.adjacentes = adjacentes;
    }
   
    public static ArrayList<Adjacentes> insertionSort( ArrayList<Adjacentes> adjacentes) {
         int j;
         Adjacentes key;
         int i;
         for (j = 1; j < adjacentes.size(); j++){
             key = adjacentes.get(j);
            for (i = j - 1; (i >= 0) && (adjacentes.get(i).getVertice().getDistancia() > key.getVertice().getDistancia()); i--){
                adjacentes.set((i+1),adjacentes.get(i));
            }
            adjacentes.set((i+1),key);
         }
         return adjacentes;
     }
}
