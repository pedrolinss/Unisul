package exercicioms;

import javax.swing.JOptionPane;

/**
 *
 * @author pedrolins
 */
public class ExercicioMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declarando dados
        
        String F1nome = "Pedro";
        String F2nome = "Renato";
        String F3nome = "Felipe";
        
        int F1HorasTrabalhadas = 8;
        int F2HorasTrabalhadas = 7;
        int F3HorasTrabalhadas = 9;
        
        int F1Dependentes = 2;
        int F2Dependentes = 5;
        int F3Dependentes = 4;
        
        int F1SalarioBruto = (F1HorasTrabalhadas * 10) + (F1Dependentes * 60);
        int F2SalarioBruto = F2HorasTrabalhadas * 10  + (F2Dependentes * 60);
        int F3SalarioBruto = F3HorasTrabalhadas * 10 + (F3Dependentes * 60);
        
        double F1SalarioLiquido = F1SalarioBruto - ((F1HorasTrabalhadas * 10) * 0.135);
        double F2SalarioLiquido = F2SalarioBruto - ((F1HorasTrabalhadas * 10) * 0.135);
        double F3SalarioLiquido = F3SalarioBruto - ((F1HorasTrabalhadas * 10) * 0.135);
        
        // Apresentando dados
        
        JOptionPane.showMessageDialog(null,"O funcionário 1 se chama " + F1nome + ", seu salário bruto é " + F1SalarioBruto + " e seu salário líquido é " + F1SalarioLiquido);
        JOptionPane.showMessageDialog(null,"O funcionário 1 se chama " + F2nome + ", seu salário bruto é " + F2SalarioBruto + " e seu salário líquido é " + F2SalarioLiquido);
        JOptionPane.showMessageDialog(null,"O funcionário 1 se chama " + F3nome + ", seu salário bruto é " + F3SalarioBruto + " e seu salário líquido é " + F3SalarioLiquido);
    }
    
}
