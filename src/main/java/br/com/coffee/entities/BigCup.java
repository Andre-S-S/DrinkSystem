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
public class BigCup extends Cup {
    
    private double BIG_CUP = 1.35;

    public BigCup(Order order) {
        super(order);
    }

    @Override
    public double calculate() {
        return BIG_CUP;
    }  
}
