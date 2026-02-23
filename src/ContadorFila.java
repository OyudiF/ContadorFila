import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ContadorFila {

    private static int senhaA = 0;
    private static int senhaB = 0;

    private static final JLabel labelNumA = new JLabel("0", SwingConstants.CENTER);
    private static final JLabel labelNumB = new JLabel("0", SwingConstants.CENTER);

    private static void atualizar(JLabel label, int valor) {
        label.setText(String.valueOf(valor));
    }

    private static void avancarA() {
        atualizar(labelNumA, ++senhaA);
    }

    private static void voltarA() {
        if (senhaA > 0) atualizar(labelNumA, --senhaA);
    }

    private static void zerarA() {
        senhaA = 0;
        atualizar(labelNumA, senhaA);
    }

    private static void avancarB() {
        atualizar(labelNumB, ++senhaB);
    }

    private static void voltarB() {
        if (senhaB > 0) atualizar(labelNumB, --senhaB);
    }

    private static void zerarB() {
        senhaB = 0;
        atualizar(labelNumB, senhaB);
    }

    public static void main(String[] args) {

        JFrame janela = new JFrame("Contador de Senhas");
        janela.setSize(1280, 720);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new BorderLayout());

        Font fonteNumero = new Font("Arial", Font.BOLD, 600);
        Font fonteTitulo = new Font("Arial", Font.BOLD, 50);

        JLabel labelDemanda = new JLabel("Demanda", SwingConstants.CENTER);
        JLabel labelTEG = new JLabel("TEG", SwingConstants.CENTER);

        labelDemanda.setFont(fonteTitulo);
        labelTEG.setFont(fonteTitulo);

        labelNumA.setFont(fonteNumero);
        labelNumB.setFont(fonteNumero);
        labelNumA.setForeground(Color.RED);
        labelNumB.setForeground(Color.RED);

        JPanel painelA = new JPanel(new BorderLayout());
        painelA.add(labelDemanda, BorderLayout.NORTH);
        painelA.add(labelNumA, BorderLayout.CENTER);

        JPanel painelB = new JPanel(new BorderLayout());
        painelB.add(labelTEG, BorderLayout.NORTH);
        painelB.add(labelNumB, BorderLayout.CENTER);

        JPanel grid = new JPanel(new GridLayout(1, 2));
        grid.add(painelA);
        grid.add(painelB);

        JLabel assinatura = new JLabel("Desenvolvido por: Felipe Yudi");
        assinatura.setFont(new Font("Arial", Font.PLAIN, 12));
        assinatura.setForeground(Color.GRAY);

        JPanel rodape = new JPanel();
        rodape.add(assinatura);

        janela.add(grid, BorderLayout.CENTER);
        janela.add(rodape, BorderLayout.SOUTH);

        KeyboardFocusManager.getCurrentKeyboardFocusManager()
                .addKeyEventDispatcher(e -> {
                    if (e.getID() == KeyEvent.KEY_RELEASED) {
                        switch (e.getKeyCode()) {
                            case KeyEvent.VK_UP: avancarA(); break;
                            case KeyEvent.VK_DOWN: voltarA(); break;
                            case KeyEvent.VK_DELETE: zerarA(); break;
                            case KeyEvent.VK_W: avancarB(); break;
                            case KeyEvent.VK_S: voltarB(); break;
                            case KeyEvent.VK_D: zerarB(); break;
                        }
                    }
                    return false;
                });

        janela.setVisible(true);
    }
}