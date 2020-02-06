package view;
import model.NumerosData;
import javax.swing.*;
import java.util.InputMismatchException;

public class NumerosView {

    public static void main(String[] args) {

        double vlr;

        try {
            vlr = Double.parseDouble(JOptionPane.showInputDialog("Digite o número em R$:"));
            JOptionPane.showMessageDialog(null,"O número por extenso é: " +
                    NumerosData.valorPorExtenso(vlr));
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null,"Erro: " + e.getMessage(),
                    "Erro",JOptionPane.INFORMATION_MESSAGE);

        }
    }
}