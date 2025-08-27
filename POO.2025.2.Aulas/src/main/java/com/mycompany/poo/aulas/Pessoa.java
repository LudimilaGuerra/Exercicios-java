/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.aulas;

/**
 *
 * @author ludimila.guerra
 */
public class Pessoa {

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    private String nome;
    private int idade; 
    private String cpf;
    private double altura;
    
    //construtor com parametro
    public Pessoa(String p_nome, int p_idade){
        this.nome = p_nome;
        this.idade = p_idade;
    }
    
    //construtor padrao
    public Pessoa (){
        this.idade = 0;
        this.cpf = "";
        this.altura = 0;
    }
    
    //se apresentar
    public void apresentar(){
        System.out.println("Meu nome eh: " + this.getNome() + " E minha idade eh: " + this.idade);
    }
}
