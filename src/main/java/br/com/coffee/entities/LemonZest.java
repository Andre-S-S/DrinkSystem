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
public class LemonZest extends Additional {
    
    private final double LEMON_ZEST = 0.50;
    
    public LemonZest(Order order) {
        super(order);
    }

    @Override
    public double calculate() {
        return super.calculate() + LEMON_ZEST;
    }
}
