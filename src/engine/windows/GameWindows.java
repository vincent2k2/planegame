/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine.windows;


import java.awt.*;
import java.awt.event.WindowAdapter;

/**
 * @author Tdh4vn
 */
public class GameWindows extends Frame implements Runnable {


    public GameWindows() {
        super();
        this.setTitle("Techdee");
        this.setFocusable(true);
        this.setSize(480, 800);
        this.setVisible(true);
        this.setResizable(false);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                super.windowClosing(e);
                dispose();
            }
        });
    }


    @Override
    public void update(Graphics g) {
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(100, 100, 200, 200);
    }

    @Override
    public void run() {
        while (true) {
            repaint();
        }
    }

    public void start() {
        Thread mainThread = new Thread(this);
        mainThread.start();
    }
}
