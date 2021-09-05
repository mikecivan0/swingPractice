/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hr.mikec.jbutton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;
    
    public Frame() {
        load();
    }

    private void load() {
       ImageIcon icon = new ImageIcon("logo.png");
        
       label = new JLabel();
       label.setIcon(icon);
       label.setBounds(150,250,150,150);
       label.setVisible(false);
       
       button = new JButton();
       button.setBounds(200, 200, 100, 60);
       button.addActionListener(this);
       button.setText("Click me");
       button.setFocusable(false); // remove border around text in the button
       button.setIcon(icon);
       button.setHorizontalTextPosition(JButton.CENTER);
       button.setVerticalTextPosition(JButton.BOTTOM);
       button.setFont(new Font("Comic Sans", Font.BOLD, 18));
       button.setIconTextGap(-7); // set distance between icon and text
       button.setForeground(Color.GRAY);
       button.setBackground(Color.WHITE);
       button.setBorder(BorderFactory.createEtchedBorder());
       
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(null);
       this.setSize(500,500);
       this.add(button);
       this.add(label);
       this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            label.setVisible(!label.isVisible()); // toggling label visibility                    
            // button.setEnabled(false); //makes that button is clickable only once
        }
    }
    
    

    
}
