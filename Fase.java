import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Fase extends JPanel{
    private Image fundo;

    public Fase()
    {
        ImageIcon referencia = new ImageIcon("C:/Users/verid/Documents/Pasta do Levi/Imagens/fundo.jpg");
        this.fundo = referencia.getImage();
        this.setPreferredSize(new Dimension(1280, 720));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.setVisible(true);
    }
}
