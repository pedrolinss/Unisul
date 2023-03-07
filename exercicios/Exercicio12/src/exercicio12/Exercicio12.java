/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio12;

import javax.swing.JOptionPane;

/**
 *
 * @author pedrolins
 */
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        if(num1 > num2){
            JOptionPane.showMessageDialog(null,num1 + "é maior");
        } else{
            if(num1 < num2){
                JOptionPane.showMessageDialog(null,num2 + " é maior");
            } else{
                JOptionPane.showMessageDialog(null,"São iguais");
            }
        }
    }
    
}
