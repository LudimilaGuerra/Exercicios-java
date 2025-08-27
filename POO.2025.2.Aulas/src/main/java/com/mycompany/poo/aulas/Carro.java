/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.aulas;

/**
 *
 * @author ludimila.guerra
 */
public class Carro {

    //atributos (estados)
    private String modelo;
    private String cor;
    private int ano;
    private boolean ligado;

    //construtor
    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.ligado = false;
    }

    //Métodos (comportamento)
    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }
    
    public void proprietario(Pessoa pessoa) {
        System.out.println("Proprietario do carro é: " + pessoa.getNome());
    }
}
