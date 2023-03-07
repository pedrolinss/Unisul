package javaapplication1;

import javax.swing.JOptionPane;

       /*       @author pedrolins      */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       String nome = "João";
       JOptionPane.showMessageDialog(null, nome);
              
       nome = "Pedro";
       JOptionPane.showMessageDialog(null,"\nO valor da variável é: " + nome);
       
    }
    
}

