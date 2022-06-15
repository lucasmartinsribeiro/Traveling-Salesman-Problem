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
public class Vertice {
    private String nome_da_cidade;
    private double distancia;
    private boolean visitado;
    private ArrayList<Adjacentes> Adjacente;

    public Vertice(String nome_da_cidade, double distancia) {
        this.nome_da_cidade = nome_da_cidade;
        this.distancia = distancia;
        this.Adjacente = new ArrayList<>();
        this.visitado = false;
    }

    public Vertice(String nome_da_cidade, double distancia, boolean visitado, ArrayList<Adjacentes> Adjacente) {
        this.nome_da_cidade = nome_da_cidade;
        this.distancia = distancia;
        this.visitado = visitado;
        this.Adjacente = Adjacente;
    }

    public String getNome_da_cidade() {
        return nome_da_cidade;
    }

    public void setNome_da_cidade(String nome_da_cidade) {
        this.nome_da_cidade = nome_da_cidade;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public boolean getVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public ArrayList<Adjacentes> getAdjacente() {
        return Adjacente;
    }

    public void setAdjacente(ArrayList<Adjacentes> Adjacente) {
        this.Adjacente = Adjacente;
    }
    
    public void exibeAdjacente(){
        for(Adjacentes ad : this.Adjacente){
            System.out.println(ad.getVertice().getNome_da_cidade() + "-" + ad.getVertice().getDistancia());
        }
    }
    
    public void adicionaAdjacente(Adjacentes adjacente) {
        OrdenaVetor vetorOrdenado = new OrdenaVetor(this.Adjacente);
        this.Adjacente.add(adjacente);
        this.Adjacente = vetorOrdenado.insertionSort(this.Adjacente);
    }
}
