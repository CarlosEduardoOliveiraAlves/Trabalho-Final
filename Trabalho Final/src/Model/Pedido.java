/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class Pedido {
    
    private int id;
    private Cliente cliente;
    private int quantidade;
    private double valorTotal;
    private Date data;

    public Pedido(int id, Cliente cliente, int quantidade, double valorTotal, String data) {
        this.id = id;
        this.cliente = cliente;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getDescricao() {
        return quantidade;
    }

    public void setDescricao(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valorTotal;
    }

    public void setValor(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
     
}
