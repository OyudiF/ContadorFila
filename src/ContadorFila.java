import javax.swing.*;
import java.awt.*;

public class ContadorFila {
    public static void main(String[] args) {
        // Vars
        JFrame janela = new JFrame("Contador de Senhas");
        JLabel labelNum = new JLabel("0");
        JPanel panel = new JPanel();
        JButton buttonNext = new JButton("Avançar");
        JButton buttonBack = new JButton("Voltar");
        JButton buttonReset = new JButton("Zerar");
        Font fonteMaior = new Font("Arial", Font.BOLD, 80);
        Font fonteMedia = new Font("Arial", Font.BOLD, 35);

        // Configurando labels
        labelNum.setFont(fonteMaior);
        labelNum.setHorizontalAlignment(SwingConstants.CENTER);

        // Janela Configs
        janela.setSize(800, 480);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new BorderLayout());

        // Botões
        buttonBack.setFont(fonteMedia);
        buttonReset.setFont(fonteMedia);
        buttonNext.setFont(fonteMedia);

        panel.add(buttonBack);
        panel.add(buttonReset);
        panel.add(buttonNext);

        // Adicionando na Janela
        janela.add(labelNum, BorderLayout.CENTER);
        janela.add(panel, BorderLayout.SOUTH);

        // Desenha a tela
        janela.setVisible(true);
    }
}
