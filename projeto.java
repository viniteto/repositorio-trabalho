import javax.swing.JOptionPane;
public class projeto {
    public static void main(String[] args) {
        String num1Str = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
        int num1 = Integer.parseInt(num1Str);
        String num2Str = JOptionPane.showInputDialog("Digite o segundo número inteiro:");
        int num2 = Integer.parseInt(num2Str);
        int soma = num1 + num2;
        JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma);
    }
}
