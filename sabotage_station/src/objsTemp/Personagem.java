package objsTemp;

import javax.swing.JButton;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;

public class Personagem extends JButton {

    private int altura = 500;
    private boolean subindo = false;
    private boolean caindo = false;
    private int gravidade = 1;
    private int forcapulo = -25;
    private int velocidade_ver = 0;

    public Personagem() {
        setText("Personagem");
        setBounds(300, altura, 100, 100);
        setFocusable(true);

        Timer timer = new Timer(20, e -> atualizarPulo());
        timer.start();

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_A:
                        setLocation(getX() - 20, getY());
                        break;
                    case KeyEvent.VK_D:
                        setLocation(getX() + 20, getY());
                        break;
                    case KeyEvent.VK_W:

                        if (!caindo && !subindo) {
                            subindo = true;
                            velocidade_ver = forcapulo;
                        }
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public void atualizarPulo() {
        if (subindo) {
            altura += velocidade_ver;
            velocidade_ver++;

            if (altura <= 300) {
                subindo = false;
                caindo = true;
            }
        }

        if (caindo) {
            velocidade_ver += gravidade;
            altura += velocidade_ver;

            if (altura >= 500) {
                altura = 500;
                caindo = false;
                velocidade_ver = 0;
            }
        }

        setLocation(getX(), altura);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Add um sprite depois
    }

}
