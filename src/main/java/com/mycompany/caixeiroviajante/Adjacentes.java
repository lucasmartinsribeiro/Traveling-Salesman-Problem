/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caixeiroviajante;

/**
 *
 * @author lucas
 */
public class Adjacentes {
    private Vertice vertice;
    private double custo;

    public Adjacentes() {
    }

    public Adjacentes(Vertice vertice, double custo) {
        this.vertice = vertice;
        this.custo = custo;
    }

    public Vertice getVertice() {
        return vertice;
    }

    public void setVertice(Vertice vertice) {
        this.vertice = vertice;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
}
