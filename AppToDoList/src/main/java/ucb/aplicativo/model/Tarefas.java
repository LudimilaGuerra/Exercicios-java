/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.aplicativo.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author ludimila.guerra
 */

public class Tarefas {
    private Long id;
    private String titulo;
    private String descricao;
    private boolean completo;
    private LocalDateTime dataAgora;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the dataHora
     */
    public LocalDateTime getDataHora() {
        return dataAgora;
    }

    /**
     * @param dataHora the dataHora to set
     */
    public void setDataHora(LocalDateTime dataHora) {
        this.dataAgora = dataHora;
    }

    /**
     * @return the completo
     */
    public boolean isCompleto() {
        return completo;
    }

    /**
     * @param completo the completo to set
     */
    public void setCompleto(boolean completo) {
        this.completo = completo;
    }
    
    
    /*Construtor */
}
