/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author carlo
 */
public class Pedido {
    
    private int id;
    private int quantidade;
    private double valorTotal;

    public Pedido(int id, int quantidade, double valorTotal) {
        this.id = id;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
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
