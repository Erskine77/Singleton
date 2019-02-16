package org.erskineespaderos.view;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Ventana extends JFrame implements KeyListener {

    public Ventana() {
        this.setSize(600,400);
        this.setTitle("Ejemplo de Interfaces");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.addKeyListener(this);
        this.setVisible(true);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        //JOptionPane.showMessageDialog(null, "Code: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyPressed(KeyEvent e) {
        JOptionPane.showMessageDialog(null, "Code: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //JOptionPane.showMessageDialog(null, "Code: " + KeyEvent.getKeyText(e.getKeyCode()));
    }
    
}
