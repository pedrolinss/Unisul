/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio13;

import javax.swing.JOptionPane;

/**
 *
 * @author pedrolins
 */
public class Exercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double SB = Double.parseDouble(JOptionPane.showInputDialog("Digite o sálario : ")) ;
        double Prestacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prestação : ")) ;
        
        if(Prestacao > (SB * 0.3)){
            JOptionPane.showMessageDialog(null, "Valor da prestação excedente. ");
        } else {
            JOptionPane.showMessageDialog(null, "Sucesso. ");
        }
    }
    
}
