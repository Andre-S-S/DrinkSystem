package br.com.coffee.entities;

import br.com.coffee.contractors.Drink;
import br.com.coffee.contractors.Order;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class MilkWithChocolate extends Drink {
    
    private final double MILK_WITH_CHOCOLATE = 2.50;

    public MilkWithChocolate(Order order) {
        super(order);
    }

    @Override
    public double calculate() {
        return super.calculate() * MILK_WITH_CHOCOLATE;
    }   
}
