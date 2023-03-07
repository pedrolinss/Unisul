package pkg04;

import javax.swing.JOptionPane;

                         /*  @author pedrolins       */
    public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, metade, dobro;
        num1 = Integer.parseInt(
               JOptionPane.showInputDialog("Digite um número: ")
       );
        if(num1>10){
            metade = num1 / 2 ;
            JOptionPane.showMessageDialog(null,metade);
        } else{
            dobro = num1 * 2;
           JOptionPane.showMessageDialog(null,dobro);
        }
        
        int num2;
        num2 = Integer.parseInt(
               JOptionPane.showInputDialog("Digite um número: ")
       );
        
        if((num2 % 10) == 0){
            JOptionPane.showMessageDialog(null,"Número divisivel 10");
        } else{
             if((num2 % 5) == 0){
                 JOptionPane.showMessageDialog(null,"Número divisivel 5");
            } else{
                 if((num2 % 2) == 0){
                    JOptionPane.showMessageDialog(null,"número é divisivel 2");
                 } else {
                     JOptionPane.showMessageDialog(null,"Nao");
                 }
                 }
             }
    } 
            
}
