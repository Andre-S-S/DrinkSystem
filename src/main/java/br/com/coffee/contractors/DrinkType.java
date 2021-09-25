/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.coffee.contractors;

import br.com.coffee.entities.Coffee;
import br.com.coffee.entities.CoffeeWithMilk;
import br.com.coffee.entities.MilkWithChocolate;
import br.com.coffee.entities.Mocha;
import br.com.coffee.entities.PannaExpress;

/**
 *
 * @author andre
 */
public enum DrinkType {
    
    COFFEE {
        @Override
        public Drink getDrinkType(int drink, Order cup) {
            return new Coffee(cup);
        }
    },
    
    COFFEE_WITH_MILK {
        @Override
        public Drink getDrinkType(int drink, Order cup) {
            return new CoffeeWithMilk(cup);
        }
    },
    
    MILK_WITH_CHOCOLATE {
        @Override
        public Drink getDrinkType(int drink, Order cup) {
            return new MilkWithChocolate(cup);
        }
    },
    
    MOCHA {
        @Override
        public Drink getDrinkType(int drink, Order cup) {
            return new Mocha(cup);
        }
    },
    
    PANNA_EXPRESS {
        @Override
        public Drink getDrinkType(int drink, Order cup) {
            return new PannaExpress(cup);
        }
    };
    
    public abstract Drink getDrinkType(int drink, Order cup);
}
