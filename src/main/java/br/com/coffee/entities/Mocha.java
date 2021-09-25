/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.coffee.entities;

import br.com.coffee.contractors.Drink;
import br.com.coffee.contractors.Order;

/**
 *
 * @author andre
 */
public class Mocha extends Drink {
    
    private final double MOCHA = 4.00;

    public Mocha(Order order) {
        super(order);
    }

    @Override
    public double calculate() {
        return super.calculate() * MOCHA;
    }
}
