/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.coffee.entities;

import br.com.coffee.contractors.Additional;
import br.com.coffee.contractors.Order;

/**
 *
 * @author andre
 */
public class Cookie extends Additional {
    
    private final double COOKIE = 0.90;
    
    public Cookie(Order order) {
        super(order);
    }

    @Override
    public double calculate() {
        return super.calculate() + COOKIE;
    }   
}
