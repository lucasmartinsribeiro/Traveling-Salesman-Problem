/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caixeiroviajante;

/**
 *
 * @author lucas
 */
public class Grafo {
        /* Criar ligação (arestas) entre cidades
        Nesse caso, deve existir a conexão de ida e volta entre
        elas. Ou seja, precisamos cirar as ligações de
        A -> B e B -> A.
        */
    
        //Daclara o nome dos vértices
        public Vertice arad, bucharest, craiova, dobreta, eforie, fagaras, giurgiu,
        hirsova, iasi, lugoj, mehadia, neamt, oradea, pitest, sibiu, timisoara, urziceni, vaslui, zerind, rimnicu;
        
        public Grafo (){
            this.arad = new Vertice("Arad", 366);
            this.bucharest = new Vertice("Bucharest", 0);
            this.craiova = new Vertice("Craiova", 160);
            this.dobreta = new Vertice("Dobreta", 242);
            this.eforie = new Vertice("Eforie", 161);
            this.fagaras = new Vertice("Fagaras", 178);
            this.giurgiu = new Vertice("Giurgiu", 77);
            this.hirsova = new Vertice("Hirsova", 151);
            this.iasi = new Vertice("Iasi", 226);
            this.lugoj = new Vertice("Lugoj", 244);
            this.mehadia = new Vertice("Mehadia", 241);
            this.neamt = new Vertice("Neamt", 234);
            this.oradea = new Vertice("Oradea", 380);
            this.pitest = new Vertice("Pitest", 98);
            this.sibiu = new Vertice("Sibiu", 253);
            this.rimnicu = new Vertice("Rimnicu", 193);
            this.timisoara = new Vertice("Timisoara", 329);
            this.urziceni = new Vertice("Urziceni", 80);
            this.vaslui = new Vertice("Vaslui", 199);
            this.zerind = new Vertice("Zerind", 374);

            arad.adicionaAdjacente(new Adjacentes(zerind, 75));
            arad.adicionaAdjacente(new Adjacentes(sibiu, 140));
            arad.adicionaAdjacente(new Adjacentes(timisoara, 118));

            zerind.adicionaAdjacente(new Adjacentes(arad, 75));
            zerind.adicionaAdjacente(new Adjacentes(oradea, 71));

            oradea.adicionaAdjacente(new Adjacentes(zerind, 71));
            oradea.adicionaAdjacente(new Adjacentes(sibiu, 151));

            sibiu.adicionaAdjacente(new Adjacentes(oradea, 151));
            sibiu.adicionaAdjacente(new Adjacentes(arad, 140));
            sibiu.adicionaAdjacente(new Adjacentes(fagaras, 99));
            sibiu.adicionaAdjacente(new Adjacentes(rimnicu, 80));

            timisoara.adicionaAdjacente(new Adjacentes(arad, 118));
            timisoara.adicionaAdjacente(new Adjacentes(lugoj, 111));

            lugoj.adicionaAdjacente(new Adjacentes(timisoara, 111));
            lugoj.adicionaAdjacente(new Adjacentes(mehadia, 70));

            mehadia.adicionaAdjacente(new Adjacentes(lugoj, 70));
            mehadia.adicionaAdjacente(new Adjacentes(dobreta, 75));

            dobreta.adicionaAdjacente(new Adjacentes(mehadia, 75));
            dobreta.adicionaAdjacente(new Adjacentes(craiova, 120));

            craiova.adicionaAdjacente(new Adjacentes(dobreta, 120));
            craiova.adicionaAdjacente(new Adjacentes(pitest, 138));
            craiova.adicionaAdjacente(new Adjacentes(rimnicu, 146));

            pitest.adicionaAdjacente(new Adjacentes(craiova, 138));
            pitest.adicionaAdjacente(new Adjacentes(rimnicu, 97));
            pitest.adicionaAdjacente(new Adjacentes(bucharest, 101));

            rimnicu.adicionaAdjacente(new Adjacentes(pitest, 97));
            rimnicu.adicionaAdjacente(new Adjacentes(sibiu, 80));
            rimnicu.adicionaAdjacente(new Adjacentes(craiova, 146));

            fagaras.adicionaAdjacente(new Adjacentes(sibiu, 99));
            fagaras.adicionaAdjacente(new Adjacentes(bucharest, 211));

            bucharest.adicionaAdjacente(new Adjacentes(giurgiu, 90));
            bucharest.adicionaAdjacente(new Adjacentes(fagaras, 211));
            bucharest.adicionaAdjacente(new Adjacentes(pitest, 101));

            giurgiu.adicionaAdjacente(new Adjacentes(bucharest, 90));
    }
}
