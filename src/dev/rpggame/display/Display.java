/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dev.rpggame.display;

import javax.swing.JFrame;

/**
 *
 * @author douglas
 * @version 1-05/09/2016
 * @languageOfComments: Portuguese
 */
public class Display {
    private JFrame frame;
    
    private String titulo;
    private int larg, alt;
    
    public Display(String titulo, int larg, int alt){
        this.titulo=titulo;
        this.alt=alt;
        this.larg=larg;
        
        criarDisplay();
    }
    
    private void criarDisplay(){
        frame = new JFrame(titulo);
        frame.setSize(alt, larg);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
