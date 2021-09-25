/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.coffee.contractors;

import br.com.coffee.entities.BigCup;
import br.com.coffee.entities.MediumCup;
import br.com.coffee.entities.SmallCup;

/**
 *
 * @author andre
 */
public enum CupType {
    
    SMALL_CUP {
        @Override
        public Cup getCupType(int cup) {
            return new SmallCup(null);
        }
    },
    
    MEDIUM_CUP {
        @Override
        public Cup getCupType(int cup) {
            return new MediumCup(null);
        }
    },
    
    BIG_CUP {
        @Override
        public Cup getCupType(int cup) {
            return new BigCup(null);
        }  
    };
    
    public abstract Cup getCupType(int cup);
}
