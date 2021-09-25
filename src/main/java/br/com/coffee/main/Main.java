/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.coffee.main;

import br.com.coffee.contractors.Additional;
import br.com.coffee.contractors.AdditionalType;
import br.com.coffee.contractors.Cup;
import br.com.coffee.contractors.CupType;
import br.com.coffee.contractors.Drink;
import br.com.coffee.contractors.DrinkType;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double total = 0;
        int returnValueAdd = 1;
        
        String[] buttons = {"Caf�", "Caf� com Leite", "Leite com Chocolate", "Mocha", "Expresso Panna", "Cancel"};
        int returnValuesDrink = JOptionPane.showOptionDialog(null, "Escolha um tipo bebida", "Escolha de Bebida", 
                        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[0]);
        
        String[] buttonsCup = {"X�cara Pequena", "x�cara M�dia", "x�cara grande", "Cancel"};
        int returnValueCup = JOptionPane.showOptionDialog(null, "Escolha um tipo x�cara", "Escolha de x�cara", 
                        JOptionPane.WARNING_MESSAGE, 0, null, buttonsCup, buttonsCup[0]);
        
        CupType cupType = CupType.values()[returnValueCup];
        Cup cup = cupType.getCupType(returnValueCup);
        
        DrinkType drinkType = DrinkType.values()[returnValuesDrink];
        Drink drink = drinkType.getDrinkType(returnValuesDrink, cup);

        try {
            for (int n = 0; returnValueAdd > 0; n++) {
                String[] buttonsAdd = {"Raspas de lim�o", "Canela em p�", "Leite ninho", "Gelo de creme de leite",
                                "Leite condensado", "Chocolate em p�", "Cookie", "Cancel"};
                returnValueAdd = JOptionPane.showOptionDialog(null, "Escolha qual adicional voc� quer", "Escolha os adicionais", 
                            JOptionPane.WARNING_MESSAGE, 0, null, buttonsAdd, buttonsAdd[0]);

                AdditionalType additionalType = AdditionalType.values()[returnValueAdd];
                Additional additional = additionalType.getAdditionalType(returnValueAdd, drink);

                total += additional.calculate();
                returnValueAdd = (int) additional.calculate();

                String[] button = {"Sim", "N�o"};
                int status = JOptionPane.showOptionDialog(null, "Voc� deseja adicionar mais algum adicional?", "Validar", 
                        JOptionPane.WARNING_MESSAGE, 0, null, button, button[0]);

                if (status == 1) {
                    returnValueAdd = 0;
                } else {
                    total -= drink.calculate();
                }
            }
            
            JOptionPane.showMessageDialog(null, "O valor da sua bebida � de R$:" + total + " Reais");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "N�o foi poss�vel realizar seu pedido!");
        }
    }
}
