package exemplo;    /*      @author pedrolins       */
import javax.swing.JOptionPane;

public class Exemplo {

    /**
     * @param  the command line arguments
     */
    public static void main(String[] args) {
       String nome;
       nome = "Ricardo";
       JOptionPane.showMessageDialog(null,nome);
       String resposta;
       resposta = JOptionPane.showInputDialog("Que mês estamos");
       JOptionPane.showMessageDialog(null,resposta);
       
       // Exercício 7
       
       String nome1;
       nome1 = JOptionPane.showInputDialog("Digite um nome: ");
       JOptionPane.showMessageDialog(null,nome1);

       // Exercicio 8
       int num1;
       int num2;
       num1 = Integer.parseInt(
               JOptionPane.showInputDialog("Digite um número: ")
       );
       num2 = Integer.parseInt(
               JOptionPane.showInputDialog("Digite um número: ")
       )       ;
       JOptionPane.showMessageDialog(null,num1 + num2);
       
       // Exercício 09
       
       int peso;
       double altura;
       peso = Integer.parseInt(
               JOptionPane.showInputDialog("Digite seu peso: ")
       );
       altura = Double.parseDouble(
               JOptionPane.showInputDialog("Digite sua altura: ")
       )       ;
       JOptionPane.showMessageDialog(null,peso / (altura * altura));
    }
    
 
       
    
    
    
}
