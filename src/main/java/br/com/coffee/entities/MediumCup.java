/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.coffee.entities;

import br.com.coffee.contractors.Cup;
import br.com.coffee.contractors.Order;

/**
 *
 * @author andre
 */
public class MediumCup extends Cup {
    
    private final double MEDIUM_CUP = 1.20;

    public MediumCup(Order order) {
        super(order);
    }

    @Override
    public double calculate() {
        return MEDIUM_CUP;
    }  
}
