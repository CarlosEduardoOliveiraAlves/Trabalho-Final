/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Pessoa;
import java.util.Date;

/**
 *
 * @author carlo
 */
public class Cliente extends Pessoa{

    protected String endereco;
    protected String cep;
    protected String senhaCliente;
    

    public Cliente(int id, String nome, String senhaCliente, char sexo, String dataNascimento, String telefone, String email,String endereco, String cep) {
        super(id, nome, sexo, dataNascimento, telefone, email);
        this.endereco = endereco;
        this.cep = cep;
        this.senhaCliente = senhaCliente;
    }

    public Cliente(int id, String nome, String senhaCliente,String endereco, String cep) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
        this.senhaCliente = senhaCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSenhaCliente() {
        return senhaCliente;
    }

    public void setSenhaCliente(String senhaCliente) {
        this.senhaCliente = senhaCliente;
    }
    
}
