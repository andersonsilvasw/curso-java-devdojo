package exerciciosandersonsilva;

import javax.swing.*;

public class Program01 {
    public static void main(String[] args) {
        int n1, n2, quoc;
        double pot;
        String msg = "";
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
        quoc = (int)n1 / (int)n2;
        pot = Math.pow(n1, n2);

        msg = msg + "O quociente da divisão de " + n1 + " por " + n2 + " é igual a " + quoc + "\n";
        msg = msg + "A potência de " + n1 + " por " + n2 + " é igual a " + pot + "\n";
        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);
    }
}
