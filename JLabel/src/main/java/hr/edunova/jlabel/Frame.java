/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hr.edunova.jlabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class Frame {

    public Frame() {
        load();
    }

    private void load() {
        ImageIcon icon = new ImageIcon("logo.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN, 2); // create 2px green boder
    
        JLabel label = new JLabel(); // create a label
        label.setText("Text"); // set the text of label
        label.setIcon(icon); // set image in label
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER or RIGHT of img
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER or BOTTOM of img
        label.setForeground(Color.RED); // set font color
        label.setFont(new Font("MV Boli", Font.PLAIN, 18)); // set font of text
        label.setIconTextGap(-15); // set gap of text to img
        label.setBackground(Color.BLACK); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border); // set border
        
        /* set position */
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of img+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of img+text within label
        // or
        
        //label.setSize(250,250);
       // label.setBounds(50,50,350,350); // set x,y position within the frame, and dimension of label 
        /* end set position */
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
       // frame.setLayout(null); // set free style position of components
       // in case when label size is not set and without setLayout - label will take all possible space in frame
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // use only when setBounds and setLayout are not used, this resize the frame depend of child components total size
        // this override frame.setSize(), label.setSize() and label.setBouns()
    }

    
}
