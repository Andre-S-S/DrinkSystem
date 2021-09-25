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
public class PannaExpress extends Drink {
    
    private final double PANNA_EXPRESS = 4.50;

    public PannaExpress(Order order) {
        super(order);
    }

    @Override
    public double calculate() {
        return super.calculate() * PANNA_EXPRESS;
    }
}
