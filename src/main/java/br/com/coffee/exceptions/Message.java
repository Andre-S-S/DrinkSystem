/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.coffee.exceptions;

/**
 *
 * @author andre
 */
public class Message extends RuntimeException {
    
    public Message() {
        super("Não foi possível realizar seu pedido!");
    }
}
