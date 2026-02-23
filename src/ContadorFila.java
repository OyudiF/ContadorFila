/**
 * Contador de Senhas
 * @author Felipe Yudi F. Ochiai
 * @since 23/02/2026
 * @version 1.0
 */

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorFila {
    // Vars App
    static int senha = 0;

    public static void main(String[] args) {

        // Vars do Swing
        JFrame janela = new JFrame("Contador de Senhas");
        JLabel labelNum = new JLabel("0");
        JLabel labelText = new JLabel("Próxima Senha");
        JLabel labelAssinatura = new JLabel("Desenvolvido por: Felipe Yudi");
        JPanel panel = new JPanel();
        JPanel panelContainer = new JPanel();
        JButton buttonNext = new JButton("Avançar");
        JButton buttonBack = new JButton("Voltar");
        JButton buttonReset = new JButton("Zerar");
        Font fonteMaior = new Font("Arial", Font.BOLD, 80);
        Font fonteMedia = new Font("Arial", Font.BOLD, 35);

        // Configurando labels
        labelNum.setFont(fonteMaior);
        labelNum.setHorizontalAlignment(SwingConstants.CENTER);
        labelText.setFont(fonteMedia);
        labelText.setHorizontalAlignment(SwingConstants.CENTER);

        // Janela Configs
        janela.setSize(800, 480);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new BorderLayout());
        janela.setBackground(Color.WHITE);

        // Botões
        buttonBack.setFont(fonteMedia);
        buttonBack.setFocusPainted(false);
        buttonBack.setBackground(Color.WHITE);
        buttonBack.setForeground(Color.BLACK);
        buttonBack.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(Color.DARK_GRAY),
                new EmptyBorder(8, 15, 8, 15)));

        buttonReset.setFont(fonteMedia);
        buttonReset.setFocusPainted(false);
        buttonReset.setBackground(Color.WHITE);
        buttonReset.setForeground(Color.BLACK);
        buttonReset.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(Color.DARK_GRAY),
                new EmptyBorder(8, 15, 8, 15)));

        buttonNext.setFont(fonteMedia);
        buttonNext.setFocusPainted(false);
        buttonNext.setBackground(Color.WHITE);
        buttonNext.setForeground(Color.BLACK);
        buttonNext.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(Color.DARK_GRAY),
                new EmptyBorder(8, 15, 8, 15)));


        panel.add(buttonBack);
        panel.add(buttonReset);
        panel.add(buttonNext);

        // Assinatura
        panelContainer.setLayout(new BoxLayout(panelContainer, BoxLayout.Y_AXIS));
        labelAssinatura.setFont(new Font("Arial", Font.PLAIN, 12));
        labelAssinatura.setForeground(Color.GRAY);
        labelAssinatura.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelContainer.add(panel);
        panelContainer.add(Box.createRigidArea(new Dimension(0, 5)));
        panelContainer.add(labelAssinatura);

        // Adicionando na Janela
        janela.add(labelNum, BorderLayout.CENTER);
        janela.add(labelText, BorderLayout.NORTH);
        janela.add(panelContainer, BorderLayout.SOUTH);

        // Metodo dos botões
        buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                senha += 1;
                labelNum.setText(senha + "");
            }
        });

        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(senha > 0) {
                    senha -= 1;
                    labelNum.setText(senha + "");
                }
            }
        });

        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                senha = 0;
                labelNum.setText(senha + "");
            }
        });

        // Desenha a tela
        janela.setVisible(true);
    }
}
