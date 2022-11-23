/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author carlo
 */
public class Funcionario extends Pessoa{
    
    protected String senha;
    protected String nivelDeAcesso;

    public Funcionario(String nivelDeAcesso, int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public Funcionario(int id, String nome, char sexo, Date dataNascimento, String telefone, String email, String rg, String senha, String nivelDeAcesso) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }
    
    
    
}
