/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.poo.aulas;

/**
 *
 * @author ludimila.guerra
 */

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria Aparecida", 25); 
        // um comportamento que existe la no método é se apresentar 
        p1.apresentar();
        Pessoa p2 = new Pessoa("Antonio", 45);
        p2.apresentar();
        Pessoa p3 = new Pessoa("Joao", 23);
        p3.apresentar();
        
        Carro c1 = new Carro("Honda civic", "Preto", 2022);
        c1.proprietario(p2);
        
        Carro c2 = new Carro("VW GOL", "Branco", 2019);
        c2.proprietario(p1);
        
        Carro c3 = new Carro("Fiat Uno", "Cinza", 1990);
        c3.proprietario(p3);
    }
    
}
