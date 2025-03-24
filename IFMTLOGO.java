import java.awt.*;
import javax.swing.*;

public class IFMTLOGO extends JFrame {

    public IFMTLOGO() {
        setTitle("IFMT - Logo e Texto");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        add(panel);

        // Adicionar imagem (logo)
        JLabel logoLabel = new JLabel();
        ImageIcon logo = new ImageIcon("C:\\Users\\Aluno\\Downloads\\ifmtbolo\\ifmt.png"); // Caminho do arquivo
        logoLabel.setIcon(logo);
        logoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(logoLabel, BorderLayout.CENTER);

        // Adicionar texto
        JLabel textLabel = new JLabel("INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MATO GROSSO");
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(textLabel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            IFMTLOGO frame = new IFMTLOGO();
            frame.setVisible(true);
        });
    }
}
