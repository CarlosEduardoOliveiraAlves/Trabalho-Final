/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.Cliente;
import View.Login;

/**
 *
 * @author carlo
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        //Pegar um usuario da view - 
        Cliente cliente = helper.obterModelo();
        //Pesquisa Usuario no BD
        //Se o usuario da view tiver o mesmo usuario e senha no banco ele será redirecionado para o menu
        //Senão mostrar uma mensagem ao usuário: "Usuário ou senha inválidos"
        
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do bd");
    }
    
}
