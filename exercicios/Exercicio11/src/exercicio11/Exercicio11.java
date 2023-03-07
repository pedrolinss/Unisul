/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio11;

import javax.swing.JOptionPane;

/**
 *
 * @author pedrolins
 */
public class Exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
            double resposta = (num / 2);
    
            if((num % 2) == 0){
   JOptionPane.showMessageDialog(null,resposta);
    }
    }
    
}
