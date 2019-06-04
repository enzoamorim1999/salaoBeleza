/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.davi.enzo.salaobeleza.Model;

/**
 *
 * @author Casa
 */
public class Agendamento {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String nome;
    private String servico;
    private String horario;
    private String data;

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public Agendamento(String nome, String servico, String horario, String data) {

        this.nome = nome;
        this.servico = servico;
        this.horario = horario;
        this.data = data;

    }

    public Agendamento() {

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
