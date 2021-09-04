/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hr.mikec.jframe;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Frame extends JFrame{

    public Frame() {
        load();       
    }
    
    private void load(){
        
        this.setTitle("Title of JFrame");
        
        // what will happen when close button are clicked
        // DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, EXIT_ON_CLOSE
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // set the x-dimension, and y-dimension of frame
        this.setSize(400,400); 
        
        // making frame visible
        this.setVisible(true);
        
        // allow/prevent frame from being resized
        this.setResizable(false);
        
        // make frame not-clickable
        this.setEnabled(false);
        
        // create an ImageIcon and change icon of frame
        // image must be in root project's root folder
        ImageIcon image = new ImageIcon("logo.png");
        this.setIconImage(image.getImage());
        
        // change color of background
        this.getContentPane().setBackground(Color.RED); 
    }

}
