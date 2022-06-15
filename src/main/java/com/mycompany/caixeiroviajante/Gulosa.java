/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caixeiroviajante;

/**
 *
 * @author lucas
 */
public class Gulosa {
    private Vertice vertice;
    private boolean status;

    public Gulosa() {
    }

    public Gulosa(Vertice vertice) {
        this.vertice = vertice;
        this.status = false;
    }

    public Vertice getVertice() {
        return vertice;
    }

    public void setVertice(Vertice vertice) {
        this.vertice = vertice;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void busca(Vertice vertice){
        Vertice cidadeAtual = vertice;
        
        System.out.println("\nCidade atual: " + cidadeAtual.getNome_da_cidade() + "-" + cidadeAtual.getDistancia());
        
        if(cidadeAtual.getDistancia() != 0){
            System.out.println("\nAdjacentes:");
            
            for(int i = 0; i < cidadeAtual.getAdjacente().size(); i++){
                System.out.println("\n" + cidadeAtual.getAdjacente().get(i).getVertice().getNome_da_cidade() + "-" + cidadeAtual.getAdjacente().get(i).getVertice().getDistancia());
            }
            
            System.out.println("\n-------------------");
        }
        
        if(cidadeAtual.getDistancia() == 0){
            System.out.println("\n Busca realizada com sucesso!");
            this.status = true;
        } else {
            for(int i = 0;(i < cidadeAtual.getAdjacente().size()) && (this.status != true); i++){
                if(!cidadeAtual.getAdjacente().get(i).getVertice().getVisitado()){
                    cidadeAtual = cidadeAtual.getAdjacente().get(i).getVertice();
                    cidadeAtual.setVisitado(true);
                    busca(cidadeAtual);
                }
            }
        }
    }
}
