/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.coffee.contractors;

import br.com.coffee.entities.ChocolatePowder;
import br.com.coffee.entities.CinnamonPowder;
import br.com.coffee.entities.CondensedMilk;
import br.com.coffee.entities.Cookie;
import br.com.coffee.entities.LemonZest;
import br.com.coffee.entities.NinhoMilk;
import br.com.coffee.entities.SourCreamIce;

/**
 *
 * @author andre
 */
public enum AdditionalType {
    
    LEMON_ZEST {
        @Override
        public Additional getAdditionalType(int additional, Drink drink) {
            return new LemonZest(drink);
        }
    },
    
    CINNAMON_POWDER {
        @Override
        public Additional getAdditionalType(int additional, Drink drink) {
            return new CinnamonPowder(drink);
        }   
    },
    
    NINHO_MILK {
        @Override
        public Additional getAdditionalType(int additional, Drink drink) {
            return new NinhoMilk(drink);
        }
    },
    
    SOUR_CREAM_ICE {
        @Override
        public Additional getAdditionalType(int additional, Drink drink) {
            return new SourCreamIce(drink);
        }
    },
    
    CONDENSED_MILK {
        @Override
        public Additional getAdditionalType(int additional, Drink drink) {
            return new CondensedMilk(drink);
        }  
    },
    
    CHOCOLATE_POWDER {
        @Override
        public Additional getAdditionalType(int additional, Drink drink) {
            return new ChocolatePowder(drink);
        }
    },
    
    COOKIE {
        @Override
        public Additional getAdditionalType(int additional, Drink drink) {
            return new Cookie(drink);
        }
    };
    
    public abstract Additional getAdditionalType(int additional, Drink drink);    
}
