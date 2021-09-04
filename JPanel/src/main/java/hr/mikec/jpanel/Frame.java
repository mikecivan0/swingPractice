/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hr.mikec.jpanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class Frame {

    public Frame() {
        load();
    }

    private void load() {
        ImageIcon icon = new ImageIcon("logo.png");
        Border border = BorderFactory.createLineBorder(Color.BLUE, 2); // create 2px green boder
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setBorder(border);
        //if Layout of parent component is null - position and size of the label must be specified
        //label.setBounds(100,100,130,100);
        
        // overriding default position of BorderLayout of parent component
        // those settings have no imapact to FlowLayout of parent component
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.RIGHT);       
        
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,250,250);
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);
        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(null);
        // without specified Layout components are using FlowLayout
        // FlowLayout sets content in top-center position
        // BorderLayout sets content in center-left position if not specified different
        // with BorderLayout label will take as much space is possible
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        frame.setVisible(true);
    }

    
}
